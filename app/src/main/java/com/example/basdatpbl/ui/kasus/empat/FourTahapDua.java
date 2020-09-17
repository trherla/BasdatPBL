package com.example.basdatpbl.ui.kasus.empat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;

public class FourTahapDua extends AppCompatActivity {
    CheckBox CbSatu, CbDua, CbTiga, CbEmpat;
    ImageButton nxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_four_tahap_dua);
        TextView Pertanyaan = findViewById(R.id.pertayaan_kasus);
        CbSatu = findViewById(R.id.cb_satu);
        CbDua = findViewById(R.id.cb_dua);
        CbTiga = findViewById(R.id.cb_tiga);
        CbEmpat = findViewById(R.id.cb_empat);
        nxt = findViewById(R.id.button_toko2);

        nxt.setVisibility(View.GONE);

        Pertanyaan.setText(R.string.solusi_toko);
        CbSatu.setText(R.string.solusi1_toko);
        CbDua.setText(R.string.solusi2_toko);
        CbTiga.setText(R.string.solusi3_toko);
        CbEmpat.setText(R.string.solusi4_toko);

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

                        if (CbSatu.isChecked()){
                            true_header.append("Selamat ! Jawaban kamu benar");
                            false_header.append("Berikut jawaban yang salah :");
                            result.append("> Melakukan normalisasi pada tabel buku, sehingga diperoleh tabel dengan struktur yang baik\n");
                            unchecked.append("> Menghapus beberapa atribut agar tidak menimbulkan redundansi data\n");
                            unchecked.append("> Memeriksa tipe data yang dimiliki tiap atribut agar tidak membuat error\n");
                            unchecked.append("> Membuat diagram entitas toko buku untuk mempermudah dalam pembuatan basis data toko buku\n");
                        }else {
                            true_header.append("Jawabanmu Salah di tahap ini, seharusnya kamu hanya memilih solusi ini:");
                            false_header.append("Berikut solusi yang kurang tepat untuk dipilih");
                            result.append("> Melakukan normalisasi pada tabel buku, sehingga diperoleh tabel dengan struktur yang baik\n");
                            unchecked.append("> Menghapus beberapa atribut agar tidak menimbulkan redundansi data\n");
                            unchecked.append("> Memeriksa tipe data yang dimiliki tiap atribut agar tidak membuat error\n");
                            unchecked.append("> Membuat diagram entitas toko buku untuk mempermudah dalam pembuatan basis data toko buku\n");
                        }

                        String r_dua = result.toString();
                        String u_dua = unchecked.toString();
                        String th_dua = true_header.toString();
                        String fh_dua = false_header.toString();


                        Intent selesai = new Intent(getApplicationContext(), FourTahapTiga.class);

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