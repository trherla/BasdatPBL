package com.example.basdatpbl.ui.kasus.dua;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;

import java.util.ArrayList;
import java.util.List;

public class TwoTahapEmpat extends AppCompatActivity {
    TextView textView1, textView2, textView3, textView4, textView5, textView6, theader1, fheader1, theader2, fheader2;
//    private long backPressedTime;
//    private Toast backToast;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_two_tahap_empat);

        textView1 = findViewById(R.id.txtV1);
        textView2 = findViewById(R.id.txtV2);
        textView3 = findViewById(R.id.txtV3);
        textView4 = findViewById(R.id.txtV4);
        textView5 = findViewById(R.id.txtV5);
        textView6 = findViewById(R.id.txtV6);
        theader1 = findViewById(R.id.theader1);
        fheader1 = findViewById(R.id.fheader1);
        theader2 = findViewById(R.id.theader2);
        fheader2 = findViewById(R.id.fheader2);

//        textView1.setText();
//        textView2.setText();
//        textView3.setText();
//        textView4.setText();

        Intent i = getIntent();
        String r_satu = i.getStringExtra("resultSatu");
        String u_satu = i.getStringExtra("unSatu");
        String th_satu = i.getStringExtra("thSatu");
        String fh_satu = i.getStringExtra("fhSatu");

        String r_dua = i.getStringExtra("resultDua");
        String u_dua = i.getStringExtra("unDua");
        String th_dua = i.getStringExtra("thDua");
        String fh_dua = i.getStringExtra("fhDua");

        String spinA = i.getStringExtra("spinA");
        String spinB = i.getStringExtra("spinB");
        String spinC = i.getStringExtra("spinC");
        String spinD = i.getStringExtra("spinD");
        String spinE = i.getStringExtra("spinE");

        theader1.setText(th_satu);
        fheader1.setText(fh_satu);
        textView1.setText(r_satu);
        textView2.setText(u_satu);

        theader2.setText(th_dua);
        fheader2.setText(fh_dua);
        textView3.setText(r_dua);
        textView4.setText(u_dua);


        String[] jawaban_spinner={
                "TK",
                "Lawang",
                "SMA",
                "Shogun",
                "Brio"
        };

        StringBuilder kecocokan = new StringBuilder();
        if (spinA.equalsIgnoreCase(jawaban_spinner[0])){
            kecocokan.append("Benar \n");
        }else {
            kecocokan.append("Salah \n");
        }
        if (spinB.equalsIgnoreCase(jawaban_spinner[1])){
            kecocokan.append("Benar \n");
        }else {
            kecocokan.append("Salah \n");
        }
        if (spinC.equalsIgnoreCase(jawaban_spinner[2])){
            kecocokan.append("Benar \n");
        }else {
            kecocokan.append("Salah \n");
        }
        if (spinD.equalsIgnoreCase(jawaban_spinner[3])){
            kecocokan.append("Benar \n");
        }else {
            kecocokan.append("Salah \n");
        }
        if (spinE.equalsIgnoreCase(jawaban_spinner[4])){
            kecocokan.append("Benar \n");
        }else {
            kecocokan.append("Salah \n");
        }
        String cocok = kecocokan.toString();

        List<String> spin = new ArrayList<>();
        spin.add(spinA);
        spin.add(spinB);
        spin.add(spinC);
        spin.add(spinD);
//spin.get(3) untuk mengambil urutan ke 4

        textView5.setText(spinA + spinB + spinC + spinD + spinE);
        textView6.setText(cocok);
    }
//    public void onBackPressed() {
//        if(backPressedTime +2000 > System.currentTimeMillis()){
//            finish();
//            Intent backhome  = new Intent(getApplicationContext(), BottomActivity.class);
//            startActivity(backhome);
//        }else {
//            backToast = Toast.makeText(getBaseContext(),"Press back again to menu", Toast.LENGTH_SHORT);
//            backToast.show();
//        }
//        backPressedTime =System.currentTimeMillis();
//
//    }
    public void next(View view) {
        Intent selesai = new Intent(getApplicationContext(), BottomActivity.class);
        startActivity(selesai);
    }
}