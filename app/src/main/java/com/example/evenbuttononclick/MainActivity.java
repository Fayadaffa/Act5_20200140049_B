package com.example.evenbuttononclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btnSignIn);

        edemail=findViewById(R.id.edEmail);

        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                nama = edemail.getText().toString();

                password = edpassword.getText().toString();

                Toast u = Toast.makeText(getApplicationContext(),
                        "Login Sukses",Toast.LENGTH_LONG);
                Toast v = Toast.makeText(getApplicationContext(),
                        "Password Salah",Toast.LENGTH_LONG);
                Toast w = Toast.makeText(getApplicationContext(),
                        "Email Salah",Toast.LENGTH_LONG);
                Toast x = Toast.makeText(getApplicationContext(),
                        "Email dan Password salah",Toast.LENGTH_LONG);

                //t.show();
                u.show();
                v.show();
                w.show();
                x.show();
            }
        });
    }
}