package com.example.sedinka.myapp4;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.image);

        Glide.with(this).load("https://img.csfd.cz/files/images/film/posters/159/527/159527754_a3224e.jpg?h180").into(imageView);

    }
}
