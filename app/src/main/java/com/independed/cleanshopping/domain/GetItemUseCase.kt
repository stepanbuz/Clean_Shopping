package com.independed.cleanshopping.domain

import com.independed.cleanshopping.`interface`.ShoppingListRepository

class GetItemUseCase(private val shoppingListRepository: ShoppingListRepository) {

    fun getItem(shopItemId: Int):ShopItem{
        return shoppingListRepository.getItem(shopItemId)
    }
}