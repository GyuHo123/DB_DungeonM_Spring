package com.crenu.Controller

import com.crenu.Entity.*
import com.crenu.Service.*
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class GameController(
    private val getItemService: GetItemService,
    private val useItemService: UseItemService,
    private val getConsumeItemService: GetConsumeItemService,
    private val useConsumeItemService: UseConsumeItemService,
    private val buyWorldShopItemService: BuyWorldShopItemService
) {
    @PostMapping("/getItem")
    fun saveGetItem(@RequestBody getItemEntity: GetItemEntity): ResponseEntity<String> {
        getItemService.saveGetItem(getItemEntity)
        return ResponseEntity.ok("GetItem saved successfully")
    }

    @PostMapping("/useItem")
    fun saveUseItem(@RequestBody useItemEntity: UseItemEntity): ResponseEntity<String> {
        useItemService.saveUseItem(useItemEntity)
        return ResponseEntity.ok("UseItem saved successfully")
    }

    @PostMapping("/getConsumeItem")
    fun saveGetConsumeItem(@RequestBody getConsumeItemEntity: GetConsumeItemEntity): ResponseEntity<String> {
        getConsumeItemService.saveGetConsumeItem(getConsumeItemEntity)
        return ResponseEntity.ok("GetConsumeItem saved successfully")
    }

    @PostMapping("/useConsumeItem")
    fun saveUseConsumeItem(@RequestBody useConsumeItemEntity: UseConsumeItemEntity): ResponseEntity<String> {
        useConsumeItemService.saveUseConsumeItem(useConsumeItemEntity)
        return ResponseEntity.ok("UseConsumeItem saved successfully")
    }

    @PostMapping("/buyWorldShopItem")
    fun saveBuyWorldShopItem(@RequestBody buyWorldShopItemEntity: BuyWorldShopItemEntity): ResponseEntity<String> {
        buyWorldShopItemService.saveBuyWorldShopItem(buyWorldShopItemEntity)
        return ResponseEntity.ok("BuyWorldShopItem saved successfully")
    }
}
