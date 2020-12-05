package com.example.lab1_semna4;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ven2 extends AppCompatActivity {
    private EditText  sal;
    private TextView resul;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ven2);
        sal = (EditText)findViewById(R.id.sal);
        resul = (TextView) findViewById(R.id.resul);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id==R.id.uno){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);

            Toast.makeText(this, "Entra a mi Apk", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id==R.id.dos) {
            Intent intent = new Intent(this, ven1.class);
            startActivity(intent);
            Toast.makeText(this, "Ventana 1", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id==R.id.tres){
            Intent intent = new Intent(this,ven2.class);
            startActivity(intent);

            Toast.makeText(this, "Ventana 2", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (id==R.id.cuatro){
            Intent intent = new Intent(this,acerca_de.class);
            startActivity(intent);

            Toast.makeText(this, "acerca_de", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public  void cal(View view){

        String val1 = sal.getText().toString();
        double n1 = Integer.valueOf(val1);
        if (n1 >= 3000){
         double comi = n1 *  0.10;
         double salc = 300 + comi;
         double ren = salc * 0.10;
         double salf = salc - ren;
         String rel = String.valueOf(salf);
         resul.setText(rel);
        }
        else if (n1 >= 1000 && n1 < 3000){
            double comi = n1 *  0.08;
            double salc = 300 + comi;
            double ren = salc * 0.10;
            double salf = salc - ren;
            String rel = String.valueOf(salf);
            resul.setText(rel);
        }
        else if (n1 >= 1 && n1 < 1000){
            double comi = n1 *  0.05;
            double salc = 300 + comi;
            double ren = salc * 0.10;
            double salf = salc - ren;
            String rel = String.valueOf(salf);
            resul.setText(rel);
        }
    }
}
