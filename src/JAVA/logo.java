package com.example.hidr8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class logo extends AppCompatActivity {
    public void logo(View v)
    {
        ImageView b = (ImageView) findViewById(R.id.imageView4);
        Intent intent = new Intent(logo.this, Gender.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo);
    }
}
