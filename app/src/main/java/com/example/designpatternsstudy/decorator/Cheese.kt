package com.example.designpatternsstudy.decorator

class Cheese(private val pizza: Pizza) : ToppingDecorator(pizza) {

    override fun getDescription(): String =
        tempPizza.getDescription().plus(" + cheese")

    override fun getCost(): Double =
            tempPizza.getCost().plus(1.2)
}