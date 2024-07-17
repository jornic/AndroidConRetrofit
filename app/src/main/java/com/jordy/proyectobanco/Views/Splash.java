package com.jordy.proyectobanco.Views;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jordy.proyectobanco.R;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(()->{
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(R.anim.in,R.anim.out);
            finish();
        },2000);
    }
}
