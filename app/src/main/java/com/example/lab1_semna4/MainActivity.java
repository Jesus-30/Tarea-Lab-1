package com.example.lab1_semna4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id==R.id.dos) {
            Intent intent = new Intent(this, ven1.class);
            startActivity(intent);
            Toast.makeText(this, "Calculo de hipotenusa", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id==R.id.tres){
            Intent intent = new Intent(this,ven2.class);
            startActivity(intent);

            Toast.makeText(this, "Salario Liquido", Toast.LENGTH_SHORT).show();
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

}