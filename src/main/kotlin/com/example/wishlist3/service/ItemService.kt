package com.example.wishlist3.service

import com.example.wishlist3.model.Item
import com.example.wishlist3.model.ItemRepository
import org.springframework.stereotype.Service

@Service
class ItemService(private val itemRepository: ItemRepository) {

    fun getItems():List<Item>{
        return itemRepository.findAll()
    }

    fun addItem(name:String): Item {
        return itemRepository.save(Item(name = name))
    }

    fun deleteItem(id:Long){
        itemRepository.deleteById(id)
    }

}