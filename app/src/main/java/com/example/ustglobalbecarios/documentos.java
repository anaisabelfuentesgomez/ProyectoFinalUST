package com.example.ustglobalbecarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class documentos extends AppCompatActivity implements View.OnClickListener {

    Button atras3;
    ImageView appian, testing;
    String enlace = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentos);

        atras3 = findViewById(R.id.atras);
        appian = findViewById(R.id.imageView17);
        testing =  findViewById(R.id.imageView18);

        sacarEnlace("Appian", appian);
        sacarEnlace("Testing", testing);

    }

    public void accionAtras(View v) {
        Intent intent4 = new Intent(documentos.this, MainActivity.class);
        startActivity(intent4);

    }

    public void sacarEnlace (String t, ImageView boton){
        AdminSQLiteOpenHealper admin = new AdminSQLiteOpenHealper(this, "docuementos", null, 1);
        SQLiteDatabase baseDatos = admin.getReadableDatabase();


        Cursor fila = baseDatos.rawQuery("SELECT enlace FROM docuementos WHERE titulo = '" + t + "'", null);


      //La utilización de estos Toast, es para verificar si hacia la consulta y si recoge los datos


        //Toast.makeText(this, "Hace ka consulta", Toast.LENGTH_LONG).show();
      /*if(fila!=null && fila.getCount()>0){
          Toast.makeText(this, "Tiene datos", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "No tiene datos", Toast.LENGTH_LONG).show();
        }*/


        if(fila.moveToFirst()){
           // Toast.makeText(this, "Entra en el if", Toast.LENGTH_LONG).show();
            enlace = fila.getString(0);
             //Toast.makeText(this, "coge el enlace: " + enlace, Toast.LENGTH_LONG).show();
        }

       boton.setOnClickListener(this);
        baseDatos.close();
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(enlace));
        if(intent.resolveActivity(getPackageManager())!= null){
            startActivity(intent);
        }
    }

}
