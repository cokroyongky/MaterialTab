package cokrodev.com.materialtab.adapter;

import android.support.v4.app.FragmentPagerAdapter;

import cokrodev.com.materialtab.fragment.Tab1Fragment;
import cokrodev.com.materialtab.fragment.Tab2Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
/**
 * Created by Prof Yongky on 25/01/2017.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    //nama tab nya
    String[] title = new String[]{
            "Tab 1", "Tab 2"
    };

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //method ini yang akan memanipulasi penampilan Fragment dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
