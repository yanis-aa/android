package com.example.projetandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void button1 (View view) {
        startActivity(new Intent (this, Questionnaire_BAC.class));
    }

    public void button2 (View view) {
        startActivity(new Intent (this, Questionnaire_DUT1.class));
    }

    public void button3 (View view) {
        startActivity(new Intent (this, Questionnaire_DUT2.class));
    }
    public void button4 (View view) {
        startActivity(new Intent (this, Regles.class));
    }

}
