package com.herla.basdatpbl.ui.awal;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.herla.basdatpbl.R;
import com.herla.basdatpbl.ui.kuis.KuisAdapter;

import java.util.ArrayList;
import java.util.List;

public class AwalFragment extends Fragment {
    private RecyclerView rv;
    public CardView cv_kasus;
    private KuisAdapter adapter;
    private List<Awal> lstAwal;
    private AwalViewModel awalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        View root = inflater.inflate(R.layout.fragment_awal, container, false);

        cv_kasus = root.findViewById(R.id.cv_kasus);
        lstAwal = new ArrayList<>();
        rv = root.findViewById(R.id.rv_idawal);
        rv.setLayoutManager(new GridLayoutManager(getContext(),4));
        AwalAdapter adapter = new AwalAdapter(this, lstAwal);

        rv.setAdapter(adapter);
        lstAwal.add(new Awal("Hirarki Basis Data",  "Hirarki Basis Data", R.drawable.hirarki));
        lstAwal.add(new Awal("Entity Relationship Diagram",  "ERD", R.drawable.relation));
        lstAwal.add(new Awal("Ketergantungan Fungsional",  "Ketergantungan Fungsional", R.drawable.ketergantungan));
        lstAwal.add(new Awal("Normalisasi",  "Normalisasi", R.drawable.normalisasi));

        cv_kasus.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KasusIntro.class);
            startActivity(intent);
        });

        return root;
    }
}
