package com.first.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView real;
    TextView dolar;
    TextView euro;
    Button conver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        real = findViewById(R.id.txt_real);
        dolar = findViewById(R.id.txt_dolar);
        euro = findViewById(R.id.txt_euro);
        conver = findViewById(R.id.btn_converter);
    }



    public void converter(View view){
        double vlrReal = Double.parseDouble(real.getText().toString());

        DecimalFormat converte = new DecimalFormat("#.##");

        String convertidoDolar = converte.format(vlrReal / 5.19);
        String convertidoEuro = converte.format(vlrReal / 5.69);

        dolar.setText(convertidoDolar);
        euro.setText(convertidoEuro);
    }


}