package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gasapp.ExampleDialog;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)  findViewById(R.id.btn1);
        button4 =(Button) findViewById(R.id.btn4);
        button2=(Button) findViewById(R.id.btn2);
        button3=(Button) findViewById(R.id.btn3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog2();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTP2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTP3();
            }
        });
    }
    public void openDialog(){
        ExampleDialog exampleDialog =new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(),"TP1");
    }
    public void openDialog2(){
        SecondDialog secondDialog =new SecondDialog();
        secondDialog.show(getSupportFragmentManager(),"TP4");
    }
    public void openTP2(){
        Intent intent = new Intent(this,TP2.class);
        startActivity(intent);
    }
    public void openTP3(){
        Intent intent = new Intent(this,TP3.class);
        startActivity(intent);
    }
}