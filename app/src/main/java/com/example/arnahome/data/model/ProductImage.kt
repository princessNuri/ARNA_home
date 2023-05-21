package com.example.arnahome.data.model

class ProductImage : ArrayList<ProductImage.ProductImageItem>(){
    data class ProductImageItem(
        var colorHex: String?,
        var images: List<Image?>?
    ) {
        data class Image(
            var default: Boolean?,
            var id: String?,
            var url: String?
        )
    }
}