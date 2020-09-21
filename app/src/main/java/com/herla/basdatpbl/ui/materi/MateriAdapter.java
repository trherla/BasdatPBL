package com.herla.basdatpbl.ui.materi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.herla.basdatpbl.R;

import java.util.List;

public class MateriAdapter extends RecyclerView.Adapter<MateriViewModel> {

//    private Context mContext;
    private MateriFragment context;
    private List<Materi> mData;

    public MateriAdapter(MateriFragment context, List<Materi> mData) {
        this.context =  context;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MateriViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_materi, parent, false);
        return new MateriViewModel(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MateriViewModel holder, int position) {

        holder.materi_title.setText(mData.get(position).getTitle());
        holder.img_thumbnail.setImageResource(mData.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

/*
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView materi_title;
        ImageView img_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            materi_title = (TextView) itemView.findViewById(R.id.cv_title);
            img_thumbnail = (ImageView) itemView.findViewById(R.id.cv_img);
            cardView = (CardView) itemView.findViewById(R.id.cv_click);
        }
    }
*/
}
