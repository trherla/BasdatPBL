package com.example.basdatpbl.ui.kasus.satu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kuis.kuis_hirarki.KuisHirarki;

import static com.example.basdatpbl.BottomActivity.PREF_KEY_FIRST_START;
import static com.example.basdatpbl.BottomActivity.REQUEST_CODE_INTRO;

public class OneTahapSatu extends AppCompatActivity {
    TextView Pertanyaan;
    CheckBox CbSatu, CbDua, CbTiga, CbEmpat;
    ImageButton nxt;

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
        nxt = findViewById(R.id.button_perpus1);

        nxt.setVisibility(View.GONE);

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




        //Call Petunjuk penggunaan on first run
        boolean firstStart = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean(PREF_KEY_FIRST_START, true);

        //set for first start
        if (!firstStart) {
            Intent intent = new Intent(this, OneIntro.class);
            startActivityForResult(intent, REQUEST_CODE_INTRO);
        }
    }
    //Function for check first run
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_INTRO) {
            if (resultCode == RESULT_OK) {
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean(PREF_KEY_FIRST_START, false)
                        .apply();
            } else {
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean(PREF_KEY_FIRST_START, true)
                        .apply();
                //User cancelled the intro so we'll finish this activity too.
                finish();
            }
        }
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
                        if(CbDua.isChecked() && CbSatu.isChecked() || CbTiga.isChecked() || CbEmpat.isChecked()){

                            Intent selesai = new Intent(getApplicationContext(), KuisHirarki.class);
                            startActivity(selesai);
                        }else if (CbDua.isChecked()){
                            true_header.append("Selamat jawaban anda benar");
                            false_header.append("Berikut jawaban yang salah :");
                            result.append("> Kesalahan Atribut \n");
                            unchecked.append("> Menghapus Entitas yang tidak relevan dengan database perpustakaan\n");
                            unchecked.append("> Mengubah beberapa simbol ERD \n");
                            result.append("> Ketidakcocokan Relasi antar Entitas \n");

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
                        }
                        else {
                            Intent selesai = new Intent(getApplicationContext(), BottomActivity.class);
                            startActivity(selesai);
                        }




                    })
                    .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel());
            dial.create();
            dial.show();

        }else {
            Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }
}

