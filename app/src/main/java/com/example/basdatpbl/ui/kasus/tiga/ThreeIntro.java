package com.example.basdatpbl.ui.kasus.tiga;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;

import com.example.basdatpbl.R;
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
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setPageScrollInterpolator(android.R.interpolator.fast_out_slow_in);
        }

        addSlide(new SimpleSlide.Builder()
                .title("Kasus Tiga")
//                .description("Dapat melatih kemampuan pemecahan masalah")
//                .image(R.drawable.sekolah)
                .background(R.color.yellow3)
                .backgroundDark(R.color.white)
                .canGoBackward(false)
                .build());

        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Kasus Tiga")
//                .image(R.drawable.ic_device_hub_black_24dp)
                .background(R.color.yellow4)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Kasus Tiga")
//                .image(R.drawable.ic_device_hub_black_24dp)
                .background(R.color.yellow3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Kasus Tiga")
//                .image(R.drawable.ic_device_hub_black_24dp)
                .background(R.color.yellow4)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Basis Data")
                .description("Kasus Tiga")
//                .image(R.drawable.ic_device_hub_black_24dp)
                .background(R.color.yellow3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Kuis")
                .description("Kasus Tiga")
//                .image(R.drawable.ic_assignment_turned_in_black_24dp)
                .background(R.color.yellow4)
                .backgroundDark(R.color.white)
                .build());

        autoplay(2500, INFINITE);

    }

}
