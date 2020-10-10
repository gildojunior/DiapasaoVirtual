package edu.br.unifcv.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Apresentacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);
        Thread welcomeThread = new Thread() {

            // Método responsável por mostrar a
            // tela de apresentação por 3 segundos
            @Override
            public void run() {
                try {
                    super.run();
                    sleep(3000 );
                } catch (Exception e) {

                } finally {
                    Intent intent = new Intent(Apresentacao.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}