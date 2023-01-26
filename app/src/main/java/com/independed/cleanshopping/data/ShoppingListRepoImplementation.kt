package com.independed.cleanshopping.data

import com.independed.cleanshopping.`interface`.ShoppingListRepository
import com.independed.cleanshopping.domain.ShopItem

object ShoppingListRepoImplementation: ShoppingListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var autoCounterId = 0

    override fun addElement(shopItem: ShopItem) {
        if(shopItem.id==ShopItem.UNDEFINED_ID){
            shopItem.id = autoCounterId++
        }
        shopList.add(shopItem)
    }

    override fun deleteItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editItem(shopItem: ShopItem) {
        val oldItem = (getItem(shopItem.id))
        deleteItem(oldItem)
        addElement(shopItem)

    }

    override fun getItem(shopItemId: Int): ShopItem {
        return shopList.find { it.id==shopItemId}?: throw RuntimeException("Id isn't found")
    }

    override fun getShoppingList(): List<ShopItem> {
        return shopList
    }

}