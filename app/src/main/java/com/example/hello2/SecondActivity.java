package com.example.hello2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle b = this.getIntent().getExtras();
        TextView tv = findViewById(R.id.tv_sndAct);
        tv.setText(b.getString("nomSaisi"));

    }
}
