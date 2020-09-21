package com.example.basdatpbl.ui.materi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.materi.hirarki.DescriptionHirarki;
import com.example.basdatpbl.ui.materi.hirarki.Tabs1Hirarki;
import com.example.basdatpbl.ui.materi.hirarki.Tabs2Hirarki;
import com.example.basdatpbl.ui.materi.hirarki.Tabs3Hirarki;
import com.example.basdatpbl.ui.materi.hirarki.Tabs4Hirarki;
import com.example.basdatpbl.ui.materi.hirarki.Tabs5Hirarki;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TabsHirarki extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tabs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        TabsHirarki.ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new DescriptionHirarki(), "Deskripsi");
        adapter.addFrag(new Tabs4Hirarki(), "Definisi");
        adapter.addFrag(new Tabs5Hirarki(), "DBMS");
        adapter.addFrag(new Tabs1Hirarki(), "Struktur");
        adapter.addFrag(new Tabs2Hirarki(), "Skema");
//        adapter.addFrag(new Tabs2Hirarki(), "DBMS");
        adapter.addFrag(new Tabs3Hirarki(), "Model");
        viewPager.setAdapter(adapter);
    }

    static class ViewPagerAdapter extends FragmentPagerAdapter {
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
