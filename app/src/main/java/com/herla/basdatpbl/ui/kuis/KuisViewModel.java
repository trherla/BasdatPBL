package com.herla.basdatpbl.ui.kuis;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.herla.basdatpbl.R;
import com.herla.basdatpbl.ui.kuis.kuis_erd.KuisErd;
import com.herla.basdatpbl.ui.kuis.kuis_hirarki.KuisHirarki;
import com.herla.basdatpbl.ui.kuis.kuis_ketergantungan.KuisKetergantungan;
import com.herla.basdatpbl.ui.kuis.kuis_normalisasi.KuisNormalisasi;

public class KuisViewModel extends RecyclerView.ViewHolder {

    public TextView kuis_title;
    public ImageView img_thumbnail;
    public ImageView img_two;
    public CardView cardView;
    Context context;

    public KuisViewModel(View itemView) {
        super(itemView);
        context = itemView.getContext();

        kuis_title = itemView.findViewById(R.id.kuis_title);
        img_thumbnail = itemView.findViewById(R.id.kuis_img);
        img_two = itemView.findViewById(R.id.kuis_img2);

        cardView = itemView.findViewById(R.id.kuis_click);

        cardView.setOnClickListener(view -> {
            Intent intent = new Intent();
            switch (getAdapterPosition()){
                case 0 :
                    intent = new Intent(context, KuisHirarki.class);
                    break;
                case 1 :
                    intent = new Intent(context, KuisErd.class);
                    break;
                case 2 :
                    intent = new Intent(context, KuisKetergantungan.class);
                    break;
                case 3 :
                    intent = new Intent(context, KuisNormalisasi.class);
                    break;
            }
            context.startActivity(intent);

        });
    }

}