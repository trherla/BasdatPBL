package com.example.basdatpbl.ui.kasus.satu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kasus.dua.TwoTahapTiga;

public class OneTahapDua extends AppCompatActivity {
    CheckBox CbSatu, CbDua, CbTiga, CbEmpat;
    ImageButton nxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_one_tahap_dua);
        TextView Pertanyaan = findViewById(R.id.pertayaan_kasus);
        CbSatu = findViewById(R.id.cb_satu);
        CbDua = findViewById(R.id.cb_dua);
        CbTiga = findViewById(R.id.cb_tiga);
        CbEmpat = findViewById(R.id.cb_empat);
        nxt = findViewById(R.id.button_sekolah2);

        nxt.setVisibility(View.GONE);

        Pertanyaan.setText(R.string.solusi_sekolah);
        CbSatu.setText(R.string.solusi1_sekolah);
        CbDua.setText(R.string.solusi2_sekolah);
        CbTiga.setText(R.string.solusi3_sekolah);
        CbEmpat.setText(R.string.solusi4_sekolah);

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

                        if (CbSatu.isChecked()){
                            true_header.append("Selamat ! Jawaban kamu benar");
                            false_header.append("Berikut jawaban yang salah :");
                            result.append("> Membuat database sekolah untuk mengatur jadwal pelajaran siswa dengan membuat entitas siswa, guru, dan mata pelajaran \n");
                            unchecked.append("> Mengoptimalkan sistem manajemen data yang sudah ada di SMP Harapan Bangsa\n");
                            unchecked.append("> Membuat database sekolah untuk memanajemen data siswa, guru dan tenaga non-pendidik \n");
                            unchecked.append("> Membuat sistem informasi untuk mendapatkan guru dan tenaga non-pendidik \n");
                        }else {
                            true_header.append("Jawabanmu Salah di tahap ini, seharusnya kamu hanya memilih solusi ini:");
                            false_header.append("Berikut solusi yang kurang tepat untuk dipilih");
                            result.append("> Membuat database sekolah untuk mengatur jadwal pelajaran siswa dengan membuat entitas siswa, guru, dan mata pelajaran \n");
                            unchecked.append("> Mengoptimalkan sistem manajemen data yang sudah ada di SMP Harapan Bangsa\n");
                            unchecked.append("> Membuat database sekolah untuk memanajemen data siswa, guru dan tenaga non-pendidik \n");
                            unchecked.append("> Membuat sistem informasi untuk mendapatkan guru dan tenaga non-pendidik \n");
                        }

                        String r_dua = result.toString();
                        String u_dua = unchecked.toString();
                        String th_dua = true_header.toString();
                        String fh_dua = false_header.toString();


                        Intent selesai = new Intent(getApplicationContext(), OneTahapTiga.class);

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