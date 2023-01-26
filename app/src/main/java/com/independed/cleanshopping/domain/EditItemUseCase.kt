package com.independed.cleanshopping.domain

import com.independed.cleanshopping.`interface`.ShoppingListRepository

class EditItemUseCase(private val shoppingListRepository: ShoppingListRepository) {

    fun editItem(shopItem: ShopItem){

        shoppingListRepository.editItem(shopItem)
    }
}