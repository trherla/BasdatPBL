package com.herla.basdatpbl.ui.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.herla.basdatpbl.R;

public class InfoFragment extends Fragment{


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_info, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();


        return root;
    }

}
