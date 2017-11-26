package com.aplicacionesmoviles.lenguajes;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class Adapter extends ArrayAdapter {
    Activity context;
    String[] itemnames;
    Integer[] integers;

    public Adapter(Activity context, String[] itemnames, Integer[] integers) {
        super(context,R.layout.list,itemnames);
        this.context=context;
        this.itemnames=itemnames;
        this.integers=integers;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.list,null,true);
        TextView textView = (TextView)view.findViewById(R.id.txt);
        ImageView imageView = (ImageView)view.findViewById(R.id.icon);
        textView.setText(itemnames[position]);
        imageView.setImageResource(integers[position]);
        return view;
    }
}
