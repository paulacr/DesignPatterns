package com.example.designpatternsstudy.decorator

abstract class ToppingDecorator(private val newPizza: Pizza) : Pizza {

    var tempPizza = newPizza

    override fun getDescription(): String = newPizza.getDescription()

    override fun getCost(): Double = newPizza.getCost()
}