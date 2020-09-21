package com.herla.basdatpbl.ui.kasus.empat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.herla.basdatpbl.BottomActivity;
import com.herla.basdatpbl.R;

public class FourTahapEmpat_2 extends AppCompatActivity {
    TextView tipeData1, tipeData2, tipeData3, tipeData4;
    TextView evalunf, eval1nf, eval2nf, eval3nf;
    ImageView img_unf, img_1nf, img_2nf, img_3nf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus_four_tahap_empat_2);

        tipeData1 = findViewById(R.id.tipedata_tabelsiswa1);
        tipeData2 = findViewById(R.id.tipedata_tabelsiswa2);
        tipeData3 = findViewById(R.id.tipedata_tabelsiswa3);
        tipeData4 = findViewById(R.id.tipedata_tabelsiswa4);

        evalunf = findViewById(R.id.evalunf);
        eval1nf = findViewById(R.id.eval1nf);
        eval2nf = findViewById(R.id.eval2nf);
        eval3nf = findViewById(R.id.eval3nf);

        img_unf = findViewById(R.id.img_unf);
        img_1nf = findViewById(R.id.img_1nf);
        img_2nf = findViewById(R.id.img_2nf);
        img_3nf = findViewById(R.id.img_3nf);

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

        String[] jawaban_nf={
                "Tidak",//0
                "Pilihan 1",//1
                "Pilihan 1",//2
                "Pilihan 1"//3
        };

        if (sTiga.equalsIgnoreCase(jawaban_nf[0])){
            tipeData1.setBackgroundResource(R.color.green1);
            img_unf.setImageResource(R.drawable.kasus_normalisasi);
        }else {
            tipeData1.setBackgroundResource(R.color.red4);
            evalunf.setText(R.string.evalunf);
            img_unf.setImageResource(R.drawable.kasus_normalisasi);
        }

        if (dTiga.equalsIgnoreCase(jawaban_nf[1])){
            tipeData2.setBackgroundResource(R.color.green1);
            img_1nf.setImageResource(R.drawable.satunfa);
        }else {
            tipeData2.setBackgroundResource(R.color.red4);
            eval1nf.setText(R.string.eval1nf);
            img_1nf.setImageResource(R.drawable.satunfb);
        }

        if (tTiga.equalsIgnoreCase(jawaban_nf[2])){
            tipeData3.setBackgroundResource(R.color.green1);
            img_2nf.setImageResource(R.drawable.duanfa);
        }else {
            tipeData3.setBackgroundResource(R.color.red4);
            eval2nf.setText(R.string.eval2nf);
            img_2nf.setImageResource(R.drawable.duanfb);
        }

        if (eTiga.equalsIgnoreCase(jawaban_nf[3])){
            tipeData4.setBackgroundResource(R.color.green1);
            img_3nf.setImageResource(R.drawable.tiganfa);
        }else {
            tipeData4.setBackgroundResource(R.color.red4);
            eval3nf.setText(R.string.eval3nf);
            img_3nf.setImageResource(R.drawable.tiganfb);
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