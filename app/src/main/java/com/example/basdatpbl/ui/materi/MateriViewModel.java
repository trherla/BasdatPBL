package com.example.basdatpbl.ui.materi;


import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.materi.hirarki.Tabs1Hirarki;


public class MateriViewModel extends RecyclerView.ViewHolder {
    public TextView materi, materi_title;
    public ImageView img_thumbnail;
    public CardView cardView;
    Context context;

    public MateriViewModel(View itemView) {
        super(itemView);
        context = itemView.getContext();

        materi_title = itemView.findViewById(R.id.cv_title);
        img_thumbnail = itemView.findViewById(R.id.cv_img);
        cardView = itemView.findViewById(R.id.cv_click);

        cardView.setOnClickListener(view -> {
            Intent intent = new Intent();
            switch (getAdapterPosition()){
                case 0 :
                    intent = new Intent(context, TabsHirarki.class);
                    break;
                case 1 :
                    intent = new Intent(context, TabsErd.class);
                    break;
                case 2 :
                    intent = new Intent(context, TabsKetergantungan.class);
                    break;
                case 3 :
                    intent = new Intent(context, TabsNormalisasi.class);
                    break;
            }
            context.startActivity(intent);
        });
    }

}