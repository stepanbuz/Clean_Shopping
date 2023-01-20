package com.independed.cleanshopping.`interface`

import com.independed.cleanshopping.domain.ShopItem

interface ShoppingListRepository {

    fun addElement(shopItem: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getItem(shopItem: ShopItem)

    fun getShoppingList() : List<ShopItem>

}