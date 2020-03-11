package com.example.basdatpbl.ui.awal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AwalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AwalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Awal fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}