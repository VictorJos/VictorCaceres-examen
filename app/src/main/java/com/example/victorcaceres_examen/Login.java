package com.example.victorcaceres_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText ed1, ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed1 = (EditText) findViewById(R.id.txtUsuario);
        ed2 = (EditText) findViewById(R.id.txtContraseña);
    }

    public void Ingresar21(View v) {
        String V_Usuario = ed1.getText().toString();
        String V_Contraseña = ed2.getText().toString();
        if (V_Usuario.equals("estudiante2020") && V_Contraseña.equals("uisrael2020")) {
            Intent intent = new Intent(Login.this, Registro.class);
            Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_LONG).show();
            intent.putExtra("datos enviados", ed1.getText().toString());
            startActivity(intent);

        } else {
            Toast.makeText(getApplicationContext(), "Usuario o Contraseña Incorrectas", Toast.LENGTH_LONG).show();
        }
    }
}
