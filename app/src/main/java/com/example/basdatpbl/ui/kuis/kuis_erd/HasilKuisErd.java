package com.example.basdatpbl.ui.kuis.kuis_erd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basdatpbl.BottomActivity;
import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kuis.kuis_hirarki.KuisHirarki;

public class HasilKuisErd extends Activity {

    private long backPressedTime;
    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis_erd);

        TextView hasil = (TextView) findViewById(R.id.hasil);
        TextView nilai = (TextView) findViewById(R.id.nilai);


        hasil.setText("Jawaban Benar : "+ KuisErd.benar+"\n Jawaban Salah : " +KuisErd.salah);
        nilai.setText(""+KuisErd.hasil);
    }

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

    public void ulangi(View view){
        finish();
        Intent i = new Intent(getApplicationContext(), KuisErd.class);
        startActivity(i);
    }
    public void kuis(View view){
        finish();
        Intent i = new Intent(getApplicationContext(), BottomActivity.class);
        startActivity(i);

    }
}


