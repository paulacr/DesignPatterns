package com.example.designpatternsstudy.decorator

class Bacon(private val pizza: Pizza) : ToppingDecorator(pizza) {

    override fun getDescription(): String =
        tempPizza.getDescription().plus(" + bacon")

    override fun getCost(): Double =
            tempPizza.getCost().plus(1)
}