package com.crenu.Repository

import com.crenu.Entity.BuyWorldShopItemEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BuyWorldShopItemRepository : JpaRepository<BuyWorldShopItemEntity, Long>