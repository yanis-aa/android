package com.example.qcmdut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;


    public void start () {
        String s;
        URL u;

        s = "http://infort.gautero.fr/index.php?action=get&obj=question";
        try {
            u = new URL(s);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            u = null;
        }

        t = new TaskGetQuestion(this);
        t.execute(u);

    }

    public String decodeJSON (String s) {
        JSONObject obj;
        JSONArray tabobj;
        int v;
        StringBuilder r;

        r= new StringBuilder("");

        try {
            obj= new JSONObject(s);
            tabobj= obj.getJSONArray("questions");
            for (int i= 0; i< tabobj.length(); i++) {
                v= tabobj.getInt(i);
                r.append(v);
                r.append("-");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.d("decode", r.toString());
        return r.toString();
    }


    public void afficheQuestion(String s)
    {
        Log.d("aff", s);
        output.setText(s);
    }
}
