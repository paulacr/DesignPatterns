package com.example.designpatternsstudy.abstractfactory

class BreadFactory: AbstractFactory() {
    override fun getBread(bread: String): Bread =
        when (bread) {
            "BAG" -> Baguete()
            "BRI" -> Brioche()
            else -> throw Exception("Not a bread type")
        }
}