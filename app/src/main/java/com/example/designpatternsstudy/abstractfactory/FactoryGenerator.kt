package com.example.designpatternsstudy.abstractfactory

class FactoryGenerator {

    fun getFactory(factory: String): AbstractFactory? {

        if (factory == "BRE") {
            return BreadFactory()
        }
        return null
    }
}