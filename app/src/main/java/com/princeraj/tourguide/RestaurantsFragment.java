package com.princeraj.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> restaurantsList = new ArrayList<>();
        restaurantsList.add(new Location(R.string.restaurants_1, R.string.restaurants_location_1));
        restaurantsList.add(new Location(R.string.restaurants_2, R.string.restaurants_location_2));
        restaurantsList.add(new Location(R.string.restaurants_3, R.string.restaurants_location_3));
        restaurantsList.add(new Location(R.string.restaurants_4, R.string.restaurants_location_4));
        restaurantsList.add(new Location(R.string.restaurants_5, R.string.restaurants_location_5));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), restaurantsList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
