package com.herla.basdatpbl.ui.materi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.herla.basdatpbl.R;
import com.herla.basdatpbl.ui.materi.normalisasi.DescriptionNormalisasi;
import com.herla.basdatpbl.ui.materi.normalisasi.Tabs1Normalisasi;
import com.herla.basdatpbl.ui.materi.normalisasi.Tabs3Normalisasi;
import com.herla.basdatpbl.ui.materi.normalisasi.Tabs4Normalisasi;
import com.herla.basdatpbl.ui.materi.normalisasi.Tabs5Normalisasi;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TabsNormalisasi extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tabs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        TabsNormalisasi.ViewPagerAdapter adapter = new TabsNormalisasi.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new DescriptionNormalisasi(), "Deskripsi");
        adapter.addFrag(new Tabs1Normalisasi(), "Definisi");
//        adapter.addFrag(new Tabs2Normalisasi(), "Syarat");
        adapter.addFrag(new Tabs3Normalisasi(), "1NF");
        adapter.addFrag(new Tabs4Normalisasi(), "2NF");
        adapter.addFrag(new Tabs5Normalisasi(), "3NF");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
