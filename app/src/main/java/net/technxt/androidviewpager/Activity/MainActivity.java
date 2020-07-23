package net.technxt.androidviewpager.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import net.technxt.androidviewpager.Adapter.ViewPagerAdapter;
import net.technxt.androidviewpager.Fragment.FragmentOne;
import net.technxt.androidviewpager.Fragment.FragmentThree;
import net.technxt.androidviewpager.Fragment.FragmentTwo;
import net.technxt.androidviewpager.R;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FragmentOne());
        viewPagerAdapter.addFragment(new FragmentTwo());
        viewPagerAdapter.addFragment(new FragmentThree());

        viewPager.setAdapter(viewPagerAdapter);
    }

}
