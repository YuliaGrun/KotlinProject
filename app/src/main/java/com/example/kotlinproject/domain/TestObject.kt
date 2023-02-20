package com.example.kotlinproject.domain

class TestObject {
    companion object{
        fun copy(film:Film) = film.name+" "+film.year

    }
}