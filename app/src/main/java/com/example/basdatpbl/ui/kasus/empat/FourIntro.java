package com.example.basdatpbl.ui.kasus.empat;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;

import com.example.basdatpbl.R;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class FourIntro extends IntroActivity {
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
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setPageScrollInterpolator(android.R.interpolator.fast_out_slow_in);
        }

        addSlide(new SimpleSlide.Builder()
                .title("Kasus di Toko Buku")
//                .description("Dapat melatih kemampuan pemecahan masalah")
//                .image(R.drawable.sekolah)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .canGoBackward(false)
                .build());

        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Sebuah Toko Buku selalu kewalahan tiap kali mendata buku baru yang ada di toko")
                .image(R.drawable.slow_working)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Setelah ditelusuri, pendataan buku sudah menggunakan komputer, namun tabel untuk mendata buku meniru dari pembukuan manual")
                .image(R.drawable.figure)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Ini adalah tabel buku yang digunakan untuk mendata buku")
                .image(R.drawable.kasus_normalisasi)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Bagaimana cara agar manajemen data buku berstruktur dengan baik?")
                .image(R.drawable.progress_)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());

        autoplay(2500, INFINITE);

    }

}
