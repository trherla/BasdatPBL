package com.example.basdatpbl.ui.kasus;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basdatpbl.R;

import java.util.List;


public class KasusAdapter extends RecyclerView.Adapter<KasusViewModel> {
    KasusFragment context;
    private List<Kasus> mData;

    public KasusAdapter(KasusFragment context, List<Kasus> mData) {
        this.context =  context;
        this.mData = mData;
    }
    @NonNull
    @Override
    public KasusViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_kasus, parent, false);
        return new KasusViewModel(v);
    }

    @Override
    public void onBindViewHolder(@NonNull KasusViewModel holder, int position) {
        holder.kasus_title.setText(mData.get(position).getTitle());
        holder.img_thumbnail.setImageResource(mData.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

/*
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView kasus_title;
        ImageView img_thumbnail;

        public MyViewHolder(View itemView){
            super(itemView);

            kasus_title = (TextView) itemView.findViewById(R.id.cv_title);
            img_thumbnail = (ImageView) itemView.findViewById(R.id.cv_img);
        }
    }
*/
}
