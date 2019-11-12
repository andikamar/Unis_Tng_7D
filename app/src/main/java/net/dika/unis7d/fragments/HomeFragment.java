package net.dika.unis7d.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.dika.unis7d.R;


public class HomeFragment extends android.support.v4.app.Fragment {
    @android.support.annotation.Nullable
    @Override
    public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, @android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
        //Sign SejarahFragment ke Fragment_sejarah
        android.view.View mView = inflater.inflate(net.dika.unis7d.R.layout.fragment_home, container, false);
        return mView;
    }
}
