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
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnD = (Button) findViewById(R.id.buttonD);
        btnB = (Button) findViewById(R.id.buttonB);
        btnA = (Button) findViewById(R.id.buttonA);
        btnE = (Button) findViewById(R.id.buttonE);
        btnG = (Button) findViewById(R.id.buttonG);
        btnEm = (Button) findViewById(R.id.buttonEm);

        clickD();
        clickB();
        clickA();
        clickE();
        clickG();
        clickEm();
    }

    // Corda D

    private void clickD (){
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.rezao);
                    mediaPlayer.start();
                }else {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }else {
                        mediaPlayer.start();
                    }
                }
            }

        });
    }

    //Corda B

    private void clickB (){
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.si);
                    mediaPlayer.start();
                }else {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }else {
                        mediaPlayer.start();
                    }
                }
            }

        });
    }

    //Corda A

    private void clickA (){
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.lazao);
                    mediaPlayer.start();
                }else {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }else {
                        mediaPlayer.start();
                    }
                }
            }

        });
    }

    //Corda E

    private void clickE (){
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mizao);
                    mediaPlayer.start();
                }else {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }else {
                        mediaPlayer.start();
                    }
                }
            }

        });
    }

    //Corda G

    private void clickG (){
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sol);
                    mediaPlayer.start();
                }else {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }else {
                        mediaPlayer.start();
                    }
                }
            }

        });
    }

    //Corda Em

    private void clickEm (){
        btnEm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mizinha);
                    mediaPlayer.start();
                }else {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }else {
                        mediaPlayer.start();
                    }
                }
            }

        });
    }
}