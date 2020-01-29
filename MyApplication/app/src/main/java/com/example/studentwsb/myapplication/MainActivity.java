package com.example.studentwsb.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bttn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttn1 = (Button) findViewById(R.id.button);
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zmienNa2();
            }
        });
    }

    private void zmienNa2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
