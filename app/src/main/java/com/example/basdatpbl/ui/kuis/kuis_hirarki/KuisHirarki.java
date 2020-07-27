package com.example.basdatpbl.ui.kuis.kuis_hirarki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;

public class KuisHirarki extends AppCompatActivity {

    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilA, PilB, PilC, PilD;
    ImageView imgKuis;
    ImageButton nxt;
    int nomor = 0;

    private long backPressedTime;
    private Toast backToast;

    public static int hasil, benar, salah;

    String[] pertanyaan_kuis = new String[]{
                "1. Siapa nama anak Bambang",
                "2. Dimana Rumah Bambang",
                "3. Berapa kali Sekolah yang pernah ditempuh Bambang",
                "4. Jawab bebas",
                "5. Nama lengkap Bambang"
    };

    String[] pilihan_jawaban = new String[]{
            "Ada","Adi","Ado","Ade",
            "Lawang","Singosari","Malang","Surabaya",
            "2","3","4","5",
            "Masa sih","Ribet bet dah","ebuset","gapapa",
            "Tri Rizki Jerlambang","Tri Rizki Herlambang","Try Risky Herlambang","Tri Risky Jerlambang"
    };

    String[] jawaban_benar = new String[]{
            "Ado",
            "Lawang",
            "5",
            "gapapa",
            "Tri Rizki Herlambang"
    };

    private static final Integer[] img ={
            R.drawable.simbol_erd,
            R.drawable.ketergantungan,
            R.drawable.atribut_key,
            R.drawable.ternary,
            R.drawable.rb_a_checked
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_hirarki);

        pertanyaan = findViewById(R.id.pertanyaan);
        nxt = findViewById(R.id.nxtbutton);
        nxt.setVisibility(View.GONE);
        rg = findViewById(R.id.radio_group);
        PilA = findViewById(R.id.pilihanA);
        PilB = findViewById(R.id.pilihanB);
        PilC = findViewById(R.id.pilihanC);
        PilD = findViewById(R.id.pilihanD);
        imgKuis = findViewById(R.id.imageView2);

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
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                imgKuis.setImageResource(img[nomor]);
                PilA.setText(pilihan_jawaban[nomor * 4]);
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