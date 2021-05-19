package com.example.tunisairapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button btnValidLogin;
    /*ImageView logo_img;
    TextView logo_title, logo_subtitle;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*logo_img = findViewById(R.id.app_logo);
        logo_title = findViewById(R.id.logo_name);
        logo_subtitle = findViewById(R.id.slogan_name);*/

        btnValidLogin = findViewById(R.id.btn_ValidLogin);
        btnValidLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }
}