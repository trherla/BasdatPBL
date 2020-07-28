package com.example.basdatpbl.ui.kuis.kuis_hirarki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basdatpbl.R;

public class KuisHirarki extends AppCompatActivity {

    TextView pertanyaan, judul;
    RadioGroup rg;
    RadioButton PilA, PilB, PilC, PilD;
    ImageView imgKuis;
    ImageButton nxt;
    int nomor = 0;

    private long backPressedTime;
    private Toast backToast;

    public static int hasil, benar, salah;

    String[] nomor_urut = new String[]{
            "1", "2","3","4","5","6","7","8","9","10"

    };
    String[] pertanyaan_kuis = new String[]{
            "Kumpulan data yang tersimpan secara sistematik untuk dapat dilihat oleh user merupakan definisi dari ",
            "Kumpulan record sejenis yang mempunyai panjang atribut/field sama, namun berbeda isi merupakan ",
            "Perhatikan gambar berikut!\nDalam gambar berikut, nomor 1 disebut sebagai ",
            "Terdapat tiga level dalam arsitektur basis data, kecuali",
            "Karakteristik dari External level adalah",
            "Perhatikan gambar berikut!\nContoh gambar berikut terdapat pada level",
            "Karakteristik dari Conceptual level adalah",
            "Model basis data dalam gambar berikut disebut",
            "Model basis data yang memiliki karakteristik tabel dapat dinormalisasi yang membuat basis data fleksibel, mudah beradaptasi, dan dapat diskalakan merupakan model",
            "Berdasarkan pilihan jawaban berikut, yang bukan pemakai (User) dari basis data adalah"

    };

    String[] pilihan_jawaban = new String[]{
            "Arsitektur Basis Data","Conceptual Mapping","Pemodelan Data","Analisa Data",
            "Record","Field","Record","File",
            "Field","Tuple","Record","Entitas",
            "Physical Level","Logical Level","View Level","Planning Level",
            "Menghubungkan physical level dengan view level","Menampilkan data yang ingin user lihat , namun tidak semua ditampilkan","Hanya developer yang dapat melihat data","Data disimpan dalam media penyimpanan berformat byte",
            "Physical Level","Logical Level","View Level","Planning Level",
            "Menghubungkan physical level dengan view level","Menampilkan data yang ingin user lihat , namun tidak semua ditampilkan","Hanya developer yang dapat melihat data","Data disimpan dalam media penyimpanan berformat byte",
            "Relational Model","Hierarchical Model","Network Model","Entitry Relationship Model",
            "Relational Model","Hierarchical Model","Network Model","Entitry Relationship Model",
            "Programmer","Database Administrator","End User","Network Guy"
    };

    String[] jawaban_benar = new String[]{
            "Arsitektur Basis Data",
            "File",
            "Field",
            "Planning Level",
            "Menampilkan data yang ingin user lihat , namun tidak semua ditampilkan",
            "Physical Level",
            "Menghubungkan physical level dengan view level",
            "Network Model",
            "Relational Model",
            "Database Administrator",
    };

    private static final Integer[] img ={
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked,
            R.drawable.record,
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked,
            R.drawable.internallevel,
            R.drawable.rb_a_checked,
            R.drawable.atribut_key,
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_hirarki);

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

        judul.setText(nomor_urut[nomor]+"/10");
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
//    public void onBackPressed() {
//        if(backPressedTime +2000 > System.currentTimeMillis()){
//            finish();
//            Intent backhome  = new Intent(getApplicationContext(), BottomActivity.class);
//            startActivity(backhome);
//        }else {
//            backToast = Toast.makeText(getBaseContext(),"Press back again to Main Menu", Toast.LENGTH_SHORT);
//            backToast.show();
//        }
//        backPressedTime =System.currentTimeMillis();
//
//    }

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
                judul.setText(nomor_urut[nomor] +"/10" );
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                imgKuis.setImageResource(img[nomor]);
                PilA.setText(pilihan_jawaban[nomor * 4]);
                PilB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilD.setText(pilihan_jawaban[(nomor * 4) + 3]);
            } else {
                hasil = benar * 10;
                Intent selesai = new Intent(getApplicationContext(), HasilKuisHirarki.class);
                startActivity(selesai);
            }

        }
        else {
                Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
    }

}