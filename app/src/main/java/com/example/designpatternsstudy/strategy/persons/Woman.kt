package com.example.designpatternsstudy.strategy.persons

import android.util.Log
import com.example.designpatternsstudy.strategy.interfaces.Candidate
import com.example.designpatternsstudy.strategy.interfaces.Genre
import com.example.designpatternsstudy.strategy.interfaces.GenreInterface
import com.example.designpatternsstudy.strategy.interfaces.VoteInterface
import com.example.designpatternsstudy.strategy.persons.Person

class Woman: Person(), VoteInterface, GenreInterface {

    override fun getGenre(): Genre {
        return Genre.WOMAN
    }

    override fun vote(candidate: Candidate, genre: Genre) {
        Log.i("computing Vote", "genre : $genre")
    }
}