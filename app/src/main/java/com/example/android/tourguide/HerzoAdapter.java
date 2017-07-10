package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HerzoAdapter extends ArrayAdapter<Herzo>{
    /**
     * Create a new {@link HerzoAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param herzoinfo is the list of {@link Herzo} to be displayed.
     */
    public HerzoAdapter(Context context, ArrayList<Herzo> herzoinfo) {
        super(context, 0, herzoinfo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link HerzoInformationen} object located at this position in the list
        Herzo currentHerzo = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID maincategory_text_view.
        TextView maincategoryTextView = (TextView) listItemView.findViewById(R.id.maincategory_text_view);
        // Get the Main Category from the currentHerzoInformationen object and set this text on
        // the Main Category TextView.
        maincategoryTextView.setText(currentHerzo.getmMainCategory());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set the ImageView to the image resource specified in the current Word
        imageView.setImageResource(currentHerzo.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView subcategoryTextView = (TextView) listItemView.findViewById(R.id.subcategory_text_view);
        // Get the sub category from the currentHerzoInformationen object and set this text on
        // the sub category TextView.
        subcategoryTextView.setText(currentHerzo.getmSubCategory());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
