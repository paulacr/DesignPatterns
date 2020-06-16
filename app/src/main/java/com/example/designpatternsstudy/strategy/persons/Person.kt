package com.example.designpatternsstudy.strategy.persons

open class Person {

    fun getClassName() = this::class.simpleName?: ""
}