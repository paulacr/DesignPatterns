package com.example.designpatternsstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.designpatternsstudy.factory.VegetableFactory
import com.example.designpatternsstudy.strategy.*
import com.example.designpatternsstudy.strategy.interfaces.Candidate
import com.example.designpatternsstudy.strategy.persons.Man
import com.example.designpatternsstudy.strategy.persons.Woman

class MainActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        executeFactoryPattern()
        executeStrategyPattern()
    }

    private fun executeFactoryPattern() {
        VegetableFactory(false).cookVegetable().prepareFood()
    }

    private fun executeStrategyPattern() {
        val man = Man()
        val woman = Woman()

        val manStrategy = Strategy(man)
        val womanStrategy = Strategy(Woman())

        manStrategy.voteByStrategy(Candidate.CANDITATE_1, man.getGenre())
        womanStrategy.voteByStrategy(Candidate.CANDITATE_3, woman.getGenre())
    }

}