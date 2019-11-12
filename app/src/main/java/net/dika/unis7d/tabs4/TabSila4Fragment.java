package net.dika.unis7d.tabs4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.dika.unis7d.R;

import java.util.ArrayList;



public class TabSila4Fragment extends android.support.v4.app.Fragment {
    private android.support.v4.view.ViewPager mViewPager;
    private TabLayout mTabLayout;
    private net.dika.unis7d.tabs4.TabSila4Fragment.VPAdapterS4 mAdapter;

    @android.support.annotation.Nullable
    @Override
    public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, @android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
        android.view.View mView = inflater.inflate(net.dika.unis7d.R.layout.kontent_tab, container, false);
        mAdapter = new net.dika.unis7d.tabs4.TabSila4Fragment.VPAdapterS4(getActivity().getSupportFragmentManager());
        mViewPager = (android.support.v4.view.ViewPager) mView.findViewById(net.dika.unis7d.R.id.vp_Tab);
        mViewPager.setAdapter(mAdapter);
        mTabLayout = (TabLayout) mView.findViewById(net.dika.unis7d.R.id.tab_Layout);
        mTabLayout.setupWithViewPager(mViewPager);
        return mView;
    }

    public class VPAdapterS4 extends android.support.v4.app.FragmentStatePagerAdapter{

        private final java.util.ArrayList<android.support.v4.app.Fragment> mFragment;
        private final java.util.ArrayList<String> mTitle;

        public VPAdapterS4(android.support.v4.app.FragmentManager fm) {
            super(fm);
            mFragment = new java.util.ArrayList<android.support.v4.app.Fragment>(3);
            mFragment.add(new net.dika.unis7d.tabs4.Sila4aFragment());
            mFragment.add(new net.dika.unis7d.tabs4.Sila4bFragment());
            mFragment.add(new net.dika.unis7d.tabs4.Sila4cFragment());

            mTitle = new java.util.ArrayList<String>(mFragment.size());
            mTitle.add(getString(net.dika.unis7d.R.string.Tab1));
            mTitle.add(getString(net.dika.unis7d.R.string.Tab2));
            mTitle.add(getString(net.dika.unis7d.R.string.Tab3));
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return mFragment.get(position);
        }

        @Override
        public int getCount() {
            return mFragment.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitle.get(position);
        }
    }
}
