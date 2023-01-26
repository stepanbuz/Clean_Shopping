package com.independed.cleanshopping.domain

import com.independed.cleanshopping.`interface`.ShoppingListRepository

class GetShoppingListUseCase(private val shoppingListRepository: ShoppingListRepository) {

    fun getShoppingList()  : List<ShopItem> {
        return shoppingListRepository.getShoppingList()
    }
}