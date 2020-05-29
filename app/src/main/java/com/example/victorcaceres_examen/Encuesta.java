package com.example.victorcaceres_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {
    EditText recibido1,ed3;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
    RadioButton rb1,rb2;
    Bundle racc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        //recibido1=findViewById(R.id.txtrecibido);
        ed3=findViewById(R.id.txtcentro);
        cb1=findViewById(R.id.cd1);
        cb2=findViewById(R.id.cd2);
        cb3=findViewById(R.id.cd3);
        rb1=findViewById(R.id.rd1);
        rb2=findViewById(R.id.rd2);


    }
    public void Verificar(View v){
        Intent intent= new Intent(Encuesta.this, Resumen.class);
        intent.putExtra("datos enviados1",ed3.getText().toString());

        if(cb1.isChecked()==true){

            intent.putExtra("datos enviados",cb1.getText().toString());


        }
        else if(cb2.isChecked()==true){
            intent.putExtra("datos enviados",cb2.getText().toString());

        }
        else if(cb3.isChecked()==true){
            intent.putExtra("datos enviados",cb3.getText().toString());

        }

        if(rb1.isChecked()==true){
            intent.putExtra("datos enviados2",rb1.getText().toString());

        }
        if(rb2.isChecked()==true){
            intent.putExtra("datos enviados2",rb2.getText().toString());

        }
        startActivity(intent);

    }
}
