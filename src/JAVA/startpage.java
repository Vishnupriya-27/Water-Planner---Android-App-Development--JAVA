package com.example.hidr8;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
public class startpage extends AppCompatActivity {
    TextView t;
    int w;
    Button bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);

        t = (TextView) findViewById(R.id.tv_water);
        Intent intent = getIntent();
        String s = intent.getStringExtra("weight");
        w = Integer.parseInt(s);

    }
    public void alarm(View v)
    {
        Intent intent = new Intent(startpage.this, Alarm.class);
        startActivity(intent);
    }
    public void waterlevel(View v)
    {
        if(w>0 && w<=45)
        {
            t.setText("Your proper daily water intake -> 1.9L");
        }
        else if(w>45 && w<=50)
        {
            t.setText("Your proper daily water intake -> 2.1L");
        }
        else if(w>50 && w<=55)
        {
            t.setText("Your proper daily water intake -> 2.3L");
        }
        else if(w>55 && w<=60)
        {
            t.setText("Your proper daily water intake -> 2.5L");
        }
        else if(w>60 && w<=65)
        {
            t.setText("Your proper daily water intake -> 2.7L");
        }
        else if(w>65 && w<=70)
        {
            t.setText("Your proper daily water intake -> 2.9L");
        }
        else if(w>70 && w<=75)
        {
            t.setText("Your proper daily water intake -> 3.2L");
        }
        else if(w>75 && w<=80)
        {
            t.setText("Your proper daily water intake -> 3.5L");
        }
        else if(w>80 && w<=85)
        {
            t.setText("Your proper daily water intake -> 3.7L");
        }
        else if(w>85 && w<=90)
        {
            t.setText("Your proper daily water intake -> 3.9L");
        }
        else if(w>90 && w<=95)
        {
            t.setText("Your proper daily water intake -> 4.1L");
        }
        else
        {
            t.setText("Your proper daily water intake -> 4.5L");
        }
    }


}
