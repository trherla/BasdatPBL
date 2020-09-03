package com.example.basdatpbl.ui.kasus.satu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;

import java.util.ArrayList;
import java.util.List;

public class OneTahapEmpat extends AppCompatActivity {
    TextView textView1, textView2, textView3, textView4, textView5, textView6, theader1, fheader1, theader2, fheader2;
    TextView tipeData1, tipeData2, tipeData3, tipeData4, tipeData5, tipeData6, tipeData7, tipeData8, tipeData9, tipeData10;
    TextView tipeData11, tipeData12, tipeData13, tipeData14, tipeData15, tipeData16, tipeData17;
    TextView deskripsiData1, deskripsiData2, deskripsiData3, deskripsiData4, deskripsiData5, deskripsiData6, deskripsiData7, deskripsiData8, deskripsiData9, deskripsiData10;
    TextView deskripsiData11, deskripsiData12, deskripsiData13, deskripsiData14, deskripsiData15, deskripsiData16, deskripsiData17;
    @SuppressLint({"SetTextI18n", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_one_tahap_empat);
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



        Intent i = getIntent();
//        Tahap Satu
        String r_satu = i.getStringExtra("resultSatu");
        String u_satu = i.getStringExtra("unSatu");
        String th_satu = i.getStringExtra("thSatu");
        String fh_satu = i.getStringExtra("fhSatu");

//        Tahap dua
        String r_dua = i.getStringExtra("resultDua");
        String u_dua = i.getStringExtra("unDua");
        String th_dua = i.getStringExtra("thDua");
        String fh_dua = i.getStringExtra("fhDua");



        theader1.setText(th_satu);
        fheader1.setText(fh_satu);
        textView1.setText(r_satu);
        textView2.setText(u_satu);

        theader2.setText(th_dua);
        fheader2.setText(fh_dua);
        textView3.setText(r_dua);
        textView4.setText(u_dua);



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
        Intent selesai = new Intent(getApplicationContext(), OneTahapEmpat_2.class);

        Intent i = getIntent();
        //        Tahap tiga
        String spinA = i.getStringExtra("spinA");
        String spinB = i.getStringExtra("spinB");
        String spinC = i.getStringExtra("spinC");
        String spinD = i.getStringExtra("spinD");
        String spinE = i.getStringExtra("spinE");
        String spinF = i.getStringExtra("spinF");
        String spinG = i.getStringExtra("spinG");
        String spinH = i.getStringExtra("spinH");
        String spinI = i.getStringExtra("spinI");
        String spinJ = i.getStringExtra("spinJ");
        String spinK = i.getStringExtra("spinK");
        String spinL = i.getStringExtra("spinL");
        String spinM = i.getStringExtra("spinM");
        String spinN = i.getStringExtra("spinN");
        String spinO = i.getStringExtra("spinO");
        String spinP = i.getStringExtra("spinP");
        String spinQ = i.getStringExtra("spinQ");
        selesai.putExtra("spinA", spinA);
        selesai.putExtra("spinB", spinB);
        selesai.putExtra("spinC", spinC);
        selesai.putExtra("spinD", spinD);
        selesai.putExtra("spinE", spinE);
        selesai.putExtra("spinF", spinF);
        selesai.putExtra("spinG", spinG);
        selesai.putExtra("spinH", spinH);
        selesai.putExtra("spinI", spinI);
        selesai.putExtra("spinJ", spinJ);
        selesai.putExtra("spinK", spinK);
        selesai.putExtra("spinL", spinL);
        selesai.putExtra("spinM", spinM);
        selesai.putExtra("spinN", spinN);
        selesai.putExtra("spinO", spinO);
        selesai.putExtra("spinP", spinP);
        selesai.putExtra("spinQ", spinQ);

        startActivity(selesai);
    }
}