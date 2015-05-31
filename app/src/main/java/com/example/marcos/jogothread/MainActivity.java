package com.example.marcos.jogothread;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    int btAtivo, tempo;
    private Button bt[] = new Button[9];
    Random gerador;
    ContaTempo contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt[0] = (Button) findViewById(R.id.button1);
        bt[1] = (Button) findViewById(R.id.button2);
        bt[2] = (Button) findViewById(R.id.button3);
        bt[3] = (Button) findViewById(R.id.button4);
        bt[4] = (Button) findViewById(R.id.button5);
        bt[5] = (Button) findViewById(R.id.button6);
        bt[6] = (Button) findViewById(R.id.button7);
        bt[7] = (Button) findViewById(R.id.button8);
        bt[8] = (Button) findViewById(R.id.button9);



        gerador = new Random();
        btAtivo = gerador.nextInt(10);
        for(int i = 0;i < 9; i++){
            bt[i].setBackgroundColor(Color.WHITE);
        }
        bt[btAtivo].setBackgroundColor(Color.rgb(0,199,60));
        contador = new ContaTempo();
        contador.start();




    }

    public void bt1(View v){
        if(btAtivo == 0 && contador.getTempo() < 1500){
            btAtivo = gerador.nextInt(10);
            for(int i = 0;i < 9; i++){
                bt[i].setBackgroundColor(Color.WHITE);
            }
            bt[btAtivo].setBackgroundColor(Color.rgb(0,199,60));
            contador.setTempo(0);

        } else{
            Intent i = new Intent(this, Perdeu.class);
            startActivity(i);
        }

    }

    public void bt2(View v){
        if(btAtivo == 1 && contador.getTempo() < 1500){
            btAtivo = gerador.nextInt(10);
            for(int i = 0;i < 9; i++){
                bt[i].setBackgroundColor(Color.WHITE);
            }
            bt[btAtivo].setBackgroundColor(Color.rgb(0,199,60));
            contador.setTempo(0);

        } else{
            Intent i = new Intent(this, Perdeu.class);
            startActivity(i);
        }

    }

    public void bt3(View v){
        if(btAtivo == 2 && contador.getTempo() < 1500){
            btAtivo = gerador.nextInt(10);
            for(int i = 0;i < 9; i++){
                bt[i].setBackgroundColor(Color.WHITE);
            }
            bt[btAtivo].setBackgroundColor(Color.rgb(0,199,60));
            contador.setTempo(0);

        } else{
            Intent i = new Intent(this, Perdeu.class);
            startActivity(i);
        }

    }

    public void bt4(View v){
        if(btAtivo == 3 && contador.getTempo() < 1500){
            btAtivo = gerador.nextInt(10);
            for(int i = 0;i < 9; i++){
                bt[i].setBackgroundColor(Color.WHITE);
            }
            bt[btAtivo].setBackgroundColor(Color.rgb(0,199,60));
            contador.setTempo(0);

        } else{
            Intent i = new Intent(this, Perdeu.class);
            startActivity(i);
        }

    }

    public void bt5(View v){
        if(btAtivo == 4 && contador.getTempo() < 1500){
            btAtivo = gerador.nextInt(10);
            for(int i = 0;i < 9; i++){
                bt[i].setBackgroundColor(Color.WHITE);
            }
            bt[btAtivo].setBackgroundColor(Color.rgb(0,199,60));
            contador.setTempo(0);

        } else{
            Intent i = new Intent(this, Perdeu.class);
            startActivity(i);
        }

    }

    public void bt6(View v){
        if(btAtivo == 5 && contador.getTempo() < 1500){
            btAtivo = gerador.nextInt(10);
            for(int i = 0;i < 9; i++){
                bt[i].setBackgroundColor(Color.WHITE);
            }
            bt[btAtivo].setBackgroundColor(Color.rgb(0,199,60));
            contador.setTempo(0);

        } else{
            Intent i = new Intent(this, Perdeu.class);
            startActivity(i);
        }

    }

    public void bt7(View v){
        if(btAtivo == 6 && contador.getTempo() < 1500){
            btAtivo = gerador.nextInt(10);
            for(int i = 0;i < 9; i++){
                bt[i].setBackgroundColor(Color.WHITE);
            }
            bt[btAtivo].setBackgroundColor(Color.rgb(0,199,60));
            contador.setTempo(0);

        } else{
            Intent i = new Intent(this, Perdeu.class);
            startActivity(i);
        }

    }

    public void bt8(View v){
        if(btAtivo == 7 && contador.getTempo() < 1500){
            btAtivo = gerador.nextInt(10);
            for(int i = 0;i < 9; i++){
                bt[i].setBackgroundColor(Color.WHITE);
            }
            bt[btAtivo].setBackgroundColor(Color.rgb(0,199,60));
            contador.setTempo(0);

        } else{
            Intent i = new Intent(this, Perdeu.class);
            startActivity(i);
        }

    }

    public void bt9(View v){
        if(btAtivo == 8 && contador.getTempo() < 1500){
            btAtivo = gerador.nextInt(10);
            for(int i = 0;i < 9; i++){
                bt[i].setBackgroundColor(Color.WHITE);
            }
            bt[btAtivo].setBackgroundColor(Color.rgb(0,199,60));
            contador.setTempo(0);

        } else{
            Intent i = new Intent(this, Perdeu.class);
            startActivity(i);
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
