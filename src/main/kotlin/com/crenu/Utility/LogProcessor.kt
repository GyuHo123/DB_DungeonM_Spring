package com.crenu.Utility

import com.crenu.Entity.*
import com.crenu.Service.*
import java.io.File

class LogProcessor(
    private val getItemService: GetItemService,
    private val useItemService: UseItemService,
    private val getConsumeItemService: GetConsumeItemService,
    private val useConsumeItemService: UseConsumeItemService,
    private val buyWorldShopItemService: BuyWorldShopItemService
) {
    private val itemPrices: Map<String, Int>

    init {
        itemPrices = loadItemPricesFromCsv("WorldShopData.csv")
    }

    fun processLogFile(file: File) {
        file.forEachLine { line ->
            val parts = line.split(" : ")
            val time = parts[0]
            val logData = parts[1]

            val action = logData.substringBefore("-")
            val userInfo = logData.substringAfter("-").substringBeforeLast("-")
            val itemName = logData.substringAfterLast("-").substringBeforeLast("(").trim()
            val count = logData.substringAfterLast("(").substringBefore(")").trim().toInt()

            val nickName = userInfo.substringBefore("(")
            val userId = userInfo.substringAfter("(").substringBefore(")")

            when (action) {
                "아이템획득" -> {
                    val getItemEntity = GetItemEntity(userId, nickName, time, itemName, count)
                    getItemService.saveGetItem(getItemEntity)
                }
                "아이템소비" -> {
                    val useItemEntity = UseItemEntity(userId, nickName, time, itemName, count)
                    useItemService.saveUseItem(useItemEntity)
                }
                "소비아이템획득" -> {
                    val getConsumeItemEntity = GetConsumeItemEntity(userId.toLong(), nickName, time, itemName, count)
                    getConsumeItemService.saveGetConsumeItem(getConsumeItemEntity)
                }
                "소비아이템소비" -> {
                    val useConsumeItemEntity = UseConsumeItemEntity(userId.toLong(), nickName, time, itemName, count)
                    useConsumeItemService.saveUseConsumeItem(useConsumeItemEntity)
                }
                "월드샵아이템구매" -> {
                    val price = itemPrices[itemName] ?: 0
                    val buyWorldShopItemEntity = BuyWorldShopItemEntity(userId.toLong(), nickName, time, itemName, count, price)
                    buyWorldShopItemService.saveBuyWorldShopItem(buyWorldShopItemEntity)
                }
            }

            }
        }
    }

    private fun loadItemPricesFromCsv(filePath: String): Map<String, Int> {
        val file = File(filePath)
        if (!file.exists()) throw IllegalArgumentException("File does not exist: $filePath")

        val itemPrices = mutableMapOf<String, Int>()
        file.forEachLine { line ->
            val parts = line.split(",")  // Assuming items and prices are separated by commas
            val itemName = parts[0].trim()
            val itemPrice = parts[3].trim().toIntOrNull()
            if (itemPrice != null) itemPrices[itemName] = itemPrice
        }
        return itemPrices
    }

