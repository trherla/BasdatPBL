package com.herla.basdatpbl.ui.kuis.kuis_ketergantungan;

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

import com.herla.basdatpbl.BottomActivity;
import com.herla.basdatpbl.R;

public class KuisKetergantungan extends AppCompatActivity {

    TextView pertanyaan, judul;
    RadioGroup rg;
    RadioButton PilA, PilB, PilC, PilD;
    ImageView imgKuis;
    ImageButton nxt;
    int nomor = 0;

    private long backPressedTime;

    public static int hasil, benar, salah;

    String[] nomor_urut = new String[]{
            "1", "2","3","4","5"

    };
    String[] pertanyaan_kuis = new String[]{
            "Ketergantungan Fungsional adalah  ",
            "Ketergantungan Fungsional yang tepat pada tabel berikut adalah ",
            "Diketahui pada suatu relasi memiliki atribut NIP, Nama, JenisKelamin, Pendidikan, TahunLulus.\nDalam Relasi ini memiliki ketergantungan Fungsional\n{NIP, Pendidikan} -> TahunLulus.\nMaka: NIP -> Nama disebut sebagai ",
            "Syarat suatu atribut dikatakan dependensi penuh terhadap atribut lain jika",
            "Amati tabel berikut ini, Ketergantungan Fungsional Transitif yang terdapat pada tabel berikut adalah",

    };

    String[] pilihan_jawaban = new String[]{
            "Batasan yang menghasilkan konsep kunci","Keterkaitan antara dua atribut","Konsep yang menjelaskan tentang hubungan antar entitas","Acuan dekomposisi entitas ke dalam bentuk yang lebih efisien",
            "X -> Y","X -> Z","Y -> Z","Z -> X",
            "Ketergantungan Sepenuhnya","Ketergantungan Sebagian","Ketergantungan Penuh","Ketergantungan Transitif",
            "Atribut B mempunyai dependensi fungsional terhadap atribut A dan begitupun sebaliknya","Ketergantungan fungsional terjadi pada tiga buah atribut","Atribut B mempunyai ketergantungan fungsional terhadap atribut A namun atribut B tidak memiliki dependensi terhadap bagian dari atribut A","Atribut B memiliki dependensi terhadap sebagian dari atribut A",
            "IdPembeli -> KodeKota","IdPembeli -> IdBarang","IdPembeli -> Kota","KodeKota -> Kota"
    };

    String[] jawaban_benar = new String[]{
            "Keterkaitan antara dua atribut",
            "Y -> Z",
            "Ketergantungan Sebagian",
            "Atribut B mempunyai dependensi fungsional terhadap atribut A dan begitupun sebaliknya",
            "IdPembeli -> Kota",
    };

    private static final Integer[] img ={
            R.drawable.rb_a_checked,
            R.drawable.img_soal6,
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked,
            R.drawable.img_soal7
    };

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_ketergantungan);

        judul = findViewById(R.id.jud);
        pertanyaan = findViewById(R.id.pertanyaan);
        nxt = findViewById(R.id.nxtbutton);
        nxt.setVisibility(View.GONE);
        rg = findViewById(R.id.radio_group);
        PilA = findViewById(R.id.pilihanA);
        PilB = findViewById(R.id.pilihanB);
        PilC = findViewById(R.id.pilihanC);
        PilD = findViewById(R.id.pilihanD);
        imgKuis = findViewById(R.id.imageView2);

        judul.setText(nomor_urut[nomor]+"/5");
        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilA.setText(pilihan_jawaban[0]);
        PilB.setText(pilihan_jawaban[1]);
        PilC.setText(pilihan_jawaban[2]);
        PilD.setText(pilihan_jawaban[3]);


        rg.check(0);
        benar = 0;
        salah = 0;
        nxt.setVisibility(View.GONE);
        nxt.animate().translationY(nxt.getHeight());



    }

    public void onRBClicked (View view){
        boolean isSelected = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.pilihanA:
            case R.id.pilihanD:
            case R.id.pilihanB:
            case R.id.pilihanC:
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
    public void onBackPressed() {
        if(backPressedTime +2000 > System.currentTimeMillis()){
            finish();
            Intent backhome  = new Intent(getApplicationContext(), BottomActivity.class);
            startActivity(backhome);
        }else {
            Toast backToast = Toast.makeText(getBaseContext(), "Press back again to Main Menu", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime =System.currentTimeMillis();

    }

    @SuppressLint("SetTextI18n")
    public void next(View view){

        if (PilA.isChecked() || PilB.isChecked() || PilC.isChecked() || PilD.isChecked()) {
            RadioButton jawaban_user = findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            nxt.setVisibility(View.GONE);
            nxt.animate().translationY(nxt.getHeight());
            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
            else salah++;
            nomor++;

            if (nomor < pertanyaan_kuis.length) {
                judul.setText(nomor_urut[nomor] +"/5" );
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                imgKuis.setImageResource(img[nomor]);
                PilA.setText(pilihan_jawaban[nomor * 4]);
                PilB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilD.setText(pilihan_jawaban[(nomor * 4) + 3]);
            } else {
                hasil = benar * 20;
                Intent selesai = new Intent(getApplicationContext(), HasilKuisKetergantungan.class);
                startActivity(selesai);
            }

        }
        else {
                Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
    }

}