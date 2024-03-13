package com.bignerdranch.android.messengerfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    private EditText editTextEmailRegistration;
    private EditText editTextPasswordRegistration;
    private EditText editTextNameRegistration;
    private EditText editTextLastNameRegistration;
    private EditText editTextAgeRegistration;
    private Button btnSignUpRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        initViews();
        onClickSignUp();
    }

    private void initViews() {

        editTextEmailRegistration = findViewById(R.id.editTextEmailRegistration);
        editTextPasswordRegistration = findViewById(R.id.editTextPasswordRegistration);
        editTextNameRegistration = findViewById(R.id.editTextNameRegistration);
        editTextLastNameRegistration = findViewById(R.id.editTextLastNameRegistration);
        editTextAgeRegistration = findViewById(R.id.editTextAgeRegistration);
        btnSignUpRegistration = findViewById(R.id.btnSignUpRegistration);
    }

    private void onClickSignUp() {

        btnSignUpRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailReg = getTrimValue(editTextEmailRegistration);
                String passwordReg = getTrimValue(editTextPasswordRegistration);
                String nameReg = getTrimValue(editTextNameRegistration);
                String ageReg = getTrimValue(editTextAgeRegistration);
                String lastReg = getTrimValue(editTextLastNameRegistration);
            }
        });
    }

    private String getTrimValue(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static Intent newIntent(Context context){
        return new Intent(context,RegistrationActivity.class);
    }
}