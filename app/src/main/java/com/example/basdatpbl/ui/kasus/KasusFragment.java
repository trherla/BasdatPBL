package com.example.basdatpbl.ui.kasus;

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

public class KasusFragment extends Fragment {

    private KasusViewModel kasusViewModel;
    private RecyclerView rv;
    private KasusAdapter adapter;
    private List<Kasus> lstKasus;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        kasusViewModel =
//                ViewModelProviders.of(this).get(KasusViewModel.class);
        View root = inflater.inflate(R.layout.fragment_kasus, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
//        final TextView textView = root.findViewById(R.id.kasus);
//        kasusViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        lstKasus = new ArrayList<>();
        adapter = new KasusAdapter(this, lstKasus);
        rv = (RecyclerView) root.findViewById(R.id.rv_idkasus);
//        rv.setHasFixedSize(false);
        rv.setLayoutManager(new GridLayoutManager(getContext(),1));

        KasusAdapter adapter = new KasusAdapter(this, lstKasus);

        rv.setAdapter(adapter);
        lstKasus.add(new Kasus("Sekolah",  R.drawable.sekolah));
        lstKasus.add(new Kasus("Perpustakaan",  R.drawable.perpustakaan));
        lstKasus.add(new Kasus("Rumah Sakit", R.drawable.rumahsakit));
        lstKasus.add(new Kasus("Toko Buku",  R.drawable.toko));
        return root;
    }
}
