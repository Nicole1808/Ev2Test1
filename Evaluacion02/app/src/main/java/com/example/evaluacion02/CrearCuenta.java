package com.example.evaluacion02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CrearCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }

    public void Volver (View view){
        Intent activity=new Intent (this,MainActivity.class);
        startActivity(activity);
    }

    public void Crear(View view) {
        EditText edtMain_email, getEdtMain_password1, getEdtMain_password2, getEdtMain_name;

        edtMain_email = (EditText)findViewById(R.id.edtMain_email);
        getEdtMain_password1 = (EditText)findViewById(R.id.edtMain_password1);
        getEdtMain_password2 = (EditText)findViewById(R.id.edtMain_password2);
        getEdtMain_name = (EditText)findViewById(R.id.edtMain_name);

        String correo=edtMain_email.getText().toString();
        String nick=getEdtMain_name.getText().toString();
        String pass1=getEdtMain_password1.getText().toString();
        String pass2=getEdtMain_password2.getText().toString();
        String validacion1="falso";

        if (correo.isEmpty() || pass1.isEmpty() || pass2.isEmpty()) {
            Toast.makeText(this, "Campos vacios, intente nuevamente", Toast.LENGTH_SHORT).show();

        }else {
            validacion1="verdadero";
        }
        if (pass1.equals(pass2) && validacion1=="verdadero"){
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            String getEmail = edtMain_email.getText().toString();
            Toast.makeText(this, "Bienvenido a PulpiLand "+getEdtMain_name, Toast.LENGTH_SHORT).show();
            Intent activity=new Intent (this,MainActivity.class);
                    startActivity(activity);

        }else {
            Toast.makeText(this, "Las contraseña no coinciden", Toast.LENGTH_SHORT).show();
        }
    }
}