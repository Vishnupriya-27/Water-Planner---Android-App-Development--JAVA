package com.example.hidr8;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class SecondActivity extends AppCompatActivity {
    TextView tv;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final EditText etnum2 = (EditText)findViewById(R.id.weight);
        Button b1=(Button)findViewById(R.id.btn_nxt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=etnum2.getText().toString();
                Intent intent = new Intent(getApplicationContext(),startpage.class);
                intent.putExtra("weight",s);
                startActivity(intent);
            }
        });
    }
    public void bmi_calc(View v){
        EditText etnum1 = (EditText)findViewById(R.id.height);
        EditText etnum2 = (EditText)findViewById(R.id.weight);
        Button btn = (Button)findViewById(R.id.bmi);
        TextView tv=(TextView)findViewById(R.id.tv_bmi);

        int h=Integer.parseInt(etnum1.getText().toString());
        int w=Integer.parseInt(etnum2.getText().toString());
        double b=h*0.01;
        double c = b*b;
        double bodymassindex= w/c;
        tv.setText(String.format("%.2f",bodymassindex));

    }
    public void next(View v)
    {
        Intent intent = new Intent(SecondActivity.this, startpage.class);
        startActivity(intent);
    }
}
