package com.example.basdatpbl.ui.kasus.dua;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;

import com.example.basdatpbl.R;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class TwoIntro extends IntroActivity {

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
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP ? "sans-serif-medium" : "sans serif");
        SpannableString label = SpannableString
                .valueOf("Get Started");
        label.setSpan(labelSpan, 0, label.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setButtonCtaLabel(label);

        setPageScrollDuration(500);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setPageScrollInterpolator(android.R.interpolator.fast_out_slow_in);
        }

        addSlide(new SimpleSlide.Builder()
                .title("Kasus Perpustakaan")
//                .description("Dapat melatih kemampuan pemecahan masalah")
                .image(R.drawable.ic_sync_problem_black_24dp)
                .background(R.color.red2)
                .backgroundDark(R.color.white)
                .canGoBackward(false)
                .build());

        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Terdapat Sekolah di daerah pinggiran kota, Sekolah itu bernama SD Pintar")
                .image(R.drawable.machu_pichu)
                .background(R.color.red3)
                .backgroundDark(R.color.white)
                .build());

        addSlide(new SimpleSlide.Builder()
//                .title("Kuis")
                .description("Minat baca di sekolah ini sangat tinggi, penjaga perpustakaan sampai kerepotan mengatur peminjaman buku secara manual.")
                .image(R.drawable.book_lover)
                .background(R.color.red5)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Kuis")
                .description("Karena bantuan dana dari pemerintah baru keluar, Kepala sekolah memiliki rencana untuk meningkatkan sistem peminjaman buku di perpustakaan SD Pintar.")
                .image(R.drawable.bank_note)
                .background(R.color.red4)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Kuis")
                .description("Kepala sekolah meminta bantuanmu untuk merencanakan manajemen peminjaman buku di SD Cerdas")
                .image(R.drawable.career)
                .background(R.color.red1)
                .backgroundDark(R.color.white)
                .build());
        autoplay(2500, INFINITE);

    }

}

