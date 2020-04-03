package com.example.qcmdut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class domaines extends AppCompatActivity {

    public void AccesQuestionnaire (View view) {
        Intent intent = new Intent(domaines.this, menuQuestionnaire.class);
        Button questionnaire = (Button)view;
        String i = questionnaire.getText().toString();
        intent.putExtra("i_domaine", i);
        startActivityForResult(intent, 1);

        //variable global
        Global link = Global.getInstance();
        StringBuilder s = new StringBuilder(link.getData());
        s.append(i + "-");
        link.setData(s);

        Log.d("my tag", s.toString());
    }

    public void AccesClasse (View view) {
        Intent intent = new Intent(domaines.this, ClasseActivity.class);
        startActivity(intent);
    }


}
