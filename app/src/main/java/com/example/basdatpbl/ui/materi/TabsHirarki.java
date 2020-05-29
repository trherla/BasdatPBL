package com.example.basdatpbl.ui.materi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.basdatpbl.R;
import com.example.basdatpbl.ui.materi.hirarki.Tabs1Hirarki;
import com.example.basdatpbl.ui.materi.hirarki.Tabs2Hirarki;
import com.example.basdatpbl.ui.materi.hirarki.Tabs3Hirarki;
import com.example.basdatpbl.ui.materi.hirarki.Tabs4Hirarki;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TabsHirarki extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tabs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        TabsHirarki.ViewPagerAdapter adapter = new TabsHirarki.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new Tabs1Hirarki(), "Pengenalan");
        adapter.addFrag(new Tabs2Hirarki(), "Arsitektur");
//        adapter.addFrag(new Tabs2Hirarki(), "DBMS");
        adapter.addFrag(new Tabs3Hirarki(), "Model");
        adapter.addFrag(new Tabs4Hirarki(), "Pengguna");
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
