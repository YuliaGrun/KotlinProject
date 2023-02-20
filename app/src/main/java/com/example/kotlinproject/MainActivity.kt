package com.example.kotlinproject

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinproject.domain.Film
import com.example.kotlinproject.domain.TestKotlinFunction
import com.example.kotlinproject.domain.TestObject

class MainActivity : AppCompatActivity() {

    private val film: Film = Film("Harry Potter: The Complete Series", 2001)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestKotlinFunction.cycle_1()
        TestKotlinFunction.cycle_2()
        TestKotlinFunction.cycle_3()

    }

    fun onButtonClick(view: View) {
        Toast.makeText(this, R.string.testClick,Toast.LENGTH_SHORT).show()
    }

    fun onNameButton(view: View) {
        Toast.makeText(this,film.name,Toast.LENGTH_SHORT).show()
    }
    fun onYearButton(view: View) {
        Toast.makeText(this,film.year,Toast.LENGTH_SHORT).show()
    }

    fun clickTestObject(view: View) {
        Toast.makeText(this, TestObject.copy(film), Toast.LENGTH_SHORT).show()
    }



}