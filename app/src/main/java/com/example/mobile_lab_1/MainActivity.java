package com.example.mobile_lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_0);
    }

    public void changeActivityFirst(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}