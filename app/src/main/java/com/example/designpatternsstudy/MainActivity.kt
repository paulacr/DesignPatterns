package com.example.designpatternsstudy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.designpatternsstudy.abstractfactory.FactoryGenerator
import com.example.designpatternsstudy.decorator.PizzaMaker
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
        executeAbstractFactoryPattern()
        executeDecoratorPattern()
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

    private fun executeAbstractFactoryPattern() {
        val breadFactory = FactoryGenerator().getFactory("BRE")
        val bread = breadFactory?.getBread("BRI")
        Log.i("Abstract Factory P.", "Bread name ${bread?.name()}")
    }

    private fun executeDecoratorPattern() {
        val pizza = PizzaMaker().getPizza()
        Log.i("Decorator pattern", "pizza description: ${pizza.getDescription()}")
        Log.i("Decorator pattern", "pizza cost: ${pizza.getCost()}")

    }

}