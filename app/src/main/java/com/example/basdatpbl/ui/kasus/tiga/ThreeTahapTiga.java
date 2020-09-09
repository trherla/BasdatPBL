package com.example.basdatpbl.ui.kasus.tiga;

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
        final Spinner spinnerH = findViewById(R.id.spinnerH);
        final Spinner spinnerI = findViewById(R.id.spinnerI);
        final Spinner spinnerJ = findViewById(R.id.spinnerJ);

        final Spinner spinnerK = findViewById(R.id.spinnerK);
        final Spinner spinnerL = findViewById(R.id.spinnerL);
        final Spinner spinnerM = findViewById(R.id.spinnerM);
        final Spinner spinnerN = findViewById(R.id.spinnerN);
        final Spinner spinnerO = findViewById(R.id.spinnerO);
        final Spinner spinnerP = findViewById(R.id.spinnerP);
        final Spinner spinnerQ = findViewById(R.id.spinnerQ);
        final Spinner spinnerR = findViewById(R.id.spinnerR);

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

//        SPinner 8
        spinnerH.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterH = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerH.setAdapter(spinAdapterH);

//      Spinner 9
        spinnerI.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterI = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterI.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerI.setAdapter(spinAdapterI);

//        Spinner 10
        spinnerJ.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterJ = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterJ.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJ.setAdapter(spinAdapterJ);

//        Spinner 11
        spinnerK.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterK = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterK.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerK.setAdapter(spinAdapterK);

//        SPinner 12
        spinnerL.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterL = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterL.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerL.setAdapter(spinAdapterL);

//      Spinner 13
        spinnerM.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterM = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterM.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerM.setAdapter(spinAdapterM);

//        Spinner 14
        spinnerN.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterN = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterN.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerN.setAdapter(spinAdapterN);

//        Spinner 15
        spinnerO.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterO = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterO.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerO.setAdapter(spinAdapterO);

//        SPinner 16
        spinnerP.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterP = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterP.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerP.setAdapter(spinAdapterP);

//      Spinner 17
        spinnerQ.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterQ = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterQ.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerQ.setAdapter(spinAdapterQ);

//      Spinner 18
        spinnerR.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterR = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tabeloperasi);
        spinAdapterR.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerR.setAdapter(spinAdapterR);

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
                        selesai.putExtra("spinH", String.valueOf(spinnerH.getSelectedItem()));
                        selesai.putExtra("spinI", String.valueOf(spinnerI.getSelectedItem()));
                        selesai.putExtra("spinJ", String.valueOf(spinnerJ.getSelectedItem()));
                        selesai.putExtra("spinK", String.valueOf(spinnerK.getSelectedItem()));
                        selesai.putExtra("spinL", String.valueOf(spinnerL.getSelectedItem()));
                        selesai.putExtra("spinM", String.valueOf(spinnerM.getSelectedItem()));
                        selesai.putExtra("spinN", String.valueOf(spinnerN.getSelectedItem()));
                        selesai.putExtra("spinO", String.valueOf(spinnerO.getSelectedItem()));
                        selesai.putExtra("spinP", String.valueOf(spinnerP.getSelectedItem()));
                        selesai.putExtra("spinQ", String.valueOf(spinnerQ.getSelectedItem()));
                        selesai.putExtra("spinR", String.valueOf(spinnerR.getSelectedItem()));


                        startActivity(selesai);
                    })
                    .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel());
            dial.create();
            dial.show();
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}