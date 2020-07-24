package com.example.basdatpbl.ui.kasus.dua;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kasus.satu.OneIntro;
import com.example.basdatpbl.ui.kasus.satu.OneTahapDua;

import java.security.PublicKey;

import static com.example.basdatpbl.BottomActivity.PREF_KEY_FIRST_START;
import static com.example.basdatpbl.BottomActivity.REQUEST_CODE_INTRO;

public class TwoTahapSatu extends AppCompatActivity {

    TextView Pertanyaan;
    CheckBox CbSatu, CbDua, CbTiga, CbEmpat;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_tahap_satu);

        Pertanyaan = findViewById(R.id.pertayaan_kasus);
        CbSatu = findViewById(R.id.cb_satu);
        CbDua = findViewById(R.id.cb_dua);
        CbTiga = findViewById(R.id.cb_tiga);
        CbEmpat = findViewById(R.id.cb_empat);

        Pertanyaan.setText(R.string.pertanyaan_perpus);
        CbSatu.setText(R.string.masalah1_perpus);
        CbDua.setText(R.string.masalah2_perpus);
        CbTiga.setText(R.string.masalah3_perpus);
        CbEmpat.setText(R.string.masalah4_perpus);



        //Call Petunjuk penggunaan on first run
        boolean firstStart = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean(PREF_KEY_FIRST_START, true);

        //set for first start
        if (firstStart) {
            Intent intent = new Intent(this, TwoIntro.class);
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
                        if (CbSatu.isChecked() && CbEmpat.isChecked()){
                            true_header.append("Selamat jawaban anda benar");
                            false_header.append("Berikut jawaban yang salah :");
                            result.append("> Kesalahan Atribut \n");
                            unchecked.append("> Menghapus Entitas yang tidak relevan dengan database perpustakaan\n");
                            unchecked.append("> Mengubah beberapa simbol ERD \n");
                            result.append("> Ketidakcocokan Relasi antar Entitas \n");
                        }else if (CbSatu.isChecked() ){
                            true_header.append("Selamat jawaban kamu hampir benar");
                            false_header.append("Berikut jawaban yang seharusnya kamu pilih juga");
                            result.append("> Kesalahan Atribut \n");
                            unchecked.append("> Ketidakcocokan Relasi antar Entitas \n");
                        }else if (CbEmpat.isChecked()){
                            true_header.append("Selamat jawaban kamu hampir benar");
                            false_header.append("Berikut jawaban yang seharusnya kamu pilih juga");
                            unchecked.append("> Kesalahan Atribut \n");
                            result.append("> Ketidakcocokan Relasi antar Entitas \n");
                        }else {
                            true_header.append("Maaf, jawaban kamu belum sesuai");
                            false_header.append("Berikut jawaban yang seharusnya dipilih");
                            unchecked.append("> Kesalahan Atribut \n");
                            unchecked.append("> Ketidakcocokan Relasi antar Entitas \n");
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
}