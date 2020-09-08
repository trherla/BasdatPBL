package com.example.basdatpbl.ui.kasus.dua;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;

public class TwoTahapEmpat_2 extends AppCompatActivity {
    TextView tipeData1, tipeData2, tipeData3, tipeData4, tipeData5, tipeData6, tipeData7, tipeData8;
    TextView deskripsiData1, deskripsiData2, deskripsiData3, deskripsiData4, deskripsiData5, deskripsiData6, deskripsiData7, deskripsiData8;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_two_tahap_empat_2);

        tipeData1 = findViewById(R.id.tipedata_tabelsiswa1);
        tipeData2 = findViewById(R.id.tipedata_tabelsiswa2);
        tipeData3 = findViewById(R.id.tipedata_tabelsiswa3);
        tipeData4 = findViewById(R.id.tipedata_tabelsiswa4);
        tipeData5 = findViewById(R.id.tipedata_tabelsiswa5);
        tipeData6 = findViewById(R.id.tipedata_tabelsiswa6);
        tipeData7 = findViewById(R.id.tipedata_tabelsiswa7);
        tipeData8 = findViewById(R.id.tipedata_tabelsiswa8);


        deskripsiData1 =findViewById(R.id.deskripsi_tabelsiswa1);
        deskripsiData2 =findViewById(R.id.deskripsi_tabelsiswa2);
        deskripsiData3 =findViewById(R.id.deskripsi_tabelsiswa3);
        deskripsiData4 =findViewById(R.id.deskripsi_tabelsiswa4);
        deskripsiData5 =findViewById(R.id.deskripsi_tabelsiswa5);
        deskripsiData6 =findViewById(R.id.deskripsi_tabelsiswa6);
        deskripsiData7 =findViewById(R.id.deskripsi_tabelsiswa7);
        deskripsiData8 =findViewById(R.id.deskripsi_tabelsiswa8);



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


        tipeData1.setText(spinA);
        tipeData2.setText(spinB);
        tipeData3.setText(spinC);
        tipeData4.setText(spinD);
        tipeData5.setText(spinE);
        tipeData6.setText(spinF);
        tipeData7.setText(spinG);
        tipeData8.setText(spinH);



        String[] jawaban_spinner={
                "Kode Denda",
                "Lama Pinjam",
                "Tarif Denda",
                "Kode Denda",
                "NIS",
                "Jumlah Denda",
                "One",
                "Many",
        };

        if (spinA.equalsIgnoreCase(jawaban_spinner[0])){
            tipeData1.setBackgroundResource(R.color.green1);
        }else {
            tipeData1.setBackgroundResource(R.color.red4);
            deskripsiData1.setText(R.string.primary_desc);
        }
        if (spinB.equalsIgnoreCase(jawaban_spinner[1]) && spinC.equalsIgnoreCase(jawaban_spinner[1]) || spinB.equalsIgnoreCase(jawaban_spinner[2]) && spinC.equalsIgnoreCase(jawaban_spinner[2])){
            tipeData2.setBackgroundResource(R.color.red4);
            deskripsiData2.setText("Pilihan Jawaban sama dengan nomor 3\n\nAtribut dalam sebuah entitas sebaiknya tidak memiliki nama yang sama");
        }else if(spinB.equalsIgnoreCase(jawaban_spinner[1]) || spinB.equalsIgnoreCase(jawaban_spinner[2])){
            tipeData2.setBackgroundResource(R.color.green1);
        }else {
            tipeData2.setBackgroundResource(R.color.red4);
            deskripsiData2.setText(R.string.denda_desc);
        }

        if (spinC.equalsIgnoreCase(jawaban_spinner[1]) && spinB.equalsIgnoreCase(jawaban_spinner[1]) || spinB.equalsIgnoreCase(jawaban_spinner[2]) && spinC.equalsIgnoreCase(jawaban_spinner[2])){
            tipeData3.setBackgroundResource(R.color.red4);
            deskripsiData3.setText("Pilihan Jawaban sama dengan nomor 2\n\nAtribut dalam sebuah entitas sebaiknya tidak memiliki nama yang sama");
        }else if(spinC.equalsIgnoreCase(jawaban_spinner[1]) || spinC.equalsIgnoreCase(jawaban_spinner[2])){
            tipeData3.setBackgroundResource(R.color.green1);
        }else {
            tipeData3.setBackgroundResource(R.color.red4);
            deskripsiData3.setText(R.string.denda_desc);
        }


//        Jawaban Relasi
        if (spinD.equalsIgnoreCase(jawaban_spinner[3])){
            tipeData4.setBackgroundResource(R.color.green1);
        }else {
            tipeData4.setBackgroundResource(R.color.red4);
            deskripsiData4.setText(R.string.primary_desc);
        }

        if (spinE.equalsIgnoreCase(jawaban_spinner[4]) && spinF.equalsIgnoreCase(jawaban_spinner[4]) || spinE.equalsIgnoreCase(jawaban_spinner[5]) && spinF.equalsIgnoreCase(jawaban_spinner[5])){
            tipeData5.setBackgroundResource(R.color.red4);
            deskripsiData5.setText("Pilihan jawaban sama dengan nomor 6\n\nAtribut dalam sebuah entitas sebaiknya tidak memiliki nama yang sama");
        }else if(spinE.equalsIgnoreCase(jawaban_spinner[4]) || spinE.equalsIgnoreCase(jawaban_spinner[5])){
            tipeData5.setBackgroundResource(R.color.green1);
        }else {
            tipeData5.setBackgroundResource(R.color.red4);
            deskripsiData5.setText(R.string.bayar_desc);
        }

        if (spinF.equalsIgnoreCase(jawaban_spinner[4]) && spinE.equalsIgnoreCase(jawaban_spinner[4]) || spinE.equalsIgnoreCase(jawaban_spinner[5]) && spinF.equalsIgnoreCase(jawaban_spinner[5])){
            tipeData6.setBackgroundResource(R.color.red4);
            deskripsiData6.setText("Pilihan jawaban sama dengan nomor 5\n\nAtribut dalam sebuah entitas sebaiknya tidak memiliki nama yang sama");
        }else if(spinF.equalsIgnoreCase(jawaban_spinner[4]) || spinF.equalsIgnoreCase(jawaban_spinner[5]) ){
            tipeData6.setBackgroundResource(R.color.green1);
        }else {
            tipeData6.setBackgroundResource(R.color.red4);
            deskripsiData6.setText(R.string.bayar_desc);
        }
//        Jawaban Rasio
        if (spinG.equalsIgnoreCase(jawaban_spinner[6])){
            tipeData7.setBackgroundResource(R.color.green1);
        }else {
            tipeData7.setBackgroundResource(R.color.red4);
            deskripsiData7.setText(R.string.rasio_desc);
        }
        if (spinH.equalsIgnoreCase(jawaban_spinner[7])){
            tipeData8.setBackgroundResource(R.color.green1);
        }else {
            tipeData8.setBackgroundResource(R.color.red4);
            deskripsiData8.setText(R.string.rasio_desc);
        }
    }

    public void next(View view) {
        Intent selesai = new Intent(getApplicationContext(), BottomActivity.class);
        startActivity(selesai);
    }
}