package com.bignerdranch.android.messengerfirebase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ResetActivity extends AppCompatActivity {

    private static final String EXTRA_EMAIL = "email";

    private EditText editTextEmailReset;
    private Button btnResetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        initViews();
        onClickBtnReset();

        String email = getIntent().getStringExtra(EXTRA_EMAIL);                   //получил почту
        editTextEmailReset.setText(email);                                        //установил почту котоорую ввел на том экране чтобы опять не вводить
    }

    private void initViews() {
        editTextEmailReset = findViewById(R.id.editTextEmailReset);
        btnResetPassword = findViewById(R.id.btnResetPassword);
    }

    private void onClickBtnReset() {
        btnResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextEmailReset.getText().toString().trim();
                //reset email
            }
        });
    }
                                                                       //подготовил получение почты
    public static Intent newIntent(Context context, String email) {
        Intent intent = new Intent(context, ResetActivity.class);
        intent.putExtra(EXTRA_EMAIL, email);
        return intent;
    }
}