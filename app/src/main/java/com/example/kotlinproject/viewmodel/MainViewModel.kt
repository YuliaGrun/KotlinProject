package com.example.kotlinproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Thread.sleep

class MainViewModel(private val liveData:MutableLiveData<AppState> = MutableLiveData()): ViewModel(){

    fun getData():LiveData<AppState>{
        return liveData
    }

    fun getFilms(){
        Thread{
            liveData.postValue(AppState.Loading(process = 0))
            sleep(2000L)
            liveData.postValue(AppState.Success(Any()))
        }.start()
    }

}