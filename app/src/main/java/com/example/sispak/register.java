package com.example.sispak;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class register extends AppCompatActivity {

    private TextView textInputEditTextName;
    private TextView textInputEditTextEmail;
    private TextView textInputEditTextPassword;
    private Button appCompatButtonRegister, homey;
    private TextView valid;

    private DatabaseHelper databaseHelper;
    private User user;

    private final AppCompatActivity activity = register.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initViews();
        initObjects();

        //inisiasi button
        appCompatButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                postDataToSQLite();
            }
        });

        homey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(register.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
    //
    private void initViews(){
        textInputEditTextName = (TextView)findViewById(R.id.namaa);
        textInputEditTextEmail = (TextView)findViewById(R.id.emaill);
        textInputEditTextPassword = (TextView)findViewById(R.id.passwordd);
        appCompatButtonRegister = (Button)findViewById(R.id.registerrr);
        valid = (TextView)findViewById(R.id.validasi);
        homey = (Button)findViewById(R.id.homeeee);

    }

    private void initObjects(){
        databaseHelper = new DatabaseHelper(activity);
        user = new User();
    }
    private void postDataToSQLite(){
        if(!databaseHelper.checkUser(textInputEditTextEmail.getText().toString().trim())){
            user.setName(textInputEditTextName.getText().toString().trim());
            user.setEmail(textInputEditTextEmail.getText().toString().trim());
            user.setPassword(textInputEditTextPassword.getText().toString().trim());
            emptyInputEditText();
            databaseHelper.addUser(user);
            valid.setText("Akun telah berhasil dibuat !");
        }else{
            valid.setText("Akun Email telah terdaftar!");
        }
    }
    private void emptyInputEditText() {
        textInputEditTextName.setText(null);
        textInputEditTextEmail.setText(null);
        textInputEditTextPassword.setText(null);

    }

}
