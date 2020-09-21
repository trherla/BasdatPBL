package com.example.basdatpbl.ui.awal;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;

import com.example.basdatpbl.R;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class KasusIntro extends IntroActivity {
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
                .title("Cara Mengerjakan Kasus")
//                .description("Dapat melatih kemampuan pemecahan masalah")
//                .image(R.drawable.sekolah)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .canGoBackward(false)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Orientasi Masalah")
//                .description("Langkah pertama dalam menyelesaikan kasus adalah mengetahui permasalahan dari sebuah kasus, pengguna pada tahap ini akan diberikan ilustrasi permasalahan dengan contoh gambar")
                .image(R.drawable.orientasi_masalah)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title("Orientasi Masalah")
                .description("Langkah pertama dalam menyelesaikan kasus adalah mengetahui permasalahan dari sebuah kasus, pengguna pada tahap ini akan diberikan ilustrasi permasalahan dengan contoh gambar")
//                .image(R.drawable.orientasi_masalah)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Penentuan Masalah Pokok")
//                .description("Setelah membaca ilustrasi dari tahap sebelumnya, pengguna diwajibkan memilih satu atau lebih pilihan masalah sesuai dengan pemahaman yang didapat setelah membaca ilustrasi.")
                .image(R.drawable.penentuan_masalah)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title("Penentuan Masalah Pokok")
                .description("Setelah membaca ilustrasi dari tahap sebelumnya, pengguna diwajibkan memilih satu atau lebih pilihan masalah sesuai dengan pemahaman yang didapat setelah membaca ilustrasi.")
//                .image(R.drawable.penentuan_masalah)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Penentuan Masalah Pokok")
                .description("Jika masih belum memahami ilustrasi dari tahap sebelumnya, user bisa menekan tombol di kanan atas untuk melihat kembali ilustrasi permasalahan")
                .image(R.drawable.penentuan_masalah2)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Perencanaan Penyelesaian Masalah")
//                .description("Tahap ketiga adalah menentukan cara penyelesaian / solusi untuk menyelesaikan masalah yang sudah dipilih di tahap sebelumnya. Pada tahap ketiga ini, user dapat memilih jawaban lebih dari satu")
                .image(R.drawable.perencanaan_penyelesaian)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title("Perencanaan Penyelesaian Masalah")
                .description("Tahap ketiga adalah menentukan cara penyelesaian / solusi untuk menyelesaikan masalah yang sudah dipilih di tahap sebelumnya. Pada tahap ketiga ini, user dapat memilih jawaban lebih dari satu")
//                .image(R.drawable.perencanaan_penyelesaian)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Pelaksanaan Rencana")
//                .description("Pada tahap keempat ini, user akan menyampaikan hasil dari penyelesaian permmasalahan yang sebelumnya telah dipilih di awal. Penyampaian hasil pada tahap ini berupa pencocokan kata")
                .image(R.drawable.pelaksanaan_rencana)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title("Pelaksanaan Rencana")
                .description("Pada tahap keempat ini, user akan menyampaikan hasil dari penyelesaian permmasalahan yang sebelumnya telah dipilih di awal. Penyampaian hasil pada tahap ini berupa pencocokan kata")
//                .image(R.drawable.pelaksanaan_rencana)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
//                .title("Evaluasi")
//                .description("Tahap ini merupakan tahap terakhir dalam penyelesaian kasus. Pengguna akan mendapatkan evaluasi selama pemecahan kasus, evaluasi akan didapatkan di tahap penentuan masalah, perencanaan penyelesaian masalah, dan pelaksanaan rencana. Evaluasi yang didapatkan pengguna berupa saran tentang letak kesalahan ketika menyelesaikan kasus.")
                .image(R.drawable.evaluasi)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title("Evaluasi")
                .description("Tahap ini merupakan tahap terakhir dalam penyelesaian kasus. Pengguna akan mendapatkan evaluasi selama pemecahan kasus, evaluasi akan didapatkan di tahap penentuan masalah, perencanaan penyelesaian masalah, dan pelaksanaan rencana. Evaluasi yang didapatkan pengguna berupa saran tentang letak kesalahan ketika menyelesaikan kasus.")
//                .image(R.drawable.evaluasi)
                .background(R.color.green3)
                .backgroundDark(R.color.white)
                .build());

        autoplay(2500, INFINITE);

    }

}
