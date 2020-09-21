package com.herla.basdatpbl.ui.materi.ketergantungan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.herla.basdatpbl.R;

public class DescriptionKetergantungan extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.description_ketergantungan, container, false);

        return rootView;
    }
}