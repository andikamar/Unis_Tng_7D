package net.dika.unis7d.fragments;

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


public class SejarahFragment extends android.support.v4.app.Fragment {
    private android.widget.ImageView mGambar;
    private android.widget.TextView mKeterangan;

    @android.support.annotation.Nullable
    @Override
    public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, @android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
        //Sign SejarahFragment ke Fragment_sejarah
        android.view.View mView = inflater.inflate(net.dika.unis7d.R.layout.fragment_sejarah, container, false);

        mGambar = (android.widget.ImageView) mView.findViewById(net.dika.unis7d.R.id.img_BPUPKI);
        mGambar.setImageResource(net.dika.unis7d.R.drawable.sejarah);

        mKeterangan = (android.widget.TextView) mView.findViewById(net.dika.unis7d.R.id.txt_ketBPUPKI);
        mKeterangan.setText(net.dika.unis7d.R.string.Gambar1);

        //Panggil html ke Fragment
        final android.webkit.WebView mWb = (android.webkit.WebView) mView.findViewById(net.dika.unis7d.R.id.wv_sejarah);
        mWb.loadUrl("file:///android_asset/web/pagesejarah.html");
        mWb.getSettings().setJavaScriptEnabled(true);
        return mView;
    }
}


