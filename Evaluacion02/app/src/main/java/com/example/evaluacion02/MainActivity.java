package com.example.evaluacion02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtMain_email, getEdtMain_password1, getEdtMain_password2;
    String correo = "admin@mail.com";
    String clave = "admin123";
    String clave2 = "admin123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() !=null) {
            getSupportActionBar().hide();
        }
        edtMain_email = (EditText)findViewById(R.id.edtMain_email);
        getEdtMain_password1 = (EditText)findViewById(R.id.edtMain_password1);
        getEdtMain_password2 = (EditText)findViewById(R.id.edtMain_password2);

    }

    public void GoToHome(View view){
        if (correo.equals(edtMain_email.getText().toString()) && clave.equals(getEdtMain_password1.getText().toString()) && clave2.equals(getEdtMain_password2.getText().toString())) {
            Intent activity = new Intent(this, Home.class);
            startActivity(activity);
            Toast.makeText(this, "Sesion iniciada correctamente", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Correo y/o contraseña incorrecta, intente nuevamente", Toast.LENGTH_SHORT).show();
        }
    }
}