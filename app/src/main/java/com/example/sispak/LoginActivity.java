package com.example.sispak;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    //iki aku gak paham
//    private final AppCompatActivity activity = LoginActivity.this;
    private DatabaseHelper databaseHelper;

    private TextView textInputEditTextEmail;
    private TextView textInputEditTextPassword;
    private Button appCompatButtonLogin;
    TextView valid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        initViews();
//        initListeners();
//        initObjects();

//    }
//
//    private void initViews(){
//        textInputEditTextEmail = (TextView)findViewById(R.id.textInputEditTextEmail);
//        textInputEditTextPassword = (TextView) findViewById(R.id.textInputEditTextPassword);
//        appCompatButtonLogin = (Button) findViewById(R.id.appCompatButtonLogin);
//        valid = findViewById(R.id.validasi);
//
//    }
//    private void initListeners(){
//        appCompatButtonLogin.setOnClickListener((View.OnClickListener)this);
//
//    }
//    private void initObjects(){
//        databaseHelper = new DatabaseHelper(activity);
//    }
//
//    public void onClick(View v){
//        switch (v.getId()){
//            case R.id.appCompatButtonLogin:
//                verifyFromSQLite();
//                break;
//        }
//    }
//
//    private void verifyFromSQLite(){
//        if(databaseHelper.checkUser(textInputEditTextEmail.getText().toString().trim(),textInputEditTextPassword.getText().toString().trim())){
//            Intent i = new Intent(activity, MainActivity.class);
//            startActivity(i);
//        }else{
//            valid.setText("SALAH PASS ATAU ID BOYS!");
//        }
    }
}
