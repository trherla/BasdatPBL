package com.herla.basdatpbl.ui.kasus.tiga;

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

public class ThreeTahapSatu extends AppCompatActivity {
    TextView Pertanyaan;
    CheckBox CbSatu, CbDua, CbTiga, CbEmpat;
    ImageButton nxt;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_three_tahap_satu);

        Pertanyaan = findViewById(R.id.pertayaan_kasus);
        CbSatu = findViewById(R.id.cb_satu);
        CbDua = findViewById(R.id.cb_dua);
        CbTiga = findViewById(R.id.cb_tiga);
        CbEmpat = findViewById(R.id.cb_empat);
        nxt = findViewById(R.id.button_rs1);

        nxt.setVisibility(View.GONE);

        Pertanyaan.setText(R.string.pertanyaan_rs);
        CbSatu.setText(R.string.masalah1_rs);
        CbDua.setText(R.string.masalah2_rs);
        CbTiga.setText(R.string.masalah3_rs);
        CbEmpat.setText(R.string.masalah4_rs);



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

        Intent intent = new Intent(this, ThreeIntro.class);
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
//jawabannya ada di cb1 dan cb4
                        if (CbTiga.isChecked() ){
                            true_header.append("Pilihanmu salah pada tahap ini");
                            false_header.append("Berikut jawaban yang Benar :");
                            unchecked.append("> Operasi dilaksanakan tiap hari \n");
                            unchecked.append("> Dokter melakukan operasi pada waktu yang sudah ditentukan\n");
                            result.append("> Beberapa dokter bertanggung jawab pada satu operasi \n");
                            unchecked.append("> Dokter bisa ditugaskan pada banyak operasi \n");
                        }else if (CbSatu.isChecked() || CbDua.isChecked() || CbEmpat.isChecked()){
                            true_header.append("Jawaban kamu benar tapi kurang lengkap, berikut jawaban yang seharusnya kamu pilih");
                            false_header.append("Berikut jawaban yang salah :");
                            result.append("> Operasi dilaksanakan tiap hari \n");
                            result.append("> Dokter melakukan operasi pada waktu yang sudah ditentukan\n");
                            unchecked.append("> Beberapa dokter bertanggung jawab pada satu operasi \n");
                            result.append("> Dokter bisa ditugaskan pada banyak operasi \n");
                        }else if (CbSatu.isChecked() && CbDua.isChecked() && CbEmpat.isChecked()){
                            true_header.append("Selamat ! Jawaban kamu benar");
                            false_header.append("Berikut jawaban yang salah :");
                            result.append("> Operasi dilaksanakan tiap hari \n");
                            result.append("> Dokter melakukan operasi pada waktu yang sudah ditentukan\n");
                            unchecked.append("> Beberapa dokter bertanggung jawab pada satu operasi \n");
                            result.append("> Dokter bisa ditugaskan pada banyak operasi \n");
                        }

                        String th_satu = true_header.toString();
                        String fh_satu = false_header.toString();
                        String r_satu = result.toString();
                        String u_satu = unchecked.toString();

                        Intent selesai = new Intent(getApplicationContext(), ThreeTahapDua.class);
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
                    Intent intent = new Intent(this, ThreeIntro.class);
                    startActivity(intent);
                })
                .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel());
        dial.create();
        dial.show();
    }
}

