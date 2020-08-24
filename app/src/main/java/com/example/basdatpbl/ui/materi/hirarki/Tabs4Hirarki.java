package com.example.basdatpbl.ui.materi.hirarki;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.basdatpbl.R;

public class Tabs4Hirarki extends Fragment {
    public Tabs4Hirarki() {
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

        View rootView = inflater.inflate(R.layout.hirarki_tabs4, container, false);


        ImageButton button = rootView.findViewById(R.id.button_vid);
        button.setOnClickListener(v -> video());
        return rootView;

    }
    public void video(){
        Intent selesai = new Intent(getActivity(), VideoPlayerHirarki.class);
        startActivity(selesai);
    }
}