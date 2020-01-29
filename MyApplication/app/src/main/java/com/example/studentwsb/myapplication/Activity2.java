package com.example.studentwsb.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button bttn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        bttn2 = (Button) findViewById(R.id.button2);
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zmienNa1();
            }
        });


    }

    private void zmienNa1() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
