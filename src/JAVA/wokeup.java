package com.example.hidr8;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.sql.Time;
public class wokeup extends AppCompatActivity {

    public void next_bed(View v)
    {
        Intent intent = new Intent(wokeup.this, bedtime_boy.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wokeup);
    }
}
