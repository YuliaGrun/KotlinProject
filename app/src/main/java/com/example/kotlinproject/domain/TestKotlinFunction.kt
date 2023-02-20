package com.example.kotlinproject.domain

object TestKotlinFunction {

    fun cycle_1(){
        for (i in 0..5)
            println(i)
    }
    fun cycle_2(){
        for(i in 100 downTo 0 step 5)
            println(i)
    }
    fun cycle_3(){
        for (i in 3 until 7)
            println(i)
    }
}