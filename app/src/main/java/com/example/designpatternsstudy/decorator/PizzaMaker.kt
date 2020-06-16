package com.example.designpatternsstudy.decorator

import android.util.Log

class PizzaMaker {

    fun getPizza() = Cheese(Bacon(PlainPizza()))
}