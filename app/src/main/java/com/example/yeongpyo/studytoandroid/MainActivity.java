package com.example.yeongpyo.studytoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yeongpyo.studytoandroid.JAVA_Study.JAVAMainActivity;
import com.example.yeongpyo.studytoandroid.KOTLIN_Study.KOTLINMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.JAVAButton).setOnClickListener(view->startActivity(new Intent(this, JAVAMainActivity.class)));

        findViewById(R.id.KOTLINButton).setOnClickListener(view -> startActivity(new Intent(this, KOTLINMainActivity.class)));

    }
}
