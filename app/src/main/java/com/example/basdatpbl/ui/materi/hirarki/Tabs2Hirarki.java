package com.example.basdatpbl.ui.materi.hirarki;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.basdatpbl.R;
import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Tabs2Hirarki extends Fragment  implements View.OnClickListener {

    public Tabs2Hirarki() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public ExpandableRelativeLayout mExpandLayout1;
    public ExpandableRelativeLayout mExpandLayout2;
    public ExpandableRelativeLayout mExpandLayout3;

    public LinearLayout linearLayout1;
    public LinearLayout linearLayout2;
    public LinearLayout linearLayout3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.hirarki_tabs2, container, false);
        YouTubePlayerView youTubePlayerView = root.findViewById(R.id.tabs2_hirarki);
        getLifecycle().addObserver(youTubePlayerView);

        mExpandLayout1 = (ExpandableRelativeLayout) root.findViewById(R.id.expen1);
        mExpandLayout2 = (ExpandableRelativeLayout) root.findViewById(R.id.expen2);
        mExpandLayout3 = (ExpandableRelativeLayout) root.findViewById(R.id.expen3);

        linearLayout1 = (LinearLayout) root.findViewById(R.id.lay1);
        linearLayout2 = (LinearLayout) root.findViewById(R.id.lay2);
        linearLayout3 = (LinearLayout) root.findViewById(R.id.lay3);

        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);

        return root;


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lay1:
                mExpandLayout1.toggle();
                break;
            case R.id.lay2:
                mExpandLayout2.toggle();
                break;
            case R.id.lay3:
                mExpandLayout3.toggle();
                break;
        }
    }
}