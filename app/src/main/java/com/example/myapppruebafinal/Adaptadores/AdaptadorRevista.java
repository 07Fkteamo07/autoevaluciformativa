package com.example.myapppruebafinal.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapppruebafinal.Modelos.Revista;
import com.example.myapppruebafinal.R;

import java.util.ArrayList;

public class AdaptadorRevista extends ArrayAdapter<Revista> {
    public AdaptadorRevista(Context context, ArrayList<Revista> datos) {
        super(context, R.layout.lyitemrevista, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lyitemrevista, null);
        TextView lblNombre = (TextView)item.findViewById(R.id.lblTitulo);lblNombre.setText(getItem(position).getNombre());
        ImageView imageView = (ImageView)item.findViewById(R.id.ImaPortada);
        Glide.with(this.getContext())
                .load(getItem(position).getPortada())
                .into(imageView);
        return(item);
    }
}