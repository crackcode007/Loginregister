package com.helpmate24;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dell on 06-09-2016.
 */
public class IntroActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.intro_layout);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        // Set an Adapter on the ViewPager
        mViewPager.setAdapter(new IntroAdapter(getSupportFragmentManager()));

        // Set a PageTransformer
        mViewPager.setPageTransformer(false, new IntroPageTransformer());
    }

}