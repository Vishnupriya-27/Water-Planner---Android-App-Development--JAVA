package com.example.hidr8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class bedtime_girl extends AppCompatActivity {

    public void bmi_page1(View v)
    {
        Intent intent = new Intent(bedtime_girl.this, SecondActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bedtime_girl);
    }
}

