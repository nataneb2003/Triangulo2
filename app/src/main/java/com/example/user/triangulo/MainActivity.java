package com.example.user.triangulo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    EditText A;
    EditText B;
    EditText degree;
    TextView res;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A = (EditText) findViewById(R.id.et1);
        B = (EditText) findViewById(R.id.et2);
        degree =  (EditText) findViewById(R.id.degree);
        btn = (Button ) findViewById(R.id.btn);
        res = (TextView) findViewById(R.id.resposta);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Triangulo t = new Triangulo(Double.parseDouble(A.getText()+""),Double.parseDouble(B.getText()+""),Double.parseDouble(degree.getText()+""));


                res.setText("A área deste triangule é "+ t.getArea()+ " "+ t.getTriangle());

                //result(t);
            }
        });}

        public void result(Triangulo t){
            Intent intent = new Intent(this,Result.class);

            intent.putExtra("triangle",t.getAll());

            startActivity(intent);


        }

    }

