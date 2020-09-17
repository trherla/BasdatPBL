package com.example.basdatpbl.ui.kasus.empat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FourTahapTiga extends AppCompatActivity {

    TextView pertanyaan, judul;
    RadioGroup rg;
    RadioButton PilA, PilB;
    ImageView tabel_buku;
    ImageButton nxt;



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_four_tahap_tiga);

        judul = findViewById(R.id.jud);
        pertanyaan = findViewById(R.id.penyelesaian_toko);
        tabel_buku =findViewById(R.id.tabel_buku);

        nxt = findViewById(R.id.button_toko3);
        nxt.setVisibility(View.GONE);
        rg = findViewById(R.id.radio_group);
        PilA = findViewById(R.id.pilihanA);
        PilB = findViewById(R.id.pilihanB);

        judul.setText("1/4");
        tabel_buku.setImageResource(R.drawable.kasus_normalisasi);
        pertanyaan.setText("Apakah Tabel Buku berikut sudah dalam bentuk normal pertama(1NF)?");
        PilA.setText("Ya");
        PilB.setText("Tidak");

    }


    @SuppressLint("SetTextI18n")
    public void next(View view) {

        RadioButton jawaban_user = findViewById(rg.getCheckedRadioButtonId());
        String ambil_jawaban_user = jawaban_user.getText().toString();

        Intent selesai = new Intent(getApplicationContext(), FourTahapTiga_2.class);
//receive value from activity one and two

        Intent i = getIntent();
        String r_satu = i.getStringExtra("resultSatu");
        String u_satu = i.getStringExtra("unSatu");
        String th_satu = i.getStringExtra("thSatu");
        String fh_satu = i.getStringExtra("fhSatu");

        String r_dua = i.getStringExtra("resultDua");
        String u_dua = i.getStringExtra("unDua");
        String th_dua = i.getStringExtra("thDua");
        String fh_dua = i.getStringExtra("fhDua");

        selesai.putExtra("resultSatu", r_satu);
        selesai.putExtra("unSatu", u_satu);
        selesai.putExtra("thSatu", th_satu);
        selesai.putExtra("fhSatu", fh_satu);

        selesai.putExtra("resultDua", r_dua);
        selesai.putExtra("unDua", u_dua);
        selesai.putExtra("thDua", th_dua);
        selesai.putExtra("fhDua", fh_dua);

        selesai.putExtra("sTiga", ambil_jawaban_user);

        startActivity(selesai);
    }

    private long backPressedTime;
    private Toast backToast;
    public void onBackPressed() {
        if(backPressedTime +2000 > System.currentTimeMillis()){
            finish();
            Intent backhome  = new Intent(getApplicationContext(), BottomActivity.class);
            startActivity(backhome);
        }else {
            backToast = Toast.makeText(getBaseContext(),"Press back again to Main Menu", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime =System.currentTimeMillis();

    }

    public void onRBClicked(View view) {
        boolean isSelected = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.pilihanA:
            case R.id.pilihanB:
                if (isSelected) {
                    nxt.setVisibility(View.VISIBLE);
                    nxt.animate().translationY(0);
                }else{
                    nxt.setVisibility(View.GONE);
                    nxt.animate().translationY(nxt.getHeight());
                }
                break;
        }
    }

}