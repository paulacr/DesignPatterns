package com.example.designpatternsstudy.factory

class VegetableFactory(private val requiresCooking: Boolean) {

    fun cookVegetable(): Vegetable = if (requiresCooking) Brocolis() else Rucula()
}