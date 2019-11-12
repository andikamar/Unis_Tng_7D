package net.dika.unis7d.tabs3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import net.dika.unis7d.R;



public class Sila3cFragment extends android.support.v4.app.Fragment {
    @android.support.annotation.Nullable
    @Override
    public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, @android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
        android.view.View mView = inflater.inflate(net.dika.unis7d.R.layout.fragment_tab3, container, false);

        final android.webkit.WebView mWb = (android.webkit.WebView) mView.findViewById(net.dika.unis7d.R.id.wv_Tab3);
        mWb.loadUrl("file:///android_asset/web/sila3/pagebutirC.html");
        mWb.getSettings().setJavaScriptEnabled(true);

        return mView;
    }
}