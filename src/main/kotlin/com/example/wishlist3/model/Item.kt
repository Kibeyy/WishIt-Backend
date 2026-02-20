package com.example.wishlist3.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Item(
    @Id
    @GeneratedValue
    val id:Long = 0
    ,val name:String
)