package edu.br.unifcv.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnD, btnB, btnA, btnE, btnG, btnEm;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remover a status bar do app
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnD = (Button) findViewById(R.id.buttonD);
        btnB = (Button) findViewById(R.id.buttonB);
        btnA = (Button) findViewById(R.id.buttonA);
        btnE = (Button) findViewById(R.id.buttonE);
        btnG = (Button) findViewById(R.id.buttonG);
        btnEm = (Button) findViewById(R.id.buttonEm);

        tocarCordaD();
        tocarCordaB();
        tocarCordaA();
        tocarCordaE();
        tocarCordaG();
        tocarCordaEm();
    }

    // Corda D
    private void tocarCordaD(){
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mediaPlayer == null){
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.rezao);
                mediaPlayer.start();
                return;
            }

            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
            }
        });
    }

    //Corda B
    private void tocarCordaB(){
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mediaPlayer == null){
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.si);
                mediaPlayer.start();
                return;
            }

            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
            }
        });
    }

    //Corda A
    private void tocarCordaA(){
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mediaPlayer == null){
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.lazao);
                mediaPlayer.start();
                return;
            }

            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
            }
        });
    }

    //Corda E
    private void tocarCordaE(){
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mediaPlayer == null){
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mizao);
                mediaPlayer.start();
                return;
            }

            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
            }
        });
    }

    //Corda G
    private void tocarCordaG(){
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mediaPlayer == null){
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sol);
                mediaPlayer.start();
                return;
            }

            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
            }
        });
    }

    //Corda Em
    private void tocarCordaEm(){
        btnEm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mediaPlayer == null){
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mizinha);
                mediaPlayer.start();
                return;
            }

            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
            }
        });
    }
}