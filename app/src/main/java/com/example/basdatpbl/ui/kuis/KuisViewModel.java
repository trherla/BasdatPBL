package com.example.basdatpbl.ui.kuis;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kasus.Kasus;
import com.example.basdatpbl.ui.kasus.satu.KasusSatu;
import com.example.basdatpbl.ui.kuis.kuis_erd.KuisErd;
import com.example.basdatpbl.ui.kuis.kuis_hirarki.KuisHirarki;
import com.example.basdatpbl.ui.materi.TabsErd;
import com.example.basdatpbl.ui.materi.TabsHirarki;
import com.example.basdatpbl.ui.materi.TabsKetergantungan;
import com.example.basdatpbl.ui.materi.TabsNormalisasi;

public class KuisViewModel extends RecyclerView.ViewHolder {

    public TextView kuis_title, kuis_desc;
    public ImageView img_thumbnail;
    public CardView cardView;
    Context context;

    public KuisViewModel(View itemView) {
        super(itemView);
        context = itemView.getContext();

        kuis_title = (TextView) itemView.findViewById(R.id.kuis_title);
        kuis_desc = (TextView) itemView.findViewById(R.id.kuis_desc);
        img_thumbnail = (ImageView) itemView.findViewById(R.id.kuis_img);
        cardView = (CardView) itemView.findViewById(R.id.kuis_click);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                switch (getAdapterPosition()){
                    case 0 :
                        intent = new Intent(context, KuisHirarki.class);
                        break;
                    case 1 :
                        intent = new Intent(context, KuisErd.class);
                        break;
                    case 2 :
                        intent = new Intent(context, KasusSatu.class);
                        break;
                    case 3 :
                        intent = new Intent(context, TabsNormalisasi.class);
                        break;
                }
                context.startActivity(intent);

            }
        });
    }

}