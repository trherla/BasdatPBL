package com.example.basdatpbl.ui.kuis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basdatpbl.R;

import java.util.ArrayList;
import java.util.List;

public class KuisFragment extends Fragment {

    private KuisViewModel kuisViewModel;
    private RecyclerView rv;
    private KuisAdapter adapter;
    private List<Kuis> lstKuis;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_kuis, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();




        lstKuis = new ArrayList<>();
        adapter = new KuisAdapter(this, lstKuis);
        rv = (RecyclerView) root.findViewById(R.id.rv_idkuis);
        rv.setLayoutManager(new GridLayoutManager(getContext(),1));

        KuisAdapter adapter = new KuisAdapter(this, lstKuis);

        rv.setAdapter(adapter);
        lstKuis.add(new Kuis("Kuis\nHirarki Basis Data", R.drawable.hirarki));
        lstKuis.add(new Kuis("Kuis\nEntity Relationship Diagram", R.drawable.accuracy));
        lstKuis.add(new Kuis("Kuis\nKetergantungan Fungsional", R.drawable.ketergantungan));
        lstKuis.add(new Kuis("Kuis\nNormalisasi", R.drawable.normalisasi));

        return root;
    }
}
