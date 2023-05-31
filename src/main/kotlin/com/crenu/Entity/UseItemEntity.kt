package com.crenu.Entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Time

@Entity
@Table(name = "useitem")
data class UseItemEntity(
    @Id
    val userId: String,
    val nickName : String,
    val timeStamp: String,
    val itemaname : String,
    val useCount : Int
)
