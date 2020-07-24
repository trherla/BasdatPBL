package com.example.basdatpbl.ui.kasus.satu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.basdatpbl.R;

public class OneTahapTiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_tahap_tiga);
    }

    public void next(View view) {
        Intent selesai = new Intent(getApplicationContext(), OneTahapEmpat.class);
        startActivity(selesai);
    }
}