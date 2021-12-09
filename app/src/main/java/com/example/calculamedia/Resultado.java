package com.example.calculamedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Resultado extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView nomePessoa = (TextView) findViewById(R.id.nome);
        TextView nota1 = (TextView) findViewById(R.id.n1Result);
        TextView nota2 = (TextView) findViewById(R.id.n2Result);
        TextView nota3 = (TextView) findViewById(R.id.n3Result);
        TextView nota4 = (TextView) findViewById(R.id.n4Result);
        TextView media = (TextView) findViewById(R.id.media);
        Intent it = getIntent();

        if (it != null) {
            Bundle params = it.getExtras();
            if (params != null) {
                nomePessoa.setText(params.getString("nome"));

                double n1 = params.getDouble("nota1");
                double n2 = params.getDouble("nota2");
                double n3 = params.getDouble("nota3");
                double n4 = params.getDouble("nota4");
                double mediaNotas = (n1 + n2 + n3 + n4) / 4;

                nota1.setText((int) n1);
                nota2.setText((int) n2);
                nota3.setText((int) n3);
                nota4.setText((int) n4);
                media.setText((int) mediaNotas);
            }
        }

        Button btnVoltar = (Button) findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}