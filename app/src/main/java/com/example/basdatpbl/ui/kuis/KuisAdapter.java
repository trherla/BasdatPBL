package com.example.basdatpbl.ui.kuis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kuis.Kuis;
import com.example.basdatpbl.ui.kuis.KuisFragment;
import com.example.basdatpbl.ui.kuis.KuisViewModel;

import java.util.List;


public class KuisAdapter extends RecyclerView.Adapter<KuisViewModel> {
    KuisFragment context;
    private List<Kuis> mData;

    public KuisAdapter(KuisFragment context, List<Kuis> mData) {
        this.context =  context;
        this.mData = mData;
    }
    @NonNull
    @Override
    public KuisViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_kuis, parent, false);
        return new KuisViewModel(v);
    }

    @Override
    public void onBindViewHolder(@NonNull KuisViewModel holder, int position) {
        holder.kuis_title.setText(mData.get(position).getTitle());
        holder.kuis_desc.setText(mData.get(position).getDescription());
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
