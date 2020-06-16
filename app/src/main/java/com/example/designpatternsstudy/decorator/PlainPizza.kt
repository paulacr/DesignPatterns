package com.example.designpatternsstudy.decorator

class PlainPizza : Pizza {
    override fun getDescription(): String {
        return "Thin dough"
    }

    override fun getCost(): Double {
        return 4.00
    }
}