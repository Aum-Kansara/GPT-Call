package com.example.gpt_call.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> button;

    public HomeViewModel() {
        button = new MutableLiveData<>();
        button.setValue("Call ChatGPT");
    }

    public LiveData<String> getText() {
        return button;
    }
}