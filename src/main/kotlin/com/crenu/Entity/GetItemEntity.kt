package com.crenu.Entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Time

@Entity
@Table(name = "getitem")
data class GetItemEntity (
    @Id
    val userId: String,
    val nickName : String,
    val timeStamp: String,
    val itemaname : String,
    val getCount : Int
)
