package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Stadtraum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herzo_list);

        // Create a list of Herzo Information
        ArrayList<Herzo> herzoinfo = new ArrayList<Herzo>();
        herzoinfo.add(new Herzo("Wirtschaft", "Konferenz- und Tagungsangebote", R.drawable.stadtraum));
        herzoinfo.add(new Herzo("Baustellen", "Sanierung \"An der Schütt\"", R.drawable.stadtraum));
        herzoinfo.add(new Herzo("Stadtverkehr", "Parken", R.drawable.stadtraum));
        herzoinfo.add(new Herzo("Ortsteile", "Burgstall", R.drawable.stadtraum));
        herzoinfo.add(new Herzo("Stadtentwicklung & Stadtplanung", "Verkehrsprojekte", R.drawable.stadtraum));
        herzoinfo.add(new Herzo("Planen & Bauen", "Aktuelle Bauleitplanung", R.drawable.stadtraum));
        herzoinfo.add(new Herzo("Städtebauförderung", "Fitnessprogamm Innenstadt", R.drawable.stadtraum));
        herzoinfo.add(new Herzo("Klima & Energie", "European Energy Award®", R.drawable.stadtraum));

        // Create an {@link HerzoAdapter}, whose data source is a list of {@link Herzo}. The
        // adapter knows how to create list items for each item in the list.
        HerzoAdapter adapter = new HerzoAdapter(this, herzoinfo);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link HerzoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link HerzoInformationen} in the list.
        listView.setAdapter(adapter);
    }
}
