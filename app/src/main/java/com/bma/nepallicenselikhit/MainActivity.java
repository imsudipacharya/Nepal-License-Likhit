package com.bma.nepallicenselikhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {
private InterstitialAd mInterstitialAd, mInterstitialAd1, mInterstitialAd2, mInterstitialAd3, mInterstitialAd4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudienceNetworkAds.initialize(this);
        mInterstitialAd = new InterstitialAd(this, "662039251176326_662039454509639");
        mInterstitialAd.loadAd();

        AudienceNetworkAds.initialize(this);
        mInterstitialAd1 = new InterstitialAd(this, "662039251176326_662040301176221");
        mInterstitialAd1.loadAd();


        AudienceNetworkAds.initialize(this);
        mInterstitialAd2 = new InterstitialAd(this, "662039251176326_662040394509545");
        mInterstitialAd2.loadAd();


        AudienceNetworkAds.initialize(this);
        mInterstitialAd3 = new InterstitialAd(this, "662039251176326_662040467842871");
        mInterstitialAd3.loadAd();


        AudienceNetworkAds.initialize(this);
        mInterstitialAd4 = new InterstitialAd(this, "662039251176326_662040554509529");
        mInterstitialAd4.loadAd();



        final CardView card1 = findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(MainActivity.this, card1.class);
                startActivity(yas);
            }
        });


        CardView card2 = findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isAdLoaded()) {

                    mInterstitialAd.show();
                }
                Intent yas = new Intent(MainActivity.this,card2.class);
                startActivity(yas);
            }
        });


        CardView card3 = findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd2.isAdLoaded()) {

                    mInterstitialAd2.show();
                }
                Intent yas = new Intent(MainActivity.this, card3.class);
                startActivity(yas);
            }
        });


        CardView card4 = findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd3.isAdLoaded()) {

                    mInterstitialAd3.show();
                }
                Intent yas = new Intent(MainActivity.this, card4.class);
                startActivity(yas);

            }
        });


        CardView card5 = findViewById(R.id.card5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd4.isAdLoaded()) {

                    mInterstitialAd4.show();
                }
                Intent yas = new Intent(MainActivity.this, card5.class);
                startActivity(yas);
            }
        });


        CardView card6 = findViewById(R.id.card6);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
onBackPressed();

            }
        });
    }

    @Override
    public void onBackPressed() {
        if (mInterstitialAd1.isAdLoaded()) {

            mInterstitialAd1.show();
        }
        finish();
        super.onBackPressed();

    }
}
