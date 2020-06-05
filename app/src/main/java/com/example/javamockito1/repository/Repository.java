package com.example.javamockito1.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

public class Repository {

    public MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

    public Integer getNumberOfLeafs() {
        return 5;
    }


    public String getString() {
        return "Not called";
    }
}
