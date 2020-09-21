package com.herla.basdatpbl.ui.awal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.herla.basdatpbl.R;

import java.util.List;

public class AwalAdapter extends RecyclerView.Adapter<AwalViewModel> {
    private AwalFragment context;
    private List<Awal> mData;

    public AwalAdapter(AwalFragment context, List<Awal> mData) {
        this.context =  context;
        this.mData = mData;
    }
    @NonNull
    @Override
    public AwalViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_awal, parent, false);
        return new AwalViewModel(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AwalViewModel holder, int position) {
        holder.awal_title.setText(mData.get(position).getTitle());
        holder.awal_img.setImageResource(mData.get(position).getThumbnail());
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

}

