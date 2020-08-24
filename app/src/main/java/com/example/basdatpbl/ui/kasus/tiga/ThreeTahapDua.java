package com.example.basdatpbl.ui.kasus.tiga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kasus.satu.OneTahapTiga;

public class ThreeTahapDua extends AppCompatActivity {
    CheckBox CbSatu, CbDua, CbTiga, CbEmpat;
    ImageButton nxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_three_tahap_dua);
        TextView Pertanyaan = findViewById(R.id.pertayaan_kasus);
        CbSatu = findViewById(R.id.cb_satu);
        CbDua = findViewById(R.id.cb_dua);
        CbTiga = findViewById(R.id.cb_tiga);
        CbEmpat = findViewById(R.id.cb_empat);
        nxt = findViewById(R.id.button_perpus2);

        nxt.setVisibility(View.GONE);

        Pertanyaan.setText(R.string.solusi_perpus);
        CbSatu.setText(R.string.solusi1_perpus);
        CbDua.setText(R.string.solusi2_perpus);
        CbTiga.setText(R.string.solusi3_perpus);
        CbEmpat.setText(R.string.solusi4_perpus);

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

                        if (CbSatu.isChecked() && CbDua.isChecked()){
                            true_header.append("Selamat jawaban anda benar");
                            false_header.append("Berikut jawaban yang salah :");
                            result.append("> Mengganti beberapa Atribut \n");
                            unchecked.append("> Menghapus Entitas yang tidak relevan dengan database perpustakaan\n");
                            unchecked.append("> Mengubah beberapa simbol ERD \n");
                            result.append("> Mencocokkan kembali relasi dan kardinalitas \n");
                        }else if (CbSatu.isChecked() ){
                            true_header.append("Selamat solusi yang kamu pilih hampir benar");
                            false_header.append("Berikut solusi yang seharusnya kamu pilih juga");
                            result.append("> Mengganti beberapa Atribut \n");
                            unchecked.append("> Mencocokkan kembali relasi dan kardinalitas \n");
                        }else if (CbDua.isChecked()){
                            true_header.append("Selamat solusi yang kamu pilih hampir benar");
                            false_header.append("Berikut solusi yang seharusnya kamu pilih juga");
                            unchecked.append("> Mengganti beberapa Atribut \n");
                            result.append("> Mencocokkan kembali relasi dan kardinalitas \n");
                        }else {
                            true_header.append("Maaf, jawaban kamu belum sesuai");
                            false_header.append("Berikut solusi yang seharusnya dipilih");
                            unchecked.append("> Mengganti beberapa Atribut \n");
                            unchecked.append("> Mencocokkan kembali relasi dan kardinalitas \n");
                        }

                        String r_dua = result.toString();
                        String u_dua = unchecked.toString();
                        String th_dua = true_header.toString();
                        String fh_dua = false_header.toString();


                        Intent selesai = new Intent(getApplicationContext(), ThreeTahapTiga.class);

                        //receive value from activity one
                        Intent i = getIntent();
                        String r_satu = i.getStringExtra("resultSatu");
                        String u_satu = i.getStringExtra("unSatu");
                        String th_satu = i.getStringExtra("thSatu");
                        String fh_satu = i.getStringExtra("fhSatu");
                        //
                        selesai.putExtra("resultSatu", r_satu);
                        selesai.putExtra("unSatu", u_satu);
                        selesai.putExtra("thSatu", th_satu);
                        selesai.putExtra("fhSatu", fh_satu);

                        selesai.putExtra("resultDua", r_dua);
                        selesai.putExtra("unDua", u_dua);
                        selesai.putExtra("thDua", th_dua);
                        selesai.putExtra("fhDua", fh_dua);
                        startActivity(selesai);
                    })
                    .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel());
            dial.create();
            dial.show();

        }else {
            Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
        }

    }
}