package com.example.wishlist3.controller

import com.example.wishlist3.model.Item
import com.example.wishlist3.service.ItemService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/items")
class ItemController(private val itemService: ItemService) {

    @GetMapping
    fun getItems():List<Item>{
        return itemService.getItems()
    }

    @PostMapping
    fun addItem(@RequestBody item: Item): Item {
        return itemService.addItem(item.name)
    }

    @DeleteMapping("/{id}")
    fun deleteItem(@PathVariable id: Long): String {
        itemService.deleteItem(id)
        return "Item deleted"
    }

}