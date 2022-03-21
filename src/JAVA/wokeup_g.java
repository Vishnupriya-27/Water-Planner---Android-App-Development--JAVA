package com.example.hidr8;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class wokeup_g extends AppCompatActivity {
    public void bedtime_girl(View v)
    {
        Intent intent = new Intent(wokeup_g.this, bedtime_girl.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wokeup_g);
    }
}
