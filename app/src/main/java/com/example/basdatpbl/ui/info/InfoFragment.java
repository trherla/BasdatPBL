package com.example.basdatpbl.ui.info;

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

public class InfoFragment extends Fragment implements View.OnClickListener{

    public ExpandableRelativeLayout InfoExpand1;
    public ExpandableRelativeLayout InfoExpand2;
    public ExpandableRelativeLayout InfoExpand3;
    public ExpandableRelativeLayout InfoExpand4;

    public LinearLayout LinearInfo1;
    public LinearLayout LinearInfo2;
    public LinearLayout LinearInfo3;
    public LinearLayout LinearInfo4;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_info, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        InfoExpand1 = root.findViewById(R.id.info_expen1);
        InfoExpand2 = root.findViewById(R.id.info_expen2);
        InfoExpand3 = root.findViewById(R.id.info_expen3);
        InfoExpand4 = root.findViewById(R.id.info_expen4);


        LinearInfo1 = root.findViewById(R.id.info_lay1);
        LinearInfo2 = root.findViewById(R.id.info_lay2);
        LinearInfo3 = root.findViewById(R.id.info_lay3);
        LinearInfo4 = root.findViewById(R.id.info_lay4);

        LinearInfo1.setOnClickListener(this);
        LinearInfo2.setOnClickListener(this);
        LinearInfo3.setOnClickListener(this);
        LinearInfo4.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.info_lay1:
                InfoExpand1.toggle();
                break;
            case R.id.info_lay2:
                InfoExpand2.toggle();
                break;
            case R.id.info_lay3:
                InfoExpand3.toggle();
                break;
            case R.id.info_lay4:
                InfoExpand4.toggle();
                break;
        }
    }
}
