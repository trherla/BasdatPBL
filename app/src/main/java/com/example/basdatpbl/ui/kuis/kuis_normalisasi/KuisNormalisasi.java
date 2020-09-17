package com.example.basdatpbl.ui.kuis.kuis_normalisasi;

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

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;

public class KuisNormalisasi extends AppCompatActivity {

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
            "Syarat terbentuknya tabel agar memiliki relasi yang baik adalah ",
            "Diketahui suatu tabel memiliki nilai Null di salah satu atributnya, berarti tabel ini masih dalam bentuk?",
            "Sebuah tabel disebut dalam bentuk normal pertama (1NF) ketika",
            "Tabel kelas online berikut sudah dalam bentuk normal pertama (1NF), untuk merubah ke dalam bentuk normal kedua maka pilihlah salah satu pernyataan yang paling benar",
            "Setiap atribut yang bukan kunci tidak tergantung secara fungsional terdahap atribut non-key yang lain dalam relasi tersebut (tidak terdapat ketergantungan transitif pada atribut non-key) merupakan definisi dari bentuk normal ke"

    };

    String[] pilihan_jawaban = new String[]{
            "Memiliki Entity Relationship Diagram yang spesifik","Mengandung redundansi yang sedikit mungkin","Mempunyai ketergantungan transitif pada tiap atributnya","Memungkinkan relasi untuk menambah dan mengubah data tanpa menimbulkan kesalahan",
            "UNF","1NF","2NF","3NF",
            "Tabel memenuhi bentuk normal BCNF","Atribut pada sebuah tabel tidak memiliki ketergantungan pada foreign key ","Menghilangkan dependensi transitif pada atributnya","Tabel tidak mengandung grub atribut yang berulang",
            "Perlu menghapus atribut Grade agar tidak memiliki ketergantungan kepada sebagian atribut kunci ","Memindahkan atribut TarifKelas ke sebelah kanan atribut Grade agar mudah terbaca","Perlu memisahkan tabel menjadi dua, tabel pertama berisi atribut IdKelas, Kelas, Grade sedangkan tabel kedua berisi atribut Kelas dan TarifKelas","Tidak Perlu dirubah karena sudah normal bentuk kedua (2NF)",
            "UNF","1NF","2NF","3NF"

    };

    String[] jawaban_benar = new String[]{
            "Mengandung redundansi yang sedikit mungkin",
            "UNF",
            "Tabel tidak mengandung grub atribut yang berulang",
            "Perlu memisahkan tabel menjadi dua, tabel pertama berisi atribut IdKelas, Kelas, Grade sedangkan tabel kedua berisi atribut Kelas dan TarifKelas",
            "3NF",

    };

    private static final Integer[] img ={
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked,
            R.drawable.img_soal8,
            R.drawable.rb_a_checked
    };

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_normalisasi);

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
                Intent selesai = new Intent(getApplicationContext(), HasilKuisNormalisasi.class);
                startActivity(selesai);
            }

        }
        else {
                Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
    }

}