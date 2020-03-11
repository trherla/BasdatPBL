package com.example.basdatpbl.ui.kuis;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KuisViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KuisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Kuis fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}