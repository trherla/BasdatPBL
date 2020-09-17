package com.example.basdatpbl.ui.kasus.empat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;

import java.util.ArrayList;
import java.util.List;

public class FourTahapEmpat extends AppCompatActivity {
    TextView textView1, textView2, textView3, textView4, textView5, textView6, theader1, fheader1, theader2, fheader2;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_four_tahap_empat);
        textView1 = findViewById(R.id.txtV1);
        textView2 = findViewById(R.id.txtV2);
        textView3 = findViewById(R.id.txtV3);
        textView4 = findViewById(R.id.txtV4);
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



        theader1.setText(th_satu);
        fheader1.setText(fh_satu);
        textView1.setText(r_satu);
        textView2.setText(u_satu);

        theader2.setText(th_dua);
        fheader2.setText(fh_dua);
        textView3.setText(r_dua);
        textView4.setText(u_dua);


    }

    private long backPressedTime;
    private Toast backToast;
    public void onBackPressed() {
        if(backPressedTime +2000 > System.currentTimeMillis()){
            finish();
            Intent backhome  = new Intent(getApplicationContext(), BottomActivity.class);
            startActivity(backhome);
        }else {
            backToast = Toast.makeText(getBaseContext(),"Press back again to Main Menu", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime =System.currentTimeMillis();

    }

    public void next(View view) {
        Intent selesai = new Intent(getApplicationContext(), FourTahapEmpat_2.class);

        Intent i = getIntent();

        String sTiga = i.getStringExtra("sTiga");
        String dTiga = i.getStringExtra("dTiga");
        String tTiga = i.getStringExtra("tTiga");
        String eTiga = i.getStringExtra("eTiga");


        selesai.putExtra("sTiga", sTiga);
        selesai.putExtra("dTiga", dTiga);
        selesai.putExtra("tTiga", tTiga);
        selesai.putExtra("eTiga", eTiga);

        startActivity(selesai);
    }
}