package com.independed.cleanshopping.domain

import com.independed.cleanshopping.`interface`.ShoppingListRepository

class DeleteItemUseCase(private val shoppingListRepository: ShoppingListRepository) {

    fun deleteItem(shopItem: ShopItem){
        shoppingListRepository.deleteItem(shopItem)
    }
}