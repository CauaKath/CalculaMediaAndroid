package com.example.calculamedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent it = new Intent(this, Resultado.class);

        EditText nomePessoa = (EditText) findViewById(R.id.nomePessoa);
        EditText nota1 = (EditText) findViewById(R.id.nota1);
        EditText nota2 = (EditText) findViewById(R.id.nota2);
        EditText nota3 = (EditText) findViewById(R.id.nota3);
        EditText nota4 = (EditText) findViewById(R.id.nota4);

        Bundle params = new Bundle();
        params.putString("nome", nomePessoa.getText().toString());
        params.putDouble("nota1", Double.parseDouble(nota1.getText().toString()));
        params.putDouble("nota2", Double.parseDouble(nota2.getText().toString()));
        params.putDouble("nota3", Double.parseDouble(nota3.getText().toString()));
        params.putDouble("nota4", Double.parseDouble(nota4.getText().toString()));
        it.putExtras(params);

        startActivity(it);
    }
}