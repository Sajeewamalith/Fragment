package com.sajeewamalith.backfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout= findViewById(R.id.tabbar);
        TabItem chatab= findViewById(R.id.chatab);
        TabItem statustab = findViewById(R.id.statustab);
        TabItem calltab = findViewById(R.id.calltab);
        ViewPager viewPager = findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter= new pageAdepter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
           //on last step change
       tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                     viewPager.setCurrentItem(tab.getPosition());
           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

           }
        });
    }
}