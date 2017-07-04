package com.example.b.bookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        login= (Button) findViewById(R.id.login);
        register= (Button) findViewById(R.id.register);

        ButtonLogin();
        ButtonRegister();
    }

    private void ButtonRegister() {
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainScreen.this,Register.class);
                startActivity(i);
            }
        });

    }

    private void ButtonLogin() {

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainScreen.this,Login.class);
                startActivity(i);

            }
        });

    }
}
