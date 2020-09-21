package com.herla.basdatpbl.ui.kasus.tiga;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;

import com.herla.basdatpbl.R;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class ThreeIntro extends IntroActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setButtonBackVisible(true);
        setButtonBackFunction(BUTTON_BACK_FUNCTION_BACK);
        setButtonNextVisible(true);
        //Button cta is disabled
        setButtonCtaVisible(false);
        setButtonCtaTintMode(BUTTON_CTA_TINT_MODE_BACKGROUND);
        TypefaceSpan labelSpan = new TypefaceSpan(
                "sans-serif-medium");
        SpannableString label = SpannableString
                .valueOf("Get Started");
        label.setSpan(labelSpan, 0, label.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setButtonCtaLabel(label);

        setPageScrollDuration(500);
        setPageScrollInterpolator(android.R.interpolator.fast_out_slow_in);

        addSlide(new SimpleSlide.Builder()
                .title("Kasus di Rumah Sakit")
//                .description("Dapat melatih kemampuan pemecahan masalah")
//                .image(R.drawable.sekolah)
                .background(R.color.yellow3)
                .backgroundDark(R.color.white)
                .canGoBackward(false)
                .build());

        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Kamu adalah siswa jurusan Rekayasa Perangkat Lunak yang sedang magang di bagian IT Rumah Sakit Swasta")
                .image(R.drawable.focused_working)
                .background(R.color.yellow3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Tugas pertama yang diberikan penanggung jawabmu adalah menentukan Ketergantungan Fungsional dari kegiatan operasi yang ada di RS ini")
                .image(R.drawable.scrum_board)
                .background(R.color.yellow3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Setelah kamu analisa dan mengamati jadwal operasi di RS ini kamu mendapat beberapa informasi")
                .image(R.drawable.data_analyzing_)
                .background(R.color.yellow3)
                .backgroundDark(R.color.white)
                .build());
//        addSlide(new SimpleSlide.Builder()
////                .title("Basis Data")
//                .description("1. Kamu mengasumsikan dokter melakukan operasi pada tanggal yang telah ditentukan\n2. Operasi dilaksanakan tiap hari")
////                .image(R.drawable.ic_device_hub_black_24dp)
//                .background(R.color.yellow3)
//                .backgroundDark(R.color.white)
//                .build());
//        addSlide(new SimpleSlide.Builder()
////                .title("Kuis")
//                .description("3. Seorang dokter bertanggung jawab pada operasi yang diberikan\n4. Dokter bisa ditugaskan pada banyak operasi")
////                .image(R.drawable.ic_assignment_turned_in_black_24dp)
//                .background(R.color.yellow4)
//                .backgroundDark(R.color.white)
//                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Kuis")
                .description("Hasil pengamatanmu tadi kamu ubah menjadi sebuah tabel, dan menghasilkan tabel seperti ini")
                .image(R.drawable.kasus_tabelrs)
                .background(R.color.yellow3)
                .backgroundDark(R.color.white)
                .build());


        autoplay(2500, INFINITE);

    }

}
