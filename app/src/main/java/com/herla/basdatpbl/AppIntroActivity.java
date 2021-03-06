package com.herla.basdatpbl;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class AppIntroActivity extends IntroActivity {
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
                .title("Problem Based Learning")
                .description("Dapat melatih kemampuan pemecahan masalah")
                .image(R.drawable.ic_sync_problem_black_24dp)
                .background(R.color.colorAccent)
                .backgroundDark(R.color.colorPrimaryDark)
                .canGoBackward(false)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Basis Data")
                .description("Materi yang dipelajari merupakan materi basis data")
                .image(R.drawable.ic_device_hub_black_24dp)
                .background(R.color.blue2)
                .backgroundDark(R.color.colorPrimaryDark)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Kuis")
                .description("Terdapat kuis sebagai latihan")
                .image(R.drawable.ic_assignment_turned_in_black_24dp)
                .background(R.color.color_light)
                .backgroundDark(R.color.colorPrimaryDark)
                .build());

        autoplay(2500, INFINITE);
    }

}
