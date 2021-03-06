package com.example.qcmdut;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class AsyncTaskConnex extends AsyncTask<URL, Void, String> {

    private GestionAdmin main;

    public AsyncTaskConnex (GestionAdmin m) {
        main = m;
    }

    @Override
    protected String ArrierePlan(URL... urls) {
        URL u;
        URLConnection c;
        String inputline;
        StringBuilder codeHTML = new StringBuilder("");


        u= urls[0];

        try {
            c= u.openConnection();
            
            c.setConnectTimeout(60000);
            
            c.setReadTimeout(60000);
            
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(c.getInputStream(),"UTF-8"));
            while((inputline = in.readLine())!=null){
                
                codeHTML.append(inputline+"\n");
            }
            
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return codeHTML.toString();
    }

    @Override
    protected void onPostExecute (String s) {
        
        main.afficheResultat(s);

    }
}
