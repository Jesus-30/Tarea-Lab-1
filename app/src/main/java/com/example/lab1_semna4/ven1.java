package com.example.lab1_semna4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ven1 extends AppCompatActivity {
    private EditText cp1,cap2 ;
    private TextView resul;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ven1);
        cp1 = (EditText)findViewById(R.id.cp1);
        cap2 = (EditText)findViewById(R.id.cap2);
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
        String val1 = cp1.getText().toString();
        String val2 = cap2.getText().toString();
        double n1 = Integer.valueOf(val1);
        double n2 = Integer.valueOf(val2);
        double op =  Math.hypot(n1,n2);
        String res = String.valueOf(op);
        resul.setText(res);
    }
}
