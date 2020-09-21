package com.herla.basdatpbl.ui.kasus.satu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.herla.basdatpbl.BottomActivity;
import com.herla.basdatpbl.R;

import java.util.ArrayList;
import java.util.List;

public class OneTahapTiga extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_one_tahap_tiga);

//        Spinner 1
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

        ImageButton next = findViewById(R.id.button);

        List<String> tipeData = new ArrayList<>();
        tipeData.add("Int");
        tipeData.add("Float");
        tipeData.add("Char");
        tipeData.add("Varchar");
        tipeData.add("Date");
        tipeData.add("Timestamp");

//        Tabel 1
//        Spinner 1
        spinnerA.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterA = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerA.setAdapter(spinAdapterA);

//        Spinner 2
        spinnerB.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterB = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerB.setAdapter(spinAdapterB);

//        SPinner 3
        spinnerC.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterC = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerC.setAdapter(spinAdapterC);

//      Spinner 4
        spinnerD.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterD = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerD.setAdapter(spinAdapterD);

//        Tabel 2
//        Spinner 5
        spinnerE.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterE = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerE.setAdapter(spinAdapterE);
//        Spinner 6
        spinnerF.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterF = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterF.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerF.setAdapter(spinAdapterF);

//        Spinner 7
        spinnerG.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterG = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterG.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerG.setAdapter(spinAdapterG);

//        SPinner 8
        spinnerH.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterH = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerH.setAdapter(spinAdapterH);

//      Spinner 9
        spinnerI.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterI = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterI.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerI.setAdapter(spinAdapterI);

//        Spinner 10
        spinnerJ.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterJ = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterJ.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJ.setAdapter(spinAdapterJ);

//        TABEL 3
//        Spinner 11
        spinnerK.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterK = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterK.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerK.setAdapter(spinAdapterK);

//        SPinner 12
        spinnerL.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterL = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterL.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerL.setAdapter(spinAdapterL);

//      Spinner 13
        spinnerM.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterM = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterM.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerM.setAdapter(spinAdapterM);

//        Spinner 14
        spinnerN.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterN = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterN.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerN.setAdapter(spinAdapterN);

//        Spinner 15
        spinnerO.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterO = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterO.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerO.setAdapter(spinAdapterO);

//        SPinner 16
        spinnerP.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterP = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterP.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerP.setAdapter(spinAdapterP);

//      Spinner 17
        spinnerQ.setOnItemSelectedListener(this);
        ArrayAdapter<String> spinAdapterQ = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tipeData);
        spinAdapterQ.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerQ.setAdapter(spinAdapterQ);

        next.setOnClickListener(v -> {
            AlertDialog.Builder dial = new AlertDialog.Builder(this);
//            dial.setTitle("Yakin?");
            dial.setMessage("Yakin dengan jawaban anda")
                    .setPositiveButton("Ya", (dialog, which) -> {
                        Intent selesai = new Intent(getApplicationContext(), OneTahapEmpat.class);
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