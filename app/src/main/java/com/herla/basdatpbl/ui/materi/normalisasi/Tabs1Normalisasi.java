package com.herla.basdatpbl.ui.materi.normalisasi;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.herla.basdatpbl.R;

public class Tabs1Normalisasi extends Fragment {

    public Tabs1Normalisasi() {
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
        View rootView = inflater.inflate(R.layout.normalisasi_tabs1, container, false);

        ImageButton button = rootView.findViewById(R.id.button_vid_normalisasi);
        button.setOnClickListener(v -> video());
        return rootView;
    }
    public void video(){
        Intent selesai = new Intent(getActivity(), VideoPlayerNormalisasi.class);
        startActivity(selesai);
    }
}