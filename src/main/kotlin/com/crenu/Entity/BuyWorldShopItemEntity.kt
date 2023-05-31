package com.crenu.Entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "buyworldshopitem")
data class BuyWorldShopItemEntity(
    @Id
    val userId: Long,
    val nickName: String,
    val timeStamp: String,
    val itemName: String,
    val buyCount: Int,
    val price: Int
)