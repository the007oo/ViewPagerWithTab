package com.phattarapong.viewpagerwithtab;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.phattarapong.viewpagerwithtab.adapter.MyPageAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    MyPageAdapter myPageAdapter;
    List<String> tabTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        tabTitle = new ArrayList<String>();
        tabTitle.add("Fragment1");
        tabTitle.add("Fragment2");
        tabTitle.add("Fragment3");
        myPageAdapter = new MyPageAdapter(getSupportFragmentManager(), tabTitle);
        viewPager.setAdapter(myPageAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
