package com.techacharya.nepallicenselikhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class card2 extends AppCompatActivity {

    private InterstitialAd mInterstitialAda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card2);

        AudienceNetworkAds.initialize(this);
        mInterstitialAda = new InterstitialAd(this, "349716825991491_386042649025575");
        mInterstitialAda.loadAd();


        final CardView card1 = findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAda.isAdLoaded()) {

                    mInterstitialAda.show();
                }
                Intent yas = new Intent(card2.this,colorvision.class);
                startActivity(yas);
            }
        });


        CardView card2 = findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(card2.this, Medicalreport.class);
                startActivity(yas);
            }
        });


        CardView card3 = findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(card2.this, videocolorvision.class);
                startActivity(yas);
            }
        });

    }
}
