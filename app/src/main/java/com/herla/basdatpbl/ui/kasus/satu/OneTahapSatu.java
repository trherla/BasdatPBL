package com.herla.basdatpbl.ui.kasus.satu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.herla.basdatpbl.BottomActivity;
import com.herla.basdatpbl.R;

public class OneTahapSatu extends AppCompatActivity {
    TextView Pertanyaan;
    CheckBox CbSatu, CbDua, CbTiga, CbEmpat;
    ImageButton nxt, bck;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_one_tahap_satu);

        Pertanyaan = findViewById(R.id.pertayaan_kasus);
        CbSatu = findViewById(R.id.cb_satu);
        CbDua = findViewById(R.id.cb_dua);
        CbTiga = findViewById(R.id.cb_tiga);
        CbEmpat = findViewById(R.id.cb_empat);
        nxt = findViewById(R.id.button_sekolah1);
//        bck = findViewById(R.id.back_sekolah1);

        nxt.setVisibility(View.GONE);
//        bck.setVisibility(View.GONE);
//
//        new CountDownTimer(60000, 1000){
//            @Override
//            public void onTick(long millisUntilFinished) {
//
//            }
//
//            @Override
//            public void onFinish() {
//                bck.setVisibility(View.VISIBLE);
//                bck.animate().translationY(0);
//            }
//        }.start();

        Pertanyaan.setText(R.string.pertanyaan_sekolah);
        CbSatu.setText(R.string.masalah1_sekolah);
        CbDua.setText(R.string.masalah2_sekolah);
        CbTiga.setText(R.string.masalah3_sekolah);
        CbEmpat.setText(R.string.masalah4_sekolah);



        CbSatu.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (CbSatu.isChecked() || CbDua.isChecked() || CbTiga.isChecked() || CbEmpat.isChecked()) {
                nxt.setVisibility(View.VISIBLE);
                nxt.animate().translationY(0);
            }else{
                nxt.setVisibility(View.GONE);
                nxt.animate().translationY(nxt.getHeight());
            }
        });
        CbDua.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (CbSatu.isChecked() || CbDua.isChecked() || CbTiga.isChecked() || CbEmpat.isChecked()) {
                nxt.setVisibility(View.VISIBLE);
                nxt.animate().translationY(0);
            }else{
                nxt.setVisibility(View.GONE);
                nxt.animate().translationY(nxt.getHeight());
            }
        });
        CbTiga.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (CbSatu.isChecked() || CbDua.isChecked() || CbTiga.isChecked() || CbEmpat.isChecked()) {
                nxt.setVisibility(View.VISIBLE);
                nxt.animate().translationY(0);
            }else{
                nxt.setVisibility(View.GONE);
                nxt.animate().translationY(nxt.getHeight());
            }
        });
        CbEmpat.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (CbSatu.isChecked() || CbDua.isChecked() || CbTiga.isChecked() || CbEmpat.isChecked()) {
                nxt.setVisibility(View.VISIBLE);
//                nxt.animate().alpha(1.0f);
                nxt.animate().translationY(0);
            }else{
                nxt.setVisibility(View.GONE);
//                nxt.animate().alpha(0.0f);
                nxt.animate().translationY(nxt.getHeight());
            }
        });


        Intent intent = new Intent(this, OneIntro.class);
        startActivity(intent);

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

    public void next(View view) {
        if (CbSatu.isChecked() || CbDua.isChecked() || CbTiga.isChecked() || CbEmpat.isChecked()){

//           Dialog
            AlertDialog.Builder dial = new AlertDialog.Builder(this);
//            dial.setTitle("Yakin?");
            dial.setMessage("Yakin dengan jawaban anda")
                    .setPositiveButton("Ya", (dialog, which) -> {

                        StringBuilder true_header = new StringBuilder();
                        StringBuilder false_header = new StringBuilder();
                        StringBuilder result = new StringBuilder();
                        StringBuilder unchecked = new StringBuilder();

                        if(CbSatu.isChecked() || CbTiga.isChecked() || CbEmpat.isChecked()){
                            true_header.append("Jawabanmu Salah di tahap ini, seharusnya kamu hanya memilih jawaban ini:");
                            false_header.append("Berikut jawaban yang salah :");
                            unchecked.append("> SMP Harapan Bangsa sistem manajemen yang kurang optimal\n");
                            result.append("> SMP Harapan Bangsa tidak memiliki sistem manajemen untuk sekolah \n");
                            unchecked.append("> Tidak ada siswa yang mendaftar di SMP Harapan Bangsa \n");
                            unchecked.append("> SMP Harapan Bangsa tidak memiliki guru dan tenaga non-pendidik \n");

                        }else if (CbDua.isChecked()){
                            true_header.append("Selamat ! Jawaban kamu benar");
                            false_header.append("Berikut jawaban yang salah :");
                            unchecked.append("> SMP Harapan Bangsa sistem manajemen yang kurang optimal\n");
                            result.append("> SMP Harapan Bangsa tidak memiliki sistem manajemen untuk sekolah \n");
                            unchecked.append("> Tidak ada siswa yang mendaftar di SMP Harapan Bangsa \n");
                            unchecked.append("> SMP Harapan Bangsa tidak memiliki guru dan tenaga non-pendidik \n");
                        }
                        String th_satu = true_header.toString();
                        String fh_satu = false_header.toString();
                        String r_satu = result.toString();
                        String u_satu = unchecked.toString();

                        Intent selesai = new Intent(getApplicationContext(), OneTahapDua.class);
                        selesai.putExtra("thSatu", th_satu);
                        selesai.putExtra("fhSatu", fh_satu);
                        selesai.putExtra("resultSatu", r_satu);
                        selesai.putExtra("unSatu", u_satu);

                        startActivity(selesai);


                    })
                    .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel());
            dial.create();
            dial.show();

        }else {
            Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }

    public void illustration(View view) {
        AlertDialog.Builder dial = new AlertDialog.Builder(this);
//            dial.setTitle("Yakin?");
        dial.setMessage("Lihat Orientasi Masalah lagi?")
                .setPositiveButton("Ya", (dialog, which) -> {
                    Intent intent = new Intent(this, OneIntro.class);
                    startActivity(intent);
                })
                .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel());
        dial.create();
        dial.show();

    }
}

