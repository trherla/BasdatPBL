package com.herla.basdatpbl.ui.kasus;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.herla.basdatpbl.R;
import com.herla.basdatpbl.ui.kasus.dua.TwoTahapSatu;
import com.herla.basdatpbl.ui.kasus.empat.FourTahapSatu;
import com.herla.basdatpbl.ui.kasus.satu.OneTahapSatu;
import com.herla.basdatpbl.ui.kasus.tiga.ThreeTahapSatu;

public class KasusViewModel extends RecyclerView.ViewHolder {

    public TextView materi, kasus_title;
    public ImageView img_thumbnail;
    public CardView cardView;
    Context context;

    public KasusViewModel(View itemView) {
        super(itemView);
        context = itemView.getContext();

        kasus_title = itemView.findViewById(R.id.kasus_title);
        img_thumbnail = itemView.findViewById(R.id.kasus_img);
        cardView = itemView.findViewById(R.id.kasus_click);

        cardView.setOnClickListener(view -> {
            Intent intent = new Intent();
            switch (getAdapterPosition()){
                case 0 :
                    intent = new Intent(context, OneTahapSatu.class);
                    break;
                case 1 :
                    intent = new Intent(context, TwoTahapSatu.class);
                    break;
                case 2 :
                    intent = new Intent(context, ThreeTahapSatu.class);
                    break;
                case 3 :
                    intent = new Intent(context, FourTahapSatu.class);
                    break;
            }
            context.startActivity(intent);
        });
    }

}