package com.example.ustglobalbecarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button siguiente;
    Button documentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente = findViewById(R.id.siguiente);
        documentos = findViewById(R.id.documentacion);

        //Estos son los datos que carga la base de datos, son dos enlaces a documentos externos.
        cargarDatos(1, "Appian", "https://drive.google.com/drive/folders/1U6N1qbZYFrMS3TmI_RM-CTp0nydDT4Ci?usp=sharing");
        cargarDatos(2, "Testing", "https://drive.google.com/drive/folders/14HyHaSVJMGPg5PjTwAaEaBa0vnbHO1sD?usp=sharing");

    }
//He llamado funciones a los textview que funcionan como boton.
    public void funcionAppian(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://ustglobalspaindemo.appiancloud.com/suite/tempo/news"));
        if(intent.resolveActivity(getPackageManager())!= null){
            startActivity(intent);
        }
    }
    public void funcionEstratecno(View v){
        Intent intent3 = new Intent(Intent.ACTION_VIEW);
        intent3.setData(Uri.parse("https://www.estratecno.es/"));
        if(intent3.resolveActivity(getPackageManager())!= null){
            startActivity(intent3);
        }
    }
    public void funcionMBA(View v){
        Intent intent4 = new Intent(Intent.ACTION_VIEW);
        intent4.setData(Uri.parse("https://thepowermba.com/es/"));
        if(intent4.resolveActivity(getPackageManager())!= null){
            startActivity(intent4);
        }
    }
    public void funcionOWeinars(View v){
        Intent intent5 = new Intent(Intent.ACTION_VIEW);
        intent5.setData(Uri.parse("https://openwebinars.net/accounts/login/?next=/academia/cursos/"));
        if(intent5.resolveActivity(getPackageManager())!= null){
            startActivity(intent5);
        }
    }
    public void funcionEnglish(View v){
        Intent intent5 = new Intent(Intent.ACTION_VIEW);
        intent5.setData(Uri.parse("https://idiomasseif.com/"));
        if(intent5.resolveActivity(getPackageManager())!= null){
            startActivity(intent5);
        }
    }





//Botón que pasa a la siguiente activity
    public void accionSiguiente(View v) {
        Intent intent1 = new Intent(MainActivity.this, segunda.class);
        startActivity(intent1);

}//Botón que abre el activity documentos donde se encuentran los enlaces cargados por la base de datos.
    public void acciondocumentos(View v) {
        Intent intent2 = new Intent(MainActivity.this, documentos.class);
        startActivity(intent2);
    }

    public void cargarDatos(int id, String pTitulo, String pEnlace){
        AdminSQLiteOpenHealper admin = new AdminSQLiteOpenHealper(this, "docuementos", null, 1);
        SQLiteDatabase baseDatos = admin.getWritableDatabase();

        String dataId = Integer.toString(id);
        String dataTitulo = pTitulo;
        String dataEnlace = pEnlace;

        ContentValues contenido = new ContentValues();

        contenido.put("id", dataId);
        contenido.put("titulo", dataTitulo);
        contenido.put("enlace", dataEnlace);

        baseDatos.insert("docuementos", null, contenido);
        baseDatos.close();
        //Toast para comprobar si abre  base de datos.
       //Toast.makeText(this, "Abre la base", Toast.LENGTH_LONG).show();
    }
}
