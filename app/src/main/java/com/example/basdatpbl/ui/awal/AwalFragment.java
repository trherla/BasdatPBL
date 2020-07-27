package com.example.basdatpbl.ui.awal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kuis.Kuis;
import com.example.basdatpbl.ui.kuis.KuisAdapter;
import com.example.basdatpbl.ui.materi.MateriAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AwalFragment extends Fragment {
    private RecyclerView rv;
    private KuisAdapter adapter;
    private List<Awal> lstAwal;
    private AwalViewModel awalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        View root = inflater.inflate(R.layout.fragment_awal, container, false);

        lstAwal = new ArrayList<>();
        rv = (RecyclerView) root.findViewById(R.id.rv_idawal);
        rv.setLayoutManager(new GridLayoutManager(getContext(),3));
        AwalAdapter adapter = new AwalAdapter(this, lstAwal);

        rv.setAdapter(adapter);
        lstAwal.add(new Awal("Kecepatan",  "Hirarki Basis Data", R.drawable.fast));
        lstAwal.add(new Awal("Efisiensi",  "ERD", R.drawable.save));
        lstAwal.add(new Awal("Keakuratan",  "Ketergantungan Fungsional", R.drawable.accuracy));
        lstAwal.add(new Awal("Ketersediaan",  "Normalisasi", R.drawable.hand));
        lstAwal.add(new Awal("Keamanan",  "Normalisasi", R.drawable.padlock));
        lstAwal.add(new Awal("Kebersamaan",  "Normalisasi", R.drawable.share));



        return root;
    }
}
