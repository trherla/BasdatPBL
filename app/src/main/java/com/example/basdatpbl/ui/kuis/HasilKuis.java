package com.example.basdatpbl.ui.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.kuis.kuis_hirarki.KuisHirarki;

public class HasilKuis extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);

        TextView hasil = (TextView) findViewById(R.id.hasil);
        TextView nilai = (TextView) findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar : "+ KuisHirarki.benar+"\n Jawaban Salah : " +KuisHirarki.salah);
        nilai.setText(""+KuisHirarki.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent i = new Intent(getApplicationContext(), KuisHirarki.class);
        startActivity(i);

    }
}