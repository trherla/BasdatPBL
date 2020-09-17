package com.example.basdatpbl.ui.kasus.dua;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kasus.satu.OneIntro;

import static com.example.basdatpbl.BottomActivity.PREF_KEY_FIRST_START;
import static com.example.basdatpbl.BottomActivity.REQUEST_CODE_INTRO;

public class TwoTahapSatu extends AppCompatActivity {

    TextView Pertanyaan;
    CheckBox CbSatu, CbDua, CbTiga, CbEmpat;
    ImageButton nxt;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_two_tahap_satu);

        Pertanyaan = findViewById(R.id.pertayaan_kasus);
        CbSatu = findViewById(R.id.cb_satu);
        CbDua = findViewById(R.id.cb_dua);
        CbTiga = findViewById(R.id.cb_tiga);
        CbEmpat = findViewById(R.id.cb_empat);
        nxt = findViewById(R.id.button_perpus1);

        nxt.setVisibility(View.GONE);

        Pertanyaan.setText(R.string.pertanyaan_perpus);
        CbSatu.setText(R.string.masalah1_perpus);
        CbDua.setText(R.string.masalah2_perpus);
        CbTiga.setText(R.string.masalah3_perpus);
        CbEmpat.setText(R.string.masalah4_perpus);



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

        Intent intent = new Intent(this, TwoIntro.class);
        startActivity(intent);
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
//jawabannya ada di cb3
                        if (CbSatu.isChecked() || CbDua.isChecked()|| CbEmpat.isChecked()){
                            true_header.append("Jawabanmu Salah di tahap ini, seharusnya kamu hanya memilih jawaban ini:");
                            false_header.append("Berikut jawaban yang salah :");
                            unchecked.append("> Banyak Atribut yang tidak sesuai di ERD Perpustakaan\n");
                            unchecked.append("> Pengelola perpustakaan membutuhkan buku baru untuk perpustakaan \n");
                            result.append("> Banyak anggota yang sering terlambat mengembalikan buku pinjaman dari perpustakaan.\n");
                            unchecked.append("> Relasi antar Entitas Buku dan Anggota di ERD perpustakaan kurang tepat \n");
                        }else if (CbTiga.isChecked() ){
                            true_header.append("Selamat ! Jawaban kamu benar");
                            false_header.append("Berikut jawaban yang salah :");
                            unchecked.append("> Banyak Atribut yang tidak sesuai di ERD Perpustakaan\n");
                            unchecked.append("> Pengelola perpustakaan membutuhkan buku baru untuk perpustakaan \n");
                            result.append("> Banyak anggota yang sering terlambat mengembalikan buku pinjaman dari perpustakaan.\n");
                            unchecked.append("> Relasi antar Entitas Buku dan Anggota di ERD perpustakaan kurang tepat \n");
                        }

                        String th_satu = true_header.toString();
                        String fh_satu = false_header.toString();
                        String r_satu = result.toString();
                        String u_satu = unchecked.toString();

                        Intent selesai = new Intent(getApplicationContext(), TwoTahapDua.class);
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

        ////////
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
    public void illustration(View view) {
        AlertDialog.Builder dial = new AlertDialog.Builder(this);
//            dial.setTitle("Yakin?");
        dial.setMessage("Lihat Orientasi Masalah lagi?")
                .setPositiveButton("Ya", (dialog, which) -> {
                    Intent intent = new Intent(this, TwoIntro.class);
                    startActivity(intent);
                })
                .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel());
        dial.create();
        dial.show();
    }
}