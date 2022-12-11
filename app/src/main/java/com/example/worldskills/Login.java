package com.example.worldskills;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private EditText email;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        setOnClick();
    }

    private void setOnClick() {
        findViewById(R.id.login_signButton).setOnClickListener(this);
        findViewById(R.id.login_profileButton).setOnClickListener(this);
        email = findViewById(R.id.login_emailInput);
        pass = findViewById(R.id.login_passInput);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_signButton: {

            }
            break;
            case R.id.login_profileButton: {

            }
            break;
        }
    }

}
