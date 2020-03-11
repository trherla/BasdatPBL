package com.example.basdatpbl.ui.materi;

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

public class MateriFragment extends Fragment {

    private MateriViewModel materiViewModel;
    private RecyclerView rv;
    private MateriAdapter adapter;
    private List<Materi> lstMateri;

    public MateriFragment newInstance(){
        MateriFragment fragment = new MateriFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);}

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        materiViewModel =
//                ViewModelProviders.of(this).get(MateriViewModel.class);
//        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        View root = inflater.inflate(R.layout.fragment_materi, container, false);

//        final TextView textView = root.findViewById(R.id.materi);
//        materiViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });


        lstMateri = new ArrayList<>();
        adapter = new MateriAdapter(this, lstMateri);
        rv = (RecyclerView) root.findViewById(R.id.rv_idmateri);
//        rv.setHasFixedSize(false);
        rv.setLayoutManager(new GridLayoutManager(getContext(),2));

        MateriAdapter adapter = new MateriAdapter(this, lstMateri);

        rv.setAdapter(adapter);
        lstMateri.add(new Materi("Hirarki Basis Data", "Categories 1", "Description", R.drawable.kasus24dp));
        lstMateri.add(new Materi("Entity Relationship Diagram", "Categories 2", "Description", R.drawable.ic_home_black_24dp));
        lstMateri.add(new Materi("Normalisasi Data", "Categories 3", "Description", R.drawable.ic_notifications_black_24dp));
        lstMateri.add(new Materi("Ketergantungan Fungsional", "Categories 4", "Description", R.drawable.mi_ic_skip));


//        RecyclerView myrv =(RecyclerView) root.findViewById(R.id.rv_idmateri);
//        MateriAdapter myAdapter = new MateriAdapter(this, lstMateri);
//        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));

        return root;

    }
}
