package edu.br.unifcv.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

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

    // achei isso para criar uma caixa de alerta, mas não consegui fazer
    //atributo da classe.
    private AlertDialog alerta;

    private void exemplo_simples() {
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle("Titulo");
        //define a mensagem
        builder.setMessage("Qualifique este software");
        //define um botão como positivo
        builder.setPositiveButton("Positivo", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "positivo=" + arg1, Toast.LENGTH_SHORT).show();
            }
        });
        //define um botão como negativo.
        builder.setNegativeButton("Negativo", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "negativo=" + arg1, Toast.LENGTH_SHORT).show();
            }
        });
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }
}