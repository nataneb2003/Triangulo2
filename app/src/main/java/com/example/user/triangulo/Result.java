package com.example.user.triangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ViewTriangle(getApplicationContext(),new Triangulo(0,0,0)));
    }
}
