package com.example.basdatpbl.ui.kasus.dua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AlertDialog;
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
        setContentView(R.layout.kasus_two_tahap_tiga);

//        Spinner 1 
        final Spinner spinnerA = findViewById(R.id.spinnerA);
        final Spinner spinnerB = findViewById(R.id.spinnerB);
        final Spinner spinnerC = findViewById(R.id.spinnerC);
        final Spinner spinnerD = findViewById(R.id.spinnerD);

        final Spinner spinnerE = findViewById(R.id.spinnerE);
        final Spinner spinnerF = findViewById(R.id.spinnerF);
        final Spinner spinnerG = findViewById(R.id.spinnerG);
        final Spinner spinnerH = findViewById(R.id.spinnerH);
        ImageButton next = findViewById(R.id.button);

        List<String> atribut = new ArrayList<>();
        atribut.add("Kode Denda");
        atribut.add("NIS");
        atribut.add("Tgl Pinjam");
        atribut.add("Tgl Kembali");
        atribut.add("Jumlah Denda");
        atribut.add("Tarif Denda");
        atribut.add("Lama Pinjam");
        atribut.add("No. Buku");


        List<String> rasio = new ArrayList<>();
        rasio.add("One");
        rasio.add("Many");


//        Spinner 1
        spinnerA.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterA = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, atribut);
        spinAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerA.setAdapter(spinAdapterA);

//        Spinner 2
        spinnerB.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterB = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, atribut);
        spinAdapterB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerB.setAdapter(spinAdapterB);

//        SPinner 3
        spinnerC.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterC = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, atribut);
        spinAdapterC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerC.setAdapter(spinAdapterC);

//      Spinner 4
        spinnerD.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterD = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, atribut);
        spinAdapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerD.setAdapter(spinAdapterD);

//        Tabel 2
//        Spinner 5
        spinnerE.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterE = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, atribut);
        spinAdapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerE.setAdapter(spinAdapterE);
//        Spinner 6
        spinnerF.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterF = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, atribut);
        spinAdapterF.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerF.setAdapter(spinAdapterF);

//        Spinner 7
        spinnerG.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterG = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, rasio);
        spinAdapterG.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerG.setAdapter(spinAdapterG);

//        SPinner 8
        spinnerH.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterH = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, rasio);
        spinAdapterH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerH.setAdapter(spinAdapterH);



        next.setOnClickListener(v -> {
            AlertDialog.Builder dial = new AlertDialog.Builder(this);
//            dial.setTitle("Yakin?");
            dial.setMessage("Yakin dengan jawaban anda")
                    .setPositiveButton("Ya", (dialog, which) -> {
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
                        selesai.putExtra("spinF", String.valueOf(spinnerF.getSelectedItem()));
                        selesai.putExtra("spinG", String.valueOf(spinnerG.getSelectedItem()));
                        selesai.putExtra("spinH", String.valueOf(spinnerH.getSelectedItem()));

                        startActivity(selesai);
                    })
                    .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel());
            dial.create();
            dial.show();
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