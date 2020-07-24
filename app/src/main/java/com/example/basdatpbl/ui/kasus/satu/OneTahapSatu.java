package com.example.basdatpbl.ui.kasus.satu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import com.example.basdatpbl.R;

import static com.example.basdatpbl.BottomActivity.PREF_KEY_FIRST_START;
import static com.example.basdatpbl.BottomActivity.REQUEST_CODE_INTRO;

public class OneTahapSatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_tahap_satu);

        //Call Petunjuk penggunaan on first run
        boolean firstStart = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean(PREF_KEY_FIRST_START, true);

        //set for first start
        if (!firstStart) {
            Intent intent = new Intent(this, OneIntro.class);
            startActivityForResult(intent, REQUEST_CODE_INTRO);
        }
    }
    //Function for check first run
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_INTRO) {
            if (resultCode == RESULT_OK) {
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean(PREF_KEY_FIRST_START, false)
                        .apply();
            } else {
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean(PREF_KEY_FIRST_START, true)
                        .apply();
                //User cancelled the intro so we'll finish this activity too.
                finish();
            }
        }
    }

    public void next(View view) {
        Intent selesai = new Intent(getApplicationContext(), OneTahapDua.class);
        startActivity(selesai);
    }
}

