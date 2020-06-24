package com.example.basdatpbl.ui.kuis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
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
//        kuisViewModel =
//                ViewModelProviders.of(this).get(KuisViewModel.class);
        View root = inflater.inflate(R.layout.fragment_kuis, container, false);
//        final TextView textView = root.findViewById(R.id.kuis);
//        kuisViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        lstKuis = new ArrayList<>();
        adapter = new KuisAdapter(this, lstKuis);
        rv = (RecyclerView) root.findViewById(R.id.rv_idkuis);
//        rv.setHasFixedSize(false);
        rv.setLayoutManager(new GridLayoutManager(getContext(),1));

        KuisAdapter adapter = new KuisAdapter(this, lstKuis);

        rv.setAdapter(adapter);
        lstKuis.add(new Kuis("Kuis", "Categories 1", "Hirarki Basis Data", R.drawable.sekolah));
        lstKuis.add(new Kuis("Kuis", "Categories 2", "ERD", R.drawable.perpustakaan));
        lstKuis.add(new Kuis("Kuis", "Categories 3", "Ketergantungan Fungsional", R.drawable.rumahsakit));
        lstKuis.add(new Kuis("Kuis", "Categories 4", "Normalisasi", R.drawable.toko));

        return root;
    }
}
