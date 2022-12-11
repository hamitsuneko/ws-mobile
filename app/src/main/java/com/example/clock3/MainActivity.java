package com.example.clock3;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.clock3.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MainActivity extends Activity {
    private EditText Email;
    private EditText Password;
    private Button LoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = (EditText)findViewById(R.id.editTextTextEmailAddress);
        Password = (EditText)findViewById(R.id.editTextTextPassword);
        LoginBtn = (Button)findViewById(R.id.button2);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check(Email.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void check(String inputEmail, String inputPassword) {
        String[] emails = getResources().getStringArray(R.array.emails);
        String[] passwords = getResources().getStringArray(R.array.pass);

        if(Arrays.asList(emails).contains(inputEmail) &&
                Arrays.asList(emails).indexOf(inputEmail) == Arrays.asList(passwords).indexOf(inputPassword)) {

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            startActivity(intent);
        }
        else {
            Email.setTextColor(Color.rgb(255, 0, 0));
            Password.setTextColor(Color.rgb(255, 0, 0));
        }
    }

}