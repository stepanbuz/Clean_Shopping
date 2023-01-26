package com.independed.cleanshopping.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.independed.cleanshopping.data.ShoppingListRepoImplementation
import com.independed.cleanshopping.domain.DeleteItemUseCase
import com.independed.cleanshopping.domain.EditItemUseCase
import com.independed.cleanshopping.domain.GetShoppingListUseCase
import com.independed.cleanshopping.domain.ShopItem

class MainActivityViewModel:ViewModel() {

    private val repository = ShoppingListRepoImplementation

    private val getShoppingListUseCase = GetShoppingListUseCase(repository)
    private val deleteItemUseCase = DeleteItemUseCase(repository)
    private val editItemUseCase = EditItemUseCase(repository)

    val shopList = MutableLiveData<List<ShopItem>>()

    fun getList(){
        val list = getShoppingListUseCase.getShoppingList()
        shopList.value = list
    }

    fun deleteItem(shopItem: ShopItem){
        deleteItemUseCase.deleteItem(shopItem)
        getList()
    }

    fun changeState(shopItem: ShopItem){
        val newItem=shopItem.copy(status =! shopItem.status)
        editItemUseCase.editItem(newItem)
        getList()
    }

}