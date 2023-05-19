package com.example.sensewithme;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText username, password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.btnLogin);
        username = findViewById(R.id.txtUsername);
        password = findViewById(R.id.txtPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TextUser = username.getText().toString();
                String TextPass = password.getText().toString();

                String defUser = "Gabby";
                String defPass = "123!!";

                if(TextUser.equals(defUser) && TextPass.equals(defPass)) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("Username", TextUser);
                    intent.putExtra("Password", TextPass);
                    startActivity(intent);
                } else if (username.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Incomplete input!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Incomplete input!", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}