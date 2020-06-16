package com.example.designpatternsstudy.factory

class Rucula: Vegetable() {

    override var requiresCooking = false
    override var timeOfPreparation: Long = 2
    override var calories: Long = 10
    override var name: String = "Rucula"
}