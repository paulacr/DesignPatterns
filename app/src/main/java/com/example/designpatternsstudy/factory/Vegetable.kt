package com.example.designpatternsstudy.factory

import android.util.Log

abstract class Vegetable {
    open var requiresCooking = true
    open var timeOfPreparation: Long = 0
    open var calories: Long = 0
    abstract var name: String

    fun prepareFood() {
        Log.i("Preparing $name", "will take $timeOfPreparation minutes")
    }

    fun saveConsumedCalories() {
        Log.i("Saving calories", "meal calories consumed $calories calories")
    }
}