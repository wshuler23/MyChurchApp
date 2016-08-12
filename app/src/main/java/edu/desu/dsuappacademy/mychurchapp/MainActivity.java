package edu.desu.dsuappacademy.mychurchapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    HomeFragment homeFragment = new HomeFragment();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.content_frame, new HomeFragment());
        tx.commit();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

//    public void videoplay(View v) {
//       homeFragment.videoplay(v);
//    }

    public void browser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://livestream.com/accounts/5077358"));
        startActivity(browserIntent);
    }

    public void browser2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://cardpayment.globalgatewaye4.firstdata.com/collect_payment_data?ant=a055a720ab72b85408a903f1590cfac0&merchant=WSP-TABER-BbXqVgA5zQ&order=2f97b1af35981c2d4f7a1390e894222244ed3645661787a8d46684d1a451572d&t=2"));
        startActivity(browserIntent);
    }

    public void browser3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://cardpayment.globalgatewaye4.firstdata.com/collect_payment_data?ant=df5d44e2299b6f61ee09563e440be30c&merchant=WSP-TABER-zDWUNgA53A&order=8260a7c03c704b05b19cee4a733a77333967fa0041bd02ae8bca20ebda90cf0a&t=2"));
        startActivity(browserIntent);
    }

    public void browser4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://cardpayment.globalgatewaye4.firstdata.com/collect_payment_data?ant=df5d44e2299b6f61ee09563e440be30c&merchant=WSP-TABER-OAQdRQA53Q&order=ce7e422e8fc0ef7a4f21fb1371d70521fc2136273f5d894abf36031622f8a584&t=3"));
        startActivity(browserIntent);
    }

    public void browser5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://cardpayment.globalgatewaye4.firstdata.com/collect_payment_data?ant=df5d44e2299b6f61ee09563e440be30c&merchant=WSP-TABER-HuUcswA54Q&order=83cd4485015c031bab502561df91391232896ebc4b12d39c169d045871e5d1f1&t=4"));
        startActivity(browserIntent);
    }

    public void browser6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://cardpayment.globalgatewaye4.firstdata.com/collect_payment_data?ant=df5d44e2299b6f61ee09563e440be30c&merchant=WSP-TABER-%26EWwnAA52w&order=89d424e83e66e541cb1f6efd16697bd2c59279ffcf1139ca82653701e70f7624&t=5"));
        startActivity(browserIntent);
    }

    public void browser7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://cardpayment.globalgatewaye4.firstdata.com/collect_payment_data?ant=df5d44e2299b6f61ee09563e440be30c&merchant=WSP-TABER-a2qCtAA53w&order=ceaffc3f1bb500ce80920caa23a12dc244316f5bc3849f3dd2329fe4704e8d23&t=6"));
        startActivity(browserIntent);
    }

    public void browser8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://globalgatewaye4.firstdata.com/collect_payment_data?ant=df5d44e2299b6f61ee09563e440be30c&merchant=WSP-TABER-PJIHzQBXEw&order=41754517f029df2f7c3dc11b5f45db454a6e0df676d78c86a120c9fc8d8ba2b3&t=7"));
        startActivity(browserIntent);
    }

    public void browser9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.tabernacle-burlington.org/calendar/"));
        startActivity(browserIntent);
    }

    public void browser10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.tabernacle-burlington.org"));
        startActivity(browserIntent);
    }

    public void browser14(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.tabernacle-burlington.org"));
        startActivity(browserIntent);
    }

    public void browser15(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://twitter.com/@tabernacle1923/"));
        startActivity(browserIntent);
    }

    public void browser16(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/Tabernacle-Baptist-Church-479175188808043/?fref=ts"));
        startActivity(browserIntent);
    }

    public void browser17(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:6093864785"));
        startActivity(callIntent);
    }


    public void browser19(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.tabernacle-burlington.org/contact-us/"));
        startActivity(browserIntent);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getSupportFragmentManager();

        if (id == R.id.nav_camera) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,
                    homeFragment).commit();
        } else if (id == R.id.nav_gallery) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,
                    new OnlineGivingFragment()).commit();

        } else if (id == R.id.nav_slideshow) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,
                    new EventsFragment()).commit();

        } else if (id == R.id.nav_share) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,
                    new AboutFragment()).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://edu.desu.dsuappacademy.mychurchapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://edu.desu.dsuappacademy.mychurchapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
