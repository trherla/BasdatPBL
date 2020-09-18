package com.example.basdatpbl.ui.kasus.satu;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;

import com.example.basdatpbl.R;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class OneIntro extends IntroActivity {
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
                .title("Kasus di Sekolah")
//                .description("Dapat melatih kemampuan pemecahan masalah")
//                .image(R.drawable.sekolah)
                .background(R.color.blue3)
                .backgroundDark(R.color.white)
                .canGoBackward(false)
                .build());

        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Teman lama mu yang bernama Edi, akan mendirikan sebuah sekolah baru yang bernama SMP Harapan Bangsa")
                .image(R.drawable.conversation_)
                .background(R.color.blue3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Sekolah baru yang akan didirikan ini akan membuka penerimaan siswa pada tahun depan")
                .image(R.drawable.school)
                .background(R.color.blue3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Namun sebelum sekolah dibuka, Edi bingung bagaimana melakukan manajemen penjadwalan mata pelajaran")
                .image(R.drawable.manager_)
                .background(R.color.blue3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Kamu sebagai seseorang yang memiliki pengetahuan mengenai manajemen data akan membantu Edi")
                .image(R.drawable.team_presentation_)
                .background(R.color.blue3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Kuis")
                .description("Kamu perlu merencanakan apa saja data yang perlu dimanajemen untuk sekolah Edi?")
                .image(R.drawable.thinking)
                .background(R.color.blue3)
                .backgroundDark(R.color.white)
                .build());

        autoplay(2500, INFINITE);

    }

}
