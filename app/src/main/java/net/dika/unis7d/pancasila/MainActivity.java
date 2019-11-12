package net.dika.unis7d.pancasila;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;



import net.dika.unis7d.fragments.HomeFragment;
import net.dika.unis7d.fragments.SejarahFragment;
import net.dika.unis7d.tabs1.TabSila1Fragment;
import net.dika.unis7d.tabs2.TabSila2Fragment;
import net.dika.unis7d.tabs3.TabSila3Fragment;
import net.dika.unis7d.tabs4.TabSila4Fragment;
import net.dika.unis7d.tabs5.TabSila5fragment;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mNavDrawer;
    private ActionBarDrawerToggle mBarToggle;
    private NavigationView mNavView;
    private Toolbar mToolbar;
    private FragmentManager mManager = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(net.dika.unis7d.R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(net.dika.unis7d.R.id.Bar);
        setSupportActionBar(mToolbar);
        mNavDrawer = (DrawerLayout) findViewById(net.dika.unis7d.R.id.activity_main);
        mBarToggle = new ActionBarDrawerToggle(this, mNavDrawer, net.dika.unis7d.R.string.open, net.dika.unis7d.R.string.close);
        mNavView = (NavigationView) findViewById(net.dika.unis7d.R.id.nav_View);

        mNavDrawer.addDrawerListener(mBarToggle);
        mBarToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mNavView.setNavigationItemSelectedListener(this);

        //Panggil HomeFragment ke menu utama
        mManager.beginTransaction().replace(net.dika.unis7d.R.id.cont_Frame, new HomeFragment()).commit();


    }

    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Apakah anda ingin keluar dari App?");
        builder.setCancelable(false);
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mBarToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == net.dika.unis7d.R.id.nav_dasar) {
            mManager.beginTransaction().replace(net.dika.unis7d.R.id.cont_Frame, new HomeFragment()).commit();
            getSupportActionBar().setTitle(net.dika.unis7d.R.string.st_dasar);
        } else if (id == net.dika.unis7d.R.id.nav_sejarah) {
            mManager.beginTransaction().replace(net.dika.unis7d.R.id.cont_Frame, new SejarahFragment()).commit();
            getSupportActionBar().setTitle(net.dika.unis7d.R.string.tit_sejarah);
        } else if (id == net.dika.unis7d.R.id.nav_sila1) {
            // Toast.makeText(this, R.string.st_sila1, Toast.LENGTH_SHORT).show();
            mManager.beginTransaction().replace(net.dika.unis7d.R.id.cont_Frame, new TabSila1Fragment()).commit();
            getSupportActionBar().setTitle(net.dika.unis7d.R.string.Bar1);
        } else if (id == net.dika.unis7d.R.id.nav_sila2) {
            mManager.beginTransaction().replace(net.dika.unis7d.R.id.cont_Frame, new TabSila2Fragment()).commit();
            getSupportActionBar().setTitle(net.dika.unis7d.R.string.Bar2);
        } else if (id == net.dika.unis7d.R.id.nav_sila3) {
            mManager.beginTransaction().replace(net.dika.unis7d.R.id.cont_Frame, new TabSila3Fragment()).commit();
            getSupportActionBar().setTitle(net.dika.unis7d.R.string.Bar3);
        } else if (id == net.dika.unis7d.R.id.nav_sila4) {
            mManager.beginTransaction().replace(net.dika.unis7d.R.id.cont_Frame, new TabSila4Fragment()).commit();
            getSupportActionBar().setTitle(net.dika.unis7d.R.string.Bar4);
        } else if (id == net.dika.unis7d.R.id.nav_sila5) {
            mManager.beginTransaction().replace(net.dika.unis7d.R.id.cont_Frame, new TabSila5fragment()).commit();
            getSupportActionBar().setTitle(net.dika.unis7d.R.string.Bar5);
        } else if (id == net.dika.unis7d.R.id.nav_exit) {
            onBackPressed();
        }
        //Jika dipilih menu, maka navigasi Close
        mNavDrawer.closeDrawer(GravityCompat.START);
        return true;
    }


}

