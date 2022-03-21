package com.example.hidr8;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class Gender extends AppCompatActivity {
    private TextView gender;
    public void abc(View v) {
        ImageView a = (ImageView) findViewById(R.id.boy);
        Intent intent = new Intent(Gender.this, wokeup.class);
        startActivity(intent);
    }
    public void abc1(View v)
    {
        ImageView b = (ImageView) findViewById(R.id.girl);
        Intent intent = new Intent(Gender.this, wokeup_g.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }
}