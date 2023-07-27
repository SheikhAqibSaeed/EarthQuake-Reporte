package com.example.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Earthquake_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity_main);
        // Create a fake list of earthquake locations.
        ArrayList<EarthQuake> earthquakes = QueryUtils.extractEarthquakes();
        // Adding demi data
//        earthquakes.add(new EarthQuake("4.5","San Francisco", "feb 4, 2022"));
//        earthquakes.add(new EarthQuake("4.5","San Francisco", "feb 4, 2022"));
//        earthquakes.add(new EarthQuake("4.5","San Francisco", "feb 4, 2022"));
//        earthquakes.add(new EarthQuake("4.5","San Francisco", "feb 4, 2022"));
//        earthquakes.add(new EarthQuake("4.5","San Francisco", "feb 4, 2022"));
//        earthquakes.add(new EarthQuake("4.5","San Francisco", "feb 4, 2022"));
//        earthquakes.add(new EarthQuake("4.5","San Francisco", "feb 4, 2022"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
       EarthQuakeAdapter adapter = new EarthQuakeAdapter(
                this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}