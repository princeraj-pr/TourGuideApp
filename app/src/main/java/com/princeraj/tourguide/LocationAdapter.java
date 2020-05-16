package com.princeraj.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView nameTextView = convertView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentLocation.getName());

        TextView locationTextView = convertView.findViewById(R.id.location_text_view);
        locationTextView.setText(currentLocation.getLocation());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = convertView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return convertView;
    }
}
