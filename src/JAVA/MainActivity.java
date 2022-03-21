package com.example.hidr8;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private TextView Info;
    private Button Login;
    private Button signup;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= (EditText)findViewById(R.id.etname);
        password= (EditText)findViewById(R.id.etpw);
        Info= (TextView)findViewById(R.id.tvinfo);
        Login= (Button)findViewById(R.id.btn_login);
        signup = (Button)findViewById(R.id.btn_sign);
        Info.setText("No.of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(), password.getText().toString());
            }
        });
    }
    public void signup(View v)
    {
        Intent intent = new Intent(MainActivity.this, signupActivity.class);
        startActivity(intent);
    }
    private void validate(String userName, String userPassword)
    {
        if((userName.equals("admin")) && (userPassword.equals("admin123")))
        {
            Intent intent=new Intent(MainActivity.this, logo.class);
            startActivity(intent);
        }
        else
        {
            counter--;
            Info.setText("No. of attempts remaining: "+ String.valueOf(counter));
            if(counter == 0)
            {
                Login.setEnabled(false);
            }
        }
    }
}