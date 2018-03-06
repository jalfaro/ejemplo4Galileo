package edu.galileo.listasdropdown;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import edu.galileo.listasdropdown.adapter.SuperHeroeAdapter;
import edu.galileo.listasdropdown.data.SuperHeroe;

/**
 * Created by jalfaro on 3/5/18.
 */

public class HeroActivity extends AppCompatActivity {
    private LinearLayout layout;
    private ListView heroList;
    private List<SuperHeroe> heroesList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        SuperHeroe item;
        int color;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_layout);
        color = getIntent().getIntExtra("fondo", Color.rgb(255,255,255));
        layout = (LinearLayout) findViewById(R.id.layout);
        heroList = (ListView) findViewById(R.id.hero_list);
        layout.setBackgroundColor(color);

        //Creacion a picieto de cada elemento en la lista
        heroesList = new ArrayList<SuperHeroe>();
        item = new SuperHeroe("Hulk", "El doctor Bruce Banner al trabajar con rayos gamma sufrio un accidente que lo convirtio en Hulk", R.drawable.ic_hulk);
        heroesList.add(item);
        item = new SuperHeroe("Capitan America", "Soldado modificado geneticamente en la segunda guerra mundial que se congelo y actualmente lucha en nuestros tiempos", R.drawable.ic_captain);
        heroesList.add(item);
        item = new SuperHeroe("Back Widow", "Espia Rusa, que actualmente trabaja en Shield", R.drawable.ic_blackwidow);
        heroesList.add(item);
        item = new SuperHeroe("Hawkeye", "Espia con una punteria infalible que trabaja Shield", R.drawable.ic_hawkeye);
        heroesList.add(item);

        heroList.setAdapter(new SuperHeroeAdapter(this, heroesList));

    }
}
