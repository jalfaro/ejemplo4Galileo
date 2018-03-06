package edu.galileo.listasdropdown.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import edu.galileo.listasdropdown.R;
import edu.galileo.listasdropdown.data.SuperHeroe;

/**
 * Created by jalfaro on 3/5/18.
 */

public class SuperHeroeAdapter extends ArrayAdapter<SuperHeroe> {
    private Context context;
    private int layout;
    private List<SuperHeroe> lista;
    public SuperHeroeAdapter(@NonNull Context context,  @NonNull List<SuperHeroe> objects) {
        super(context, R.layout.item_superhero_layout, objects);
        this.context = context;
        this.layout = R.layout.item_superhero_layout;
        this.lista = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater lf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = lf.inflate(layout, null);
        }
        if (lista.get(position) != null) {
            TextView txtNombre, txtDescripcion;
            ImageView foto;
            txtNombre = (TextView) v.findViewById(R.id.item_nombre);
            txtDescripcion = (TextView) v.findViewById(R.id.item_descripcion);
            foto = (ImageView) v.findViewById(R.id.item_imagen);

            txtNombre.setText(lista.get(position).getNombre());
            txtDescripcion.setText(lista.get(position).getDescripcion());
            foto.setImageDrawable(context.getResources().getDrawable(lista.get(position).getFoto()));
        }
        return v;
    }
}
