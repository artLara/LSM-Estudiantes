package com.matur.lsmestudiantes

class Topic (var use: Boolean, val name: String, val wordsList: List<String>, val wordsIds: HashMap<String, Int>){
    @JvmName("getName1")
    fun getName(): String{
        return this.name
    }

}