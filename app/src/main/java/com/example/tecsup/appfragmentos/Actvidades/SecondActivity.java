package com.example.tecsup.appfragmentos.Actvidades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tecsup.appfragmentos.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); //hay que importar la R porque estamos dentro de otro paquete
    }
}
