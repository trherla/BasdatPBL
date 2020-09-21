package com.herla.basdatpbl.ui.materi.erd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.herla.basdatpbl.R;

public class Tabs3ERD extends Fragment {

    public Tabs3ERD() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root;
        root = inflater.inflate(R.layout.erd_tabs3, container, false);



        return root;
    }

}