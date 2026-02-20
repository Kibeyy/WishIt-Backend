package com.example.wishlist3.model

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository:JpaRepository<Item,Long> {
}