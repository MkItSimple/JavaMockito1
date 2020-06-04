package com.example.javamockito1.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

public class Repository {

    public MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

    public MutableLiveData<String> getMutableLiveData(String name, String pass) {
        mutableLiveData.setValue("name is "+name+" pass is "+pass);
        return mutableLiveData;
    }
}
