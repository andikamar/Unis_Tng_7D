package net.dika.unis7d.tabs1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import net.dika.unis7d.R;




public class Sila1bFragment extends android.support.v4.app.Fragment{
    @android.support.annotation.Nullable
    @Override
    public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, @android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
        //Sign Sila1aFragment ke Layout fragment_tab1
        android.view.View mView = inflater.inflate(net.dika.unis7d.R.layout.fragment_tab2, container, false);

        final android.webkit.WebView mWb = (android.webkit.WebView) mView.findViewById(net.dika.unis7d.R.id.wv_Tab2);
        mWb.loadUrl("file:///android_asset/web/sila1/pagemaknaA.html");
        mWb.getSettings().setJavaScriptEnabled(true);

        return mView;
    }
}
