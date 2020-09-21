package com.herla.basdatpbl.ui.kasus.satu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.herla.basdatpbl.BottomActivity;
import com.herla.basdatpbl.R;

public class OneTahapEmpat_2 extends AppCompatActivity {
    TextView tipeData1, tipeData2, tipeData3, tipeData4, tipeData5, tipeData6, tipeData7, tipeData8, tipeData9, tipeData10;
    TextView tipeData11, tipeData12, tipeData13, tipeData14, tipeData15, tipeData16, tipeData17;
    TextView deskripsiData1, deskripsiData2, deskripsiData3, deskripsiData4, deskripsiData5, deskripsiData6, deskripsiData7, deskripsiData8, deskripsiData9, deskripsiData10;
    TextView deskripsiData11, deskripsiData12, deskripsiData13, deskripsiData14, deskripsiData15, deskripsiData16, deskripsiData17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_one_tahap_empat_2);

        tipeData1 = findViewById(R.id.tipedata_tabelsiswa1);
        tipeData2 = findViewById(R.id.tipedata_tabelsiswa2);
        tipeData3 = findViewById(R.id.tipedata_tabelsiswa3);
        tipeData4 = findViewById(R.id.tipedata_tabelsiswa4);
        tipeData5 = findViewById(R.id.tipedata_tabelsiswa5);
        tipeData6 = findViewById(R.id.tipedata_tabelsiswa6);
        tipeData7 = findViewById(R.id.tipedata_tabelsiswa7);
        tipeData8 = findViewById(R.id.tipedata_tabelsiswa8);
        tipeData9 = findViewById(R.id.tipedata_tabelsiswa9);
        tipeData10 = findViewById(R.id.tipedata_tabelsiswa10);
        tipeData11 = findViewById(R.id.tipedata_tabelsiswa11);
        tipeData12 = findViewById(R.id.tipedata_tabelsiswa12);
        tipeData13 = findViewById(R.id.tipedata_tabelsiswa13);
        tipeData14 = findViewById(R.id.tipedata_tabelsiswa14);
        tipeData15 = findViewById(R.id.tipedata_tabelsiswa15);
        tipeData16 = findViewById(R.id.tipedata_tabelsiswa16);
        tipeData17 = findViewById(R.id.tipedata_tabelsiswa17);

        deskripsiData1 =findViewById(R.id.deskripsi_tabelsiswa1);
        deskripsiData2 =findViewById(R.id.deskripsi_tabelsiswa2);
        deskripsiData3 =findViewById(R.id.deskripsi_tabelsiswa3);
        deskripsiData4 =findViewById(R.id.deskripsi_tabelsiswa4);
        deskripsiData5 =findViewById(R.id.deskripsi_tabelsiswa5);
        deskripsiData6 =findViewById(R.id.deskripsi_tabelsiswa6);
        deskripsiData7 =findViewById(R.id.deskripsi_tabelsiswa7);
        deskripsiData8 =findViewById(R.id.deskripsi_tabelsiswa8);
        deskripsiData9 =findViewById(R.id.deskripsi_tabelsiswa9);
        deskripsiData10 =findViewById(R.id.deskripsi_tabelsiswa10);
        deskripsiData11 =findViewById(R.id.deskripsi_tabelsiswa11);
        deskripsiData12 =findViewById(R.id.deskripsi_tabelsiswa12);
        deskripsiData13 =findViewById(R.id.deskripsi_tabelsiswa13);
        deskripsiData14 =findViewById(R.id.deskripsi_tabelsiswa14);
        deskripsiData15 =findViewById(R.id.deskripsi_tabelsiswa15);
        deskripsiData16 =findViewById(R.id.deskripsi_tabelsiswa16);
        deskripsiData17 =findViewById(R.id.deskripsi_tabelsiswa17);


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

        tipeData1.setText(spinA);
        tipeData2.setText(spinB);
        tipeData3.setText(spinC);
        tipeData4.setText(spinD);
        tipeData5.setText(spinE);
        tipeData6.setText(spinF);
        tipeData7.setText(spinG);
        tipeData8.setText(spinH);
        tipeData9.setText(spinI);
        tipeData10.setText(spinJ);
        tipeData11.setText(spinK);
        tipeData12.setText(spinL);
        tipeData13.setText(spinM);
        tipeData14.setText(spinN);
        tipeData15.setText(spinO);
        tipeData16.setText(spinP);
        tipeData17.setText(spinQ);


        String[] jawaban_spinner={
                "Int",//0
                "Varchar",//1
                "Date",//2
                "Varchar",//3

                "Varchar",//4
                "Varchar",//5
                "Varchar",//6
                "Varchar",//7
                "Int",//8
                "Varchar",//9

                "Int",//10
                "Varchar",//11
                "Varchar",//12
                "Date",//13
                "Varchar",//14
                "Varchar",//15
                "Int",//16
        };

        if (spinA.equalsIgnoreCase(jawaban_spinner[0])){
            tipeData1.setBackgroundResource(R.color.green1);
        }else {
            tipeData1.setBackgroundResource(R.color.red4);
            deskripsiData1.setText(R.string.int_desc);
        }
        if (spinB.equalsIgnoreCase(jawaban_spinner[1])){
            tipeData2.setBackgroundResource(R.color.green1);
        }else {
            tipeData2.setBackgroundResource(R.color.red4);
            deskripsiData2.setText(R.string.varchar_desc);
        }
        if (spinC.equalsIgnoreCase(jawaban_spinner[2])){
            tipeData3.setBackgroundResource(R.color.green1);
        }else {
            tipeData3.setBackgroundResource(R.color.red4);
            deskripsiData3.setText(R.string.date_desc);
        }
        if (spinD.equalsIgnoreCase(jawaban_spinner[3])){
            tipeData4.setBackgroundResource(R.color.green1);
        }else {
            tipeData4.setBackgroundResource(R.color.red4);
            deskripsiData4.setText(R.string.varchar_desc);
        }
        //Tabel kedua
        if (spinE.equalsIgnoreCase(jawaban_spinner[4])){
            tipeData5.setBackgroundResource(R.color.green1);
        }else {
            tipeData5.setBackgroundResource(R.color.red4);
            deskripsiData5.setText(R.string.varchar_desc);
        }
        if (spinF.equalsIgnoreCase(jawaban_spinner[5])){
            tipeData6.setBackgroundResource(R.color.green1);
        }else {
            tipeData6.setBackgroundResource(R.color.red4);
            deskripsiData6.setText(R.string.varchar_desc);
        }
        if (spinG.equalsIgnoreCase(jawaban_spinner[6])){
            tipeData7.setBackgroundResource(R.color.green1);
        }else {
            tipeData7.setBackgroundResource(R.color.red4);
            deskripsiData7.setText(R.string.varchar_desc);
        }
        if (spinH.equalsIgnoreCase(jawaban_spinner[7])){
            tipeData8.setBackgroundResource(R.color.green1);
        }else {
            tipeData8.setBackgroundResource(R.color.red4);
            deskripsiData8.setText(R.string.varchar_desc);
        }
        if (spinI.equalsIgnoreCase(jawaban_spinner[8])){
            tipeData9.setBackgroundResource(R.color.green1);
        }else {
            tipeData9.setBackgroundResource(R.color.red4);
            deskripsiData9.setText(R.string.int_desc);
        }
        if (spinJ.equalsIgnoreCase(jawaban_spinner[9])){
            tipeData10.setBackgroundResource(R.color.green1);
        }else {
            tipeData10.setBackgroundResource(R.color.red4);
            deskripsiData10.setText(R.string.varchar_desc);
        }
        //Tabel 3
        if (spinK.equalsIgnoreCase(jawaban_spinner[10])){
            tipeData11.setBackgroundResource(R.color.green1);
        }else {
            tipeData11.setBackgroundResource(R.color.red4);
            deskripsiData11.setText(R.string.int_desc);
        }
        if (spinL.equalsIgnoreCase(jawaban_spinner[11])){
            tipeData12.setBackgroundResource(R.color.green1);
        }else {
            tipeData12.setBackgroundResource(R.color.red4);
            deskripsiData12.setText(R.string.varchar_desc);
        }
        if (spinM.equalsIgnoreCase(jawaban_spinner[12])){
            tipeData13.setBackgroundResource(R.color.green1);
        }else {
            tipeData13.setBackgroundResource(R.color.red4);
            deskripsiData13.setText(R.string.varchar_desc);
        }
        if (spinN.equalsIgnoreCase(jawaban_spinner[13])){
            tipeData14.setBackgroundResource(R.color.green1);
        }else {
            tipeData14.setBackgroundResource(R.color.red4);
            deskripsiData14.setText(R.string.date_desc);
        }
        if (spinO.equalsIgnoreCase(jawaban_spinner[14])){
            tipeData15.setBackgroundResource(R.color.green1);
        }else {
            tipeData15.setBackgroundResource(R.color.red4);
            deskripsiData15.setText(R.string.varchar_desc);
        }
        if (spinP.equalsIgnoreCase(jawaban_spinner[15])){
            tipeData16.setBackgroundResource(R.color.green1);
        }else {
            tipeData16.setBackgroundResource(R.color.red4);
            deskripsiData16.setText(R.string.varchar_desc);
        }
        if (spinQ.equalsIgnoreCase(jawaban_spinner[16])){
            tipeData17.setBackgroundResource(R.color.green1);
        }else {
            tipeData17.setBackgroundResource(R.color.red4);
            deskripsiData17.setText(R.string.int_desc);
        }
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
        Intent selesai = new Intent(getApplicationContext(), BottomActivity.class);
        startActivity(selesai);
    }
}