package com.example.ustglobalbecarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tercera extends AppCompatActivity {
    Button atras2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        atras2 = findViewById(R.id.atras);

    }
    public void funcionguarderia(View v){
        Intent intent3 = new Intent(Intent.ACTION_VIEW);
        intent3.setData(Uri.parse("http://www.chiquikid.com/"));
        if(intent3.resolveActivity(getPackageManager())!= null){
            startActivity(intent3);
        }
    }
    public void funcioncheque(View v){
        Intent intent4 = new Intent(Intent.ACTION_VIEW);
        intent4.setData(Uri.parse("https://www.familycheck.es/"));
        if(intent4.resolveActivity(getPackageManager())!= null){
            startActivity(intent4);
        }
    }
    public void funcionBBVA(View v){
        Intent intent5 = new Intent(Intent.ACTION_VIEW);
        intent5.setData(Uri.parse("https://www.fbbva.es/"));
        if(intent5.resolveActivity(getPackageManager())!= null){
            startActivity(intent5);
        }
    }
    public void funcionGYM(View v) {
        Intent intent5 = new Intent(Intent.ACTION_VIEW);
        intent5.setData(Uri.parse("https://www.basic-fit.com/es-es/gimnasios/madrid"));
        if (intent5.resolveActivity(getPackageManager()) != null) {
            startActivity(intent5);
        }
    }
    //Botón que vuelve a la anterior activity
    public void accionAtras(View v) {
            Intent intent3 = new Intent(tercera.this, segunda.class);
            startActivity(intent3);
    }
}
