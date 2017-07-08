package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by petra on 2017.06.15..
 */

public class Leben extends AppCompatActivity {

    @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.herzo_list);

    // Create a list of Herzo Information
    ArrayList<Herzo> herzoinfo = new ArrayList<Herzo>();
    herzoinfo.add(new Herzo("Abfall", "Hundekot", R.drawable.leben));
    herzoinfo.add(new Herzo("Neubürger", "Tipps und Hinweise", R.drawable.leben));
    herzoinfo.add(new Herzo("Bürgerengagement", "Ehrenamt", R.drawable.leben));
    herzoinfo.add(new Herzo("Barrierefreies Leben", "Herzo inklusiv", R.drawable.leben));
    herzoinfo.add(new Herzo("Gesundheit", "Gesundheitsamt", R.drawable.leben));
    herzoinfo.add(new Herzo("Kinderbetreuung", "Kindertagespflege", R.drawable.leben));
    herzoinfo.add(new Herzo("Schulen", "Schulen in Herzogenaurach", R.drawable.leben));
    herzoinfo.add(new Herzo("Kirchen und Religiöse Gemeinschaften in Herzogenaurach", "Katholische Kirchen", R.drawable.leben));

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
