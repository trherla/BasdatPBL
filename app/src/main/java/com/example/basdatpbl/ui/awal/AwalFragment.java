package com.example.basdatpbl.ui.awal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.basdatpbl.R;

public class AwalFragment extends Fragment {

    private AwalViewModel awalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        awalViewModel =
//                ViewModelProviders.of(this).get(AwalViewModel.class);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        View root = inflater.inflate(R.layout.fragment_awal, container, false);
//        final TextView textView = root.findViewById(R.id.awal);
//        awalViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        return root;
    }
}
