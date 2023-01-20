package com.independed.cleanshopping.domain

import com.independed.cleanshopping.`interface`.ShoppingListRepository

class AddItemUseCase(private val shoppingListRepository: ShoppingListRepository) {
    fun addElement(shopItem: ShopItem){
        shoppingListRepository.addElement(shopItem)
    }
}