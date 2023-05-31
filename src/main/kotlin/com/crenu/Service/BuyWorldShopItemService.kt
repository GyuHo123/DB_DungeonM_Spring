package com.crenu.Service

import com.crenu.Entity.BuyWorldShopItemEntity
import com.crenu.Repository.BuyWorldShopItemRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BuyWorldShopItemService(private val buyWorldShopItemRepository: BuyWorldShopItemRepository) {
    @Transactional
    fun saveBuyWorldShopItem(buyWorldShopItemEntity: BuyWorldShopItemEntity) {
        buyWorldShopItemRepository.save(buyWorldShopItemEntity)
    }
}