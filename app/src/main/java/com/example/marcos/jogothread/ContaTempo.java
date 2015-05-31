package com.example.marcos.jogothread;

import android.content.Intent;
import android.provider.Telephony;

/**
 * Created by Marcos on 31/05/2015.
 */
public class ContaTempo extends Thread {
    private int tempo = 0;

    public void run(){
        while(true){
            try{
                Thread.sleep(500);
            } catch (Exception e){}
            tempo = tempo + 500;

        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}
