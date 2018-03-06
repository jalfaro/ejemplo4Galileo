package edu.galileo.listasdropdown;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView lista;
    private String[] colores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        lista = (ListView) findViewById(R.id.listaColores);
        colores = getResources().getStringArray(R.array.colores);
        lista.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, colores));
        lista.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, colores[(int)id], Toast.LENGTH_LONG ).show();
        int color = 0;
        Intent intent = new Intent(this, HeroActivity.class);
        switch (colores[(int)id]) {
            case "Rojo" :
                color = Color.rgb(255,0,0);
                break;
            case "Azul" :
                color = Color.rgb(0,0,255);
                break;
            case "Verde" :
                color = Color.rgb(0,255,0);
                break;
            case "Morado" :
                color = Color.rgb(255,0,255);
                break;
            case "Cyan" :
                color = Color.rgb(0,150,150);
                break;
            case "Rosa" :
                color = Color.rgb(255,30,30);
                break;
        }
        intent.putExtra("fondo", color);
        startActivity(intent);
    }
}
