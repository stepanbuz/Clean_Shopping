package com.independed.cleanshopping.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val status: Boolean,
    var id: Int = UNDEFINED_ID
    )

{
    companion object{
        const val UNDEFINED_ID = -1
    }
}
