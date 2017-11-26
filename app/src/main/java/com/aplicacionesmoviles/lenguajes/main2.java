package com.aplicacionesmoviles.lenguajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class main2 extends AppCompatActivity {
    int txt1,txt2,txt3,txt4,txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle dato = getIntent().getExtras();
        TextView txt = (TextView)findViewById(R.id.text);
        txt1= R.string.java;
        txt2= R.string.php;
        txt4= R.string.python;
        txt3= R.string.cmasmas;
        txt5= R.string.acerca___;
        if (dato.getString("item").equals("Java")){
            txt.setText(txt1);
        }else if (dato.getString("item").equals("PHP")){
            txt.setText(txt2);
        }else if (dato.getString("item").equals("C++")){
            txt.setText(txt3);
        }else if (dato.getString("item").equals("Python")){
            txt.setText(txt4);
        }else if (dato.getString("item").equals("Acerca de...")){
            txt.setText(txt5);
        }
    }

    public void btn(View view){
        finish();
    }
}
