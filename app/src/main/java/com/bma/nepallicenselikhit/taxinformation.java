package com.bma.nepallicenselikhit;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class taxinformation extends AppCompatActivity {

    private TextView url;
    private WebView webview;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference reference = firebaseDatabase.getReference();
    private DatabaseReference childreference1 = reference.child("taxinformation");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxinformation);


        url= (TextView) findViewById(R.id.url);
        webview=(WebView) findViewById(R.id.webview);
        webview = (WebView) findViewById(R.id.webview);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_MR1) {
            webview.getSettings().setAppCacheMaxSize( 5 * 1024 * 1024 ); // 5MB
        }
        webview.getSettings().setAppCachePath( getApplicationContext().getCacheDir().getAbsolutePath() );
        webview.getSettings().setAllowFileAccess( true );
        webview.getSettings().setAppCacheEnabled( true );
        webview.getSettings().setCacheMode( WebSettings.LOAD_DEFAULT );

        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebChromeClient(new WebChromeClient());

        if ( !isNetworkAvailable() ) { // loading offline
            webview.getSettings().setCacheMode( WebSettings.LOAD_CACHE_ELSE_NETWORK );

        }




        childreference1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                url.getText();
                webview.loadUrl(message);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });





    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService( CONNECTIVITY_SERVICE );
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();


    }

    @Override
    public void onBackPressed() {
            super.onBackPressed();
      }



}
