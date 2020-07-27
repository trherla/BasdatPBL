package com.example.basdatpbl;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basdatpbl.ui.kuis.Kuis;
import com.example.basdatpbl.ui.kuis.KuisAdapter;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

import java.util.ArrayList;
import java.util.List;

public class AppIntroFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Intent intent = new Intent(getActivity(), AppIntroActivity.class);
        startActivity(intent);

        View root = inflater.inflate(R.layout.activity_bottom, container, false);



        return root;
    }
}