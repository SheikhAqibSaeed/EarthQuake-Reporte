package com.example.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {
    public EarthQuakeAdapter(Context context, List<EarthQuake> earthQuakes) {
        super(context, 0 , earthQuakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView= convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);
        }
        EarthQuake currentEarthQuake = getItem(position);

        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthQuake.getMagnitude());

        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        locationView.setText(currentEarthQuake.getDate());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentEarthQuake.getDate());

        return listItemView;
    }
}
