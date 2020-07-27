package com.example.basdatpbl.ui.kasus.dua;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basdatpbl.R;

import java.util.ArrayList;
import java.util.List;

public class TwoTahapTiga extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

//    private long backPressedTime;
//    private Toast backToast;

    String[] pendidikan = {"SD", "SMP", "SMA", "STRATA 1", "STRATA 2", "STRATA 3"};
    String[] alamat = {"Lawang", "Malang", "Purwosari", "Purwodadi"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_tahap_tiga);

//        Spinner 1 
        final Spinner spinnerA = findViewById(R.id.spinnerA);
        final Spinner spinnerB = findViewById(R.id.spinnerB);
        final Spinner spinnerC = findViewById(R.id.spinnerC);
        final Spinner spinnerD = findViewById(R.id.spinnerD);
        final Spinner spinnerE = findViewById(R.id.spinnerE);
        ImageButton next = findViewById(R.id.button);

        List<String> categories = new ArrayList<>();
        categories.add("TK");
        categories.add("SD");
        categories.add("SMP");
        categories.add("SMA");

        List<String> spd = new ArrayList<>();
        spd.add("Shogun");
        spd.add("Beat");
        spd.add("Revo");
        spd.add("NMax");
        spd.add("Jupiter");
        spd.add("Spin");

        List<String> mbl = new ArrayList<>();
        mbl.add("Yaris");
        mbl.add("Jazz");
        mbl.add("Brio");

        spinnerA.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterA = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        spinAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerA.setAdapter(spinAdapterA);

//        Spinner 2
        spinnerB.setOnItemSelectedListener(this);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, alamat);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerB.setAdapter(arrayAdapter1);

//        SPinner 3
        spinnerC.setOnItemSelectedListener(this);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pendidikan);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerC.setAdapter(arrayAdapter2);

//      Spinner 4
        spinnerD.setOnItemSelectedListener(this);
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spd);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerD.setAdapter(arrayAdapter3);

//        Spinner 5
        spinnerE.setOnItemSelectedListener(this);
        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, mbl);
        arrayAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerE.setAdapter(arrayAdapter4);



        next.setOnClickListener(v -> {
            Intent selesai = new Intent(getApplicationContext(), TwoTahapEmpat.class);
//receive value from activity one and two

            Intent i = getIntent();
            String r_satu = i.getStringExtra("resultSatu");
            String u_satu = i.getStringExtra("unSatu");
            String th_satu = i.getStringExtra("thSatu");
            String fh_satu = i.getStringExtra("fhSatu");

            String r_dua = i.getStringExtra("resultDua");
            String u_dua = i.getStringExtra("unDua");
            String th_dua = i.getStringExtra("thDua");
            String fh_dua = i.getStringExtra("fhDua");

            selesai.putExtra("resultSatu", r_satu);
            selesai.putExtra("unSatu", u_satu);
            selesai.putExtra("thSatu", th_satu);
            selesai.putExtra("fhSatu", fh_satu);

            selesai.putExtra("resultDua", r_dua);
            selesai.putExtra("unDua", u_dua);
            selesai.putExtra("thDua", th_dua);
            selesai.putExtra("fhDua", fh_dua);

            selesai.putExtra("spinA", String.valueOf(spinnerA.getSelectedItem()));
            selesai.putExtra("spinB", String.valueOf(spinnerB.getSelectedItem()));
            selesai.putExtra("spinC", String.valueOf(spinnerC.getSelectedItem()));
            selesai.putExtra("spinD", String.valueOf(spinnerD.getSelectedItem()));
            selesai.putExtra("spinE", String.valueOf(spinnerE.getSelectedItem()));

            startActivity(selesai);
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        Toast.makeText(getApplicationContext(), pendidikan[position], Toast.LENGTH_LONG).show();
//        String item = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

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

}