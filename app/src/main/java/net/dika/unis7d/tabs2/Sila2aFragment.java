package net.dika.unis7d.tabs2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import net.dika.unis7d.R;



public class Sila2aFragment extends android.support.v4.app.Fragment {
    private android.widget.ImageView mLambang;
    private android.widget.TextView mKeterangan;

    @android.support.annotation.Nullable
    @Override
    public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, @android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
        //Sign TabSila1Fragment ke Layout fragment_tab1
        android.view.View mView = inflater.inflate(net.dika.unis7d.R.layout.fragment_tab1, container, false);

        mLambang = (android.widget.ImageView) mView.findViewById(net.dika.unis7d.R.id.img_Lambang);
        mLambang.setImageResource(net.dika.unis7d.R.drawable.img_sila2);

        mKeterangan = (android.widget.TextView) mView.findViewById(net.dika.unis7d.R.id.txt_lambang);
        mKeterangan.setText(net.dika.unis7d.R.string.Gambar3);

        final android.webkit.WebView mWb = (android.webkit.WebView) mView.findViewById(net.dika.unis7d.R.id.wv_Tab1);
        mWb.loadUrl("file:///android_asset/web/sila2/pagelmbB.html");
        mWb.getSettings().setJavaScriptEnabled(true);

        return mView;
    }
}
