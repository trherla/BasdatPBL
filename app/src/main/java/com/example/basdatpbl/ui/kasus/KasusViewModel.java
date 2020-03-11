package com.example.basdatpbl.ui.kasus;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kasus.satu.KasusSatu;

public class KasusViewModel extends RecyclerView.ViewHolder {

    public TextView materi, kasus_title;
    public ImageView img_thumbnail;
    public CardView cardView;
    Context context;

    public KasusViewModel(View itemView) {
        super(itemView);
        context = itemView.getContext();

        kasus_title = (TextView) itemView.findViewById(R.id.cv_title);
        img_thumbnail = (ImageView) itemView.findViewById(R.id.cv_img);
        cardView = (CardView) itemView.findViewById(R.id.cv_click);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, KasusSatu.class);
                context.startActivity(intent);
            }
        });
    }

}