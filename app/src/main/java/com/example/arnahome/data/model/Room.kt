package com.example.arnahome.data.model

class Room : ArrayList<Room.RoomItem>(){
    data class RoomItem(
        var id: Int?,
        var itemCategories: List<ItemCategory?>?,
        var name: String?
    ) {
        data class ItemCategory(
            var category: Category?
        ) {
            data class Category(
                var id: Int?,
                var name: String?
            )
        }
    }
}