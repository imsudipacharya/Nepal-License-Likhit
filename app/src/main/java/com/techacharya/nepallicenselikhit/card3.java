package com.techacharya.nepallicenselikhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class card3 extends AppCompatActivity {

 private InterstitialAd mInterstitialAd1,mInterstitialAd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card3);

        AudienceNetworkAds.initialize(this);
        mInterstitialAd1 = new InterstitialAd(this, "349716825991491_386042502358923");
        mInterstitialAd1.loadAd();


        AudienceNetworkAds.initialize(this);
        mInterstitialAd2 = new InterstitialAd(this, "349716825991491_386042589025581");
        mInterstitialAd2.loadAd();


        final CardView card1 = findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd2.isAdLoaded()) {

                    mInterstitialAd2.show();
                }
                Intent yas = new Intent(card3.this,examtest.class);
                startActivity(yas);
            }
        });


        CardView card2 = findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(card3.this, questionpaper.class);
                startActivity(yas);
            }
        });


        CardView card3 = findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(card3.this, questionanswer.class);
                startActivity(yas);
            }
        });


        CardView card4 = findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent yas = new Intent(card3.this, videoquestion.class);
                startActivity(yas);

            }
        });


        CardView card5 = findViewById(R.id.card5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isAdLoaded()) {

                    mInterstitialAd1.show();
                }
                Intent yas = new Intent(card3.this,trafficsign.class);
                startActivity(yas);
            }
        });


        CardView card6 = findViewById(R.id.card6);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(card3.this,trafficrules.class);
                startActivity(yas);
            }
        });




    }
}
