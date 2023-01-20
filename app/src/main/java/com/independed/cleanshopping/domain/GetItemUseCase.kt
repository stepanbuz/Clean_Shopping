package com.independed.cleanshopping.domain

import com.independed.cleanshopping.`interface`.ShoppingListRepository

class GetItemUseCase(private val shoppingListRepository: ShoppingListRepository) {

    fun getItem(shopItem: ShopItem){
        shoppingListRepository.getItem(shopItem)
    }
}