package com.crenu.Entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "useconsumeitem")
data class UseConsumeItemEntity(
    @Id
    val userId: Long,
    val nickName: String,
    val timeStamp: String,
    val itemName: String,
    val useCount: Int
)