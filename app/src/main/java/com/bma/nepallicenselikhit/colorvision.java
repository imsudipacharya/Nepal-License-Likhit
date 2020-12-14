package com.bma.nepallicenselikhit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class colorvision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorvision);

        AdView adView = new AdView(this, "349716825991491_386043209025519", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();


        colorvision0n();
    }

    public void  colorvision0n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/Z7ajzgch7UgcioNeElNMl7gaDAsLGocjr92jsdL_Ar6K-ycc19gldPLfvneRXPyZXb9dWzNTj6jVFTxRDZw64Tda5H1rlx0h6N0kUkfM5qO15KhrG28wDzQmX_EbemBG5c7oC0NGjw=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision13n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision1n();
            }
        });

    }





    public void  colorvision1n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/gSc2TXMzK9jLH49Q7lfNnleR9vNMNSHuzQakNlIH6ds5hfbpbewPGNA7os0bUIToIra5cGsdF89-DuZb4qB59HQoLdfE9XL2cBHU-CNWsuP1xeTjeMiZdfUYNxkWo0_XdzkgXUK0kg=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision0n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision2n();
            }
        });

    }

    public void  colorvision2n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/MYwPp7KxzgJp4ue2Mn6DZ8eFTFkFg4EIeZSpuVahCep9im7qfea6hFfXSZFSL-_p4-WmR1BMRIRP7MqpCNouA0KozXf6ivu8tCeHUP-gn5zoZ3iXlHkUgxZvKXlo4nldGXphIfZLvA=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision1n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision3n();
            }
        });

    }


    public void  colorvision3n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/GuIOyAxPOxpHctDamFjdyPIwk1XTN5d0SqU18ks28Gdm7IyZ4T3Ic0asNskIZ3hJCjbvV-1rBqiTSbQs_mYU_Hzm5NL0eeuoMzRBks7wGWE3b9vKsK6aayLWI6aDe357IYeolvX3tg=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision2n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision4n();
            }
        });

    }


    public void  colorvision4n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/cWp717afVZTz5j-zwjP0_lIodB-mXeZnYt_a0LLFyup8NyYEJawMpRgSsDkadUwnbWqTGk1AcMVayLK2TtRJCxbHs-ugHsx0OPjwEM7sItn3AAY-I_3RpjEqn7fmPFmFdd6sbewtEw=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision3n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision5n();
            }
        });

    }


    public void  colorvision5n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/Q9DeQC_g7X7lSyjaa8bMLvQycCvRuU7d2qjyB2c4y2CQLHlDa6GSvrLDw2PeVb6BbJZM449092ga0Q4nQHUKkJp2nsKtRap9UlXEyEep-9SCV1xz3cStjoK3CZu3EfV5orx7cHghdg=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision4n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision6n();
            }
        });

    }


    public void  colorvision6n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/UYyygocaO0oWLjLIkoj9UpOZV1WbW1onfJH4kYeoiBsfMmaBxQAFZKL8adaIHwIdUpqT2zx-iDnd6paJWKmfNhqWKC87Aojpf228z0ewI2ajrkcEnPnBYcUUPXZzCSBo8igXbUNEJA=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision5n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision7n();
            }
        });

    }


    public void  colorvision7n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/Y0gW5epQ3Ln0sHYfvNXc7ebmcfTqEUlvx4fJoal9d2AWiyKRQshRo-VbB7sp41eT94Fv17LWKoabLVuP6mwzPpnFU5HSlt7rNgLVCShViuKj-0jAYozwf1K1wttdQ-BPhUbLVtPGfg=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision6n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision8n();
            }
        });

    }


    public void  colorvision8n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/zcfvJnsKiHYxqChtknQpnfxVSRkA8l9TJl3DrWCKf-YDLcLViGwyqEOqtWdbLZ3lWwdoUHh1YCeCBaiCRk0j98fOxJwnJHSmNIygFNTPbR2WBRO7gyoP1D_dYfD1mx9vVmc90-gDLQ=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision7n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision9n();
            }
        });

    }


    public void  colorvision9n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/5pBwZdOHnJpHOCLzgiPby75mggIqR0T2LuwBJeXTFzfgutXz7lV5VBLrlbLGS3sGLarmj4vyYiHjYlBLdCLNWtk26Ly_h628-yhvlWm6bEC-26T7k33K3tHjM1YRu_Zp1QWQaMZjZg=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision8n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision10n();
            }
        });

    }


    public void  colorvision10n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/MYxh89-HJNzfj3akzSD3ftLe-vduSgNJR2yrmFEBAh8FlxW82lZOQbCyihsN7abOngFeipQf-FNrPsSol_5S4wCMGBfQ7EH5ZLuzGE046K5iQ_8z23tlJqCnWVcfQIv4NfiwbMsgug=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision9n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision11n();
            }
        });

    }


    public void  colorvision11n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/a5f2X5vZV38m7Kj7O1qQpjRyw2VqjMXqCZFIhxcgGC5-kAfvj9HjHAIRCN4OapZzdGkx__048bBOm090O0GQxZEsj3Bh09T08hhPmVfU6qAUC7Pq8rMMzpAD7rEDf0wkaijiI2mviA=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision10n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision12n();
            }
        });

    }


    public void  colorvision12n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/O-5eKwXCkboMfPdNIWpkpQlHbdwzmpSVDh4_B8XQPi7yOdW1V3J_DJc0ybe8XSASM5qhjXGgEb2xISaLfji81zeREUYlg0fziPJQl67n3yPwI6rJHkZFHAfdEMWwuzpNCjDSINuAgA=w1920-h1080";
        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision11n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision13n();
            }
        });

    }


    public void  colorvision13n(){

        ImageView guideimg = findViewById(R.id.guideimg);
        final String dlink = "https://lh3.googleusercontent.com/-psN10-nKrkmdixw2KTMqh2AYaGmqQqiJsQwfggZk7TP3M3u9lFrQA5fAsFG_Mc-FKpKrztkNnWkkhDUz6J2AkEYIIUm_qx_eiFdF1L59dgpVrSI9iaLNw9hHa5H9-f_a2w2alL6iw=w1920-h1080";        Glide
                .with( colorvision.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision12n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorvision0n();
            }
        });

    }

}
