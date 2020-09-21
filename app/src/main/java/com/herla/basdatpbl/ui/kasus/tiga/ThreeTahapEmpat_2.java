package com.herla.basdatpbl.ui.kasus.tiga;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.herla.basdatpbl.BottomActivity;
import com.herla.basdatpbl.R;

public class ThreeTahapEmpat_2 extends AppCompatActivity {
    TextView RspinA, RspinB, RspinC, RspinD, RspinE, RspinF, RspinG, descFullD, descFully;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_three_tahap_empat_2);

        RspinA = findViewById(R.id.ResultSpinnerA);
        RspinB = findViewById(R.id.ResultSpinnerB);
        RspinC = findViewById(R.id.ResultSpinnerC);
        RspinD = findViewById(R.id.ResultSpinnerD);
        RspinE = findViewById(R.id.ResultSpinnerE);
        RspinF = findViewById(R.id.ResultSpinnerF);
        RspinG = findViewById(R.id.ResultSpinnerG);


        descFullD =findViewById(R.id.DescFullD);
        descFully =findViewById(R.id.DescFully);



        Intent i = getIntent();

        //        Tahap tiga
        String spinA = i.getStringExtra("spinA");
        String spinB = i.getStringExtra("spinB");
        String spinC = i.getStringExtra("spinC");
        String spinD = i.getStringExtra("spinD");
        String spinE = i.getStringExtra("spinE");
        String spinF = i.getStringExtra("spinF");
        String spinG = i.getStringExtra("spinG");



        RspinA.setText(spinA);
        RspinB.setText(spinB);
        RspinC.setText(spinC);
        RspinD.setText(spinD);
        RspinE.setText(spinE);
        RspinF.setText(spinF);
        RspinG.setText(spinG);



        String[] jawaban_spinner={
                "id_dokter",//0
                "nama",//1
                "operasi",//2
                "tgl",//3
                "jam",//4
                "pasien"//5
        };

        if (spinA.equalsIgnoreCase(jawaban_spinner[0]) && spinB.equalsIgnoreCase(jawaban_spinner[1])) {
            RspinA.setBackgroundResource(R.color.green1);
            RspinB.setBackgroundResource(R.color.green1);
        } else if (spinA.equalsIgnoreCase(jawaban_spinner[1]) && spinB.equalsIgnoreCase(jawaban_spinner[0])) {
            RspinA.setBackgroundResource(R.color.green1);
            RspinB.setBackgroundResource(R.color.green1);
        } else {
            RspinA.setBackgroundResource(R.color.red4);
            RspinB.setBackgroundResource(R.color.red4);
            descFullD.setText(R.string.evalfull);
        }

        if (spinG.equalsIgnoreCase(jawaban_spinner[5])){
            RspinG.setBackgroundResource(R.color.green1);
        }else{
            RspinG.setBackgroundResource(R.color.red4);
            descFully.setText(R.string.evalsepenuhnyaR);
        }

        if (spinC.equalsIgnoreCase(spinD) || spinC.equalsIgnoreCase(spinE) || spinC.equalsIgnoreCase(spinF) ){
            RspinC.setBackgroundResource(R.color.red4);
            descFully.setText(R.string.evalmirip);
        }else if(spinC.equalsIgnoreCase(jawaban_spinner[0]) || spinC.equalsIgnoreCase(jawaban_spinner[2]) || spinC.equalsIgnoreCase(jawaban_spinner[3]) ||  spinC.equalsIgnoreCase(jawaban_spinner[4])){
            RspinC.setBackgroundResource(R.color.green1);
        }else{
            RspinC.setBackgroundResource(R.color.red4);
            descFully.setText(R.string.evalsepenuhnyaP);
        }

        if (spinD.equalsIgnoreCase(spinC) || spinD.equalsIgnoreCase(spinE) || spinD.equalsIgnoreCase(spinF) ){
            RspinD.setBackgroundResource(R.color.red4);
            descFully.setText(R.string.evalmirip);
        }else if(spinD.equalsIgnoreCase(jawaban_spinner[0]) || spinD.equalsIgnoreCase(jawaban_spinner[2]) || spinD.equalsIgnoreCase(jawaban_spinner[3]) ||  spinD.equalsIgnoreCase(jawaban_spinner[4])){
            RspinD.setBackgroundResource(R.color.green1);
        }else{
            RspinD.setBackgroundResource(R.color.red4);
            descFully.setText(R.string.evalsepenuhnyaP);
        }

        if (spinE.equalsIgnoreCase(spinC) || spinE.equalsIgnoreCase(spinD) || spinE.equalsIgnoreCase(spinF) ){
            RspinE.setBackgroundResource(R.color.red4);
            descFully.setText(R.string.evalmirip);
        }else if(spinE.equalsIgnoreCase(jawaban_spinner[0]) || spinE.equalsIgnoreCase(jawaban_spinner[2]) || spinE.equalsIgnoreCase(jawaban_spinner[3]) ||  spinE.equalsIgnoreCase(jawaban_spinner[4])){
            RspinE.setBackgroundResource(R.color.green1);
        }else{
            RspinE.setBackgroundResource(R.color.red4);
            descFully.setText(R.string.evalsepenuhnyaP);
        }

        if (spinF.equalsIgnoreCase(spinC) || spinF.equalsIgnoreCase(spinD) || spinF.equalsIgnoreCase(spinE) ){
            RspinF.setBackgroundResource(R.color.red4);
            descFully.setText(R.string.evalmirip);
        }else if(spinF.equalsIgnoreCase(jawaban_spinner[0]) || spinF.equalsIgnoreCase(jawaban_spinner[2]) || spinF.equalsIgnoreCase(jawaban_spinner[3]) ||  spinF.equalsIgnoreCase(jawaban_spinner[4])){
            RspinF.setBackgroundResource(R.color.green1);
        }else{
            RspinF.setBackgroundResource(R.color.red4);
            descFully.setText(R.string.evalsepenuhnyaP);
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