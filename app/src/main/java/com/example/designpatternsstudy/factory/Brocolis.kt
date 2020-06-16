package com.example.designpatternsstudy.factory

class Brocolis: Vegetable() {

    override var requiresCooking = true
    override var timeOfPreparation: Long = 10
    override var calories: Long = 50
    override var name: String = "Brocolis"
}