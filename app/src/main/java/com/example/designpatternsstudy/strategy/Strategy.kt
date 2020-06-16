package com.example.designpatternsstudy.strategy

import com.example.designpatternsstudy.strategy.interfaces.Candidate
import com.example.designpatternsstudy.strategy.interfaces.Genre
import com.example.designpatternsstudy.strategy.interfaces.VoteInterface

class Strategy(private val voteInterface: VoteInterface) {

    fun voteByStrategy(candidate: Candidate, genre: Genre) {
        voteInterface.vote(candidate, genre)
    }

}