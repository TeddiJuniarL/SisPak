package com.example.sispak;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //iki aku gak paham
    private final AppCompatActivity activity = MainActivity.this;
    private DatabaseHelper databaseHelper;

    private TextView textInputEditTextEmail;
    private TextView textInputEditTextPassword;
    private Button appCompatButtonLogin,register;

    TextView valid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
//        initListeners();
        initObjects();

        appCompatButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifyFromSQLite();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, register.class);
                startActivity(a);
            }
        });


    }

    private void initViews(){
        textInputEditTextEmail = (TextView)findViewById(R.id.emaill);
        textInputEditTextPassword = (TextView) findViewById(R.id.passwordd);
        appCompatButtonLogin = (Button) findViewById(R.id.appCompatButtonLogin);
        valid = findViewById(R.id.validasi);
        register = findViewById(R.id.register);

    }
//  private void initListeners(){
//       appCompatButtonLogin.setOnClickListener((View.OnClickListener)this);
//
//    }

    private void initObjects(){
        databaseHelper = new DatabaseHelper(activity);
    }


    @SuppressLint("SetTextI18n")
    private void verifyFromSQLite(){
        if(databaseHelper.checkUser(textInputEditTextEmail.getText().toString().trim(),textInputEditTextPassword.getText().toString().trim())){
            Intent i = new Intent(activity, register.class);
            startActivity(i);
        }else{
            valid.setText("Email atau Password Salah !");
        }
    }
}