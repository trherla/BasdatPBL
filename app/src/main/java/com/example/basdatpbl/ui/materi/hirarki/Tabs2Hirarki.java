package com.example.basdatpbl.ui.materi.hirarki;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.basdatpbl.R;
import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class Tabs2Hirarki extends Fragment {

    public Tabs2Hirarki() {
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
        //        YouTubePlayerView youTubePlayerView = root.findViewById(R.id.tabs2_hirarki);
//        getLifecycle().addObserver(youTubePlayerView);


        return inflater.inflate(R.layout.hirarki_tabs2, container, false);


    }

}