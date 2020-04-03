package com.example.qcmdut;

import android.os.AsyncTask;

public class Thread extends AsyncTask<String, Void, String> {

    private Thread activite;

    public Thread (MainActivity m) {
        activite = m;
    }


    @Override
    public void onPostExecute (String r) {
        activite.goToClasse(r);
    }
}

