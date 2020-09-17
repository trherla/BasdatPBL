package com.example.basdatpbl.ui.kasus.empat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;

public class FourTahapEmpat_2 extends AppCompatActivity {
    TextView tipeData1, tipeData2, tipeData3, tipeData4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_four_tahap_empat_2);

        tipeData1 = findViewById(R.id.tipedata_tabelsiswa1);
        tipeData2 = findViewById(R.id.tipedata_tabelsiswa2);
        tipeData3 = findViewById(R.id.tipedata_tabelsiswa3);
        tipeData4 = findViewById(R.id.tipedata_tabelsiswa4);



        Intent i = getIntent();

        //        Tahap tiga
        String sTiga = i.getStringExtra("sTiga");
        String dTiga = i.getStringExtra("dTiga");
        String tTiga = i.getStringExtra("tTiga");
        String eTiga = i.getStringExtra("eTiga");


        tipeData1.setText(sTiga);
        tipeData2.setText(dTiga);
        tipeData3.setText(tTiga);
        tipeData4.setText(eTiga);


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