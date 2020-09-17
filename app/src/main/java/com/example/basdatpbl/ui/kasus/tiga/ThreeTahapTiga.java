package com.example.basdatpbl.ui.kasus.tiga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kasus.satu.OneTahapEmpat;

import java.util.ArrayList;
import java.util.List;

public class ThreeTahapTiga extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_three_tahap_tiga);

        final Spinner spinnerA = findViewById(R.id.spinnerA);
        final Spinner spinnerB = findViewById(R.id.spinnerB);
        final Spinner spinnerC = findViewById(R.id.spinnerC);
        final Spinner spinnerD = findViewById(R.id.spinnerD);
        final Spinner spinnerE = findViewById(R.id.spinnerE);
        final Spinner spinnerF = findViewById(R.id.spinnerF);
        final Spinner spinnerG = findViewById(R.id.spinnerG);


        ImageButton next = findViewById(R.id.button);

        List<String> tabeloperasi = new ArrayList<>();
        tabeloperasi.add("id_dokter");
        tabeloperasi.add("nama");
        tabeloperasi.add("operasi");
        tabeloperasi.add("pasien");
        tabeloperasi.add("tgl");
        tabeloperasi.add("jam");


//        Spinner 1
        spinnerA.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterA = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerA.setAdapter(spinAdapterA);

//        Spinner 2
        spinnerB.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterB = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerB.setAdapter(spinAdapterB);

//        SPinner 3
        spinnerC.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterC = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerC.setAdapter(spinAdapterC);

//      Spinner 4
        spinnerD.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterD = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerD.setAdapter(spinAdapterD);


//        Spinner 5
        spinnerE.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterE = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerE.setAdapter(spinAdapterE);
//        Spinner 6
        spinnerF.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterF = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterF.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerF.setAdapter(spinAdapterF);

//        Spinner 7
        spinnerG.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterG = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterG.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerG.setAdapter(spinAdapterG);

//

        next.setOnClickListener(v -> {
            AlertDialog.Builder dial = new AlertDialog.Builder(this);
//            dial.setTitle("Yakin?");
            dial.setMessage("Yakin dengan jawaban anda")
                    .setPositiveButton("Ya", (dialog, which) -> {
                        Intent selesai = new Intent(getApplicationContext(), ThreeTahapEmpat.class);
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
                        selesai.putExtra("spinF", String.valueOf(spinnerF.getSelectedItem()));
                        selesai.putExtra("spinG", String.valueOf(spinnerG.getSelectedItem()));


                        startActivity(selesai);
                    })
                    .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel());
            dial.create();
            dial.show();
        });


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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}