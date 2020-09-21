package com.herla.basdatpbl.ui.awal;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.herla.basdatpbl.R;

public class AwalViewModel extends RecyclerView.ViewHolder {

    private MutableLiveData<String> mText;
    public TextView awal_title ;
    public ImageView awal_img;
    Context context;
    public AwalViewModel(View itemView) {
        super(itemView);
        context = itemView.getContext();

        awal_title = (TextView) itemView.findViewById(R.id.awal_text);
        awal_img = (ImageView) itemView.findViewById(R.id.awal_img);
    }

    public LiveData<String> getText() {
        return mText;
    }
}