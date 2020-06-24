package com.example.basdatpbl.ui.materi.hirarki;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.basdatpbl.R;
import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class Tabs3Hirarki extends Fragment implements View.OnClickListener{

    public Tabs3Hirarki() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public ExpandableRelativeLayout mExpandLayout1;
    public ExpandableRelativeLayout mExpandLayout2;

    public LinearLayout linearLayout1;
    public LinearLayout linearLayout2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.hirarki_tabs3, container, false);

        mExpandLayout1 = (ExpandableRelativeLayout) root.findViewById(R.id.expen1);
        mExpandLayout2 = (ExpandableRelativeLayout) root.findViewById(R.id.expen2);


        linearLayout1 = (LinearLayout) root.findViewById(R.id.lay1);
        linearLayout2 = (LinearLayout) root.findViewById(R.id.lay2);


        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);

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
        }
    }
}