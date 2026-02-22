package com.example.wishlist3.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Version

@Entity
data class Item(
    @Id
    @GeneratedValue
    val id:Long = 0
    ,val name:String,
    @Version
val version: Long = 0
)