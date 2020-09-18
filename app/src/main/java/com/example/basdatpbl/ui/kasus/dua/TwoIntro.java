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
                "sans-serif-medium");
        SpannableString label = SpannableString
                .valueOf("Get Started");
        label.setSpan(labelSpan, 0, label.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setButtonCtaLabel(label);

        setPageScrollDuration(500);
        setPageScrollInterpolator(android.R.interpolator.fast_out_slow_in);

        addSlide(new SimpleSlide.Builder()
                .title("Kasus di Perpustakaan")
//                .description("Dapat melatih kemampuan pemecahan masalah")
//                .image(R.drawable.ic_sync_problem_black_24dp)
                .background(R.color.red2)
                .backgroundDark(R.color.white)
                .canGoBackward(false)
                .build());

        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Terdapat Sekolah di daerah pinggiran kota, Sekolah itu bernama SD Pintar")
                .image(R.drawable.machu_pichu)
                .background(R.color.red2)
                .backgroundDark(R.color.white)
                .build());

        addSlide(new SimpleSlide.Builder()
//                .title("Kuis")
                .description("Banyak sekali buku yang dimiliki perpustakaan SD Pintar, bahkan seringkali membuat petugas kerepotan mengelola peminjaman ketika siswa terlambat mengembalikan buku.")
                .image(R.drawable.book_lover)
                .background(R.color.red2)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Kuis")
                .description("Pengelola perpustakaan ingin memberikan denda kepada peminjam yang terlambat mengembalikan buku sebesar Rp. 500,- per hari keterlambatan")
                .image(R.drawable.bank_note)
                .background(R.color.red2)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Kuis")
                .description("Berikut merupakan ERD perpustakaan yang ada di SD Pintar")
                .image(R.drawable.kasus_erdperpus)
                .background(R.color.red2)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Kuis")
                .description("Kamu sebagai bagian IT di SD Pintar akan merubah ERD perpustakaan sesuai dengan permintaan pengelola perpustakaan. Apa yang harus kamu lakukan?")
                .image(R.drawable.career)
                .background(R.color.red2)
                .backgroundDark(R.color.white)
                .build());
        autoplay(2500, INFINITE);

    }

}

