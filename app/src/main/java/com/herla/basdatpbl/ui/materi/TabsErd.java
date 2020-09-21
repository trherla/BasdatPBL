package com.herla.basdatpbl.ui.materi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.herla.basdatpbl.R;
import com.herla.basdatpbl.ui.materi.erd.Tabs1ERD;
import com.herla.basdatpbl.ui.materi.erd.Tabs2ERD;
import com.herla.basdatpbl.ui.materi.erd.Tabs3ERD;
import com.herla.basdatpbl.ui.materi.erd.Tabs4ERD;
import com.herla.basdatpbl.ui.materi.erd.DescriptionErd;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TabsErd extends AppCompatActivity {
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
        TabsErd.ViewPagerAdapter adapter = new TabsErd.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new DescriptionErd(), "Deskripsi");
        adapter.addFrag(new Tabs1ERD(), "Definisi");
        adapter.addFrag(new Tabs2ERD(), "Entitas");
        adapter.addFrag(new Tabs3ERD(), "Atribut");
        adapter.addFrag(new Tabs4ERD(), "Relasi");
//        adapter.addFrag(new Tabs5ERD(), "Batasan");
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
