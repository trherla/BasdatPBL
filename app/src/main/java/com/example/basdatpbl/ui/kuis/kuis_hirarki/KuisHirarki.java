package com.example.basdatpbl.ui.kuis.kuis_hirarki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kuis.HasilKuis;

public class KuisHirarki extends AppCompatActivity {

    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilA, PilB, PilC, PilD;
    int nomor = 0;

    public static int hasil, benar, salah;

    String[] pertanyaan_kuis = new String[]{
                "1. Siapa nama anak Bambang",
                "2. Dimana Rumah Bambang",
                "3. Berapa kali Sekolah yang pernah ditempuh Bambang",
                "4. Jawab bebas",
                "5. Nama lengkap Bambang"
    };

    String[] pilihan_jawaban = new String[]{
            "1","2","3","4",
            "2","3","4","5",
            "9","8","7","6",
            "10","12","13","14",
            "11","13","17","12"
    };

    String[] jawaban_benar = new String[]{
            "4",
            "2",
            "7",
            "12",
            "17"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_hirarki);

        pertanyaan = (TextView) findViewById(R.id.pertanyaan);
        rg = (RadioGroup) findViewById(R.id.radio_group);
        PilA = (RadioButton) findViewById(R.id.pilihanA);
        PilB = (RadioButton) findViewById(R.id.pilihanB);
        PilC = (RadioButton) findViewById(R.id.pilihanC);
        PilD = (RadioButton) findViewById(R.id.pilihanD);

        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilA.setText(pilihan_jawaban[0]);
        PilB.setText(pilihan_jawaban[1]);
        PilC.setText(pilihan_jawaban[2]);
        PilD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;

    }

    public void next(View view){

        if (PilA.isChecked() || PilB.isChecked() || PilC.isChecked() || PilD.isChecked()) {
            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
            else salah++;
            nomor++;
            if (nomor < pertanyaan_kuis.length) {
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                PilA.setText(pilihan_jawaban[(nomor * 4) + 0]);
                PilB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilD.setText(pilihan_jawaban[(nomor * 4) + 3]);


            } else {
                hasil = benar * 20;
                Intent selesai = new Intent(getApplicationContext(), HasilKuis.class);
                startActivity(selesai);
            }
        }
        else {
                Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
    }

}