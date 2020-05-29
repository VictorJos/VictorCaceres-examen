package com.example.victorcaceres_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
EditText nombre,inicial,mensual,recibido;
Bundle ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        recibido=findViewById(R.id.txtrecibido);
        nombre=findViewById(R.id.txtNombre);
        inicial=findViewById(R.id.txtinicial);
        mensual=findViewById(R.id.txtmensual);
        ed1= getIntent().getExtras();
        String aa=  ed1.getString("datos enviados");
        recibido.setText(aa);


    }
    public void Calcular(View v){
        double valor1,valor2,valor3,valor4,valor5,valor6,valor7,promedio1,promedio2,total;
        valor1= Double.parseDouble(inicial.getText().toString());
        valor2= 1800-valor1;
        valor3=(valor2/3);
        valor4=valor3+(1800*0.05);
        mensual.setText(String.format("%.1f" ,valor4));

    }
    public void Guardar(View v){

        //Intent intent1 = new Intent(Registro.this, Resumen.class);

        Intent intent1 = new Intent(Registro.this, Resumen.class);
        Toast.makeText(getApplicationContext(), "Elemento Guardado con exito", Toast.LENGTH_LONG).show();
        intent1.putExtra("datos guardados", nombre.getText().toString());
        startActivity(intent1);

    }
    public void Empuesta(View v){

        Intent intent2 = new Intent(Registro.this, Encuesta.class);

        startActivity(intent2);

    }
}
