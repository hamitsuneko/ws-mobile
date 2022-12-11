package com.example.worldskills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        setOnClick();
    }

    private void setOnClick() {
        findViewById(R.id.onboarding_loginbutton).setOnClickListener(this);
        findViewById(R.id.onboarding_signuptext).setOnClickListener(this);
    }

    @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.onboarding_loginbutton:{
                    startActivity(new Intent(getApplicationContext(), Login.class));
                }break;
                case R.id.onboarding_signuptext:{
                    startActivity(new Intent(getApplicationContext(), Signup.class));
                }break;

            }
        }
    }
