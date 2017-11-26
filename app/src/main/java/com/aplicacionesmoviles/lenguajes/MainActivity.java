package com.aplicacionesmoviles.lenguajes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

private String Lenguages[]= new String[]{"Java", "PHP", "C++", "Python", "Acerca de..."};
private Integer[] imgid={
        R.drawable.java,
        R.drawable.php,
        R.drawable.cmasmas,
        R.drawable.python,
        R.drawable.acercade};
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter adp = new Adapter(this,Lenguages,imgid);
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adp);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = Lenguages[+position];
        Intent i = new Intent(getApplicationContext(),main2.class);
        i.putExtra("item",item);
        startActivity(i);
        }
        });
        }
}