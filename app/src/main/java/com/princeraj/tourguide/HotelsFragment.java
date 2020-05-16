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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of hotel
        ArrayList<Location> hotelList = new ArrayList<>();
        hotelList.add(new Location(R.string.hotel_1, R.string.hotel_location_1, R.drawable.hotel_anand));
        hotelList.add(new Location(R.string.hotel_2, R.string.hotel_location_2, R.drawable.hotel_rk));
        hotelList.add(new Location(R.string.hotel_3, R.string.hotel_location_3, R.drawable.hotel_phular));
        hotelList.add(new Location(R.string.hotel_4, R.string.hotel_location_4, R.drawable.hotel_minakshi));
        hotelList.add(new Location(R.string.hotel_5, R.string.hotel_location_5, R.drawable.hotel_vivah));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), hotelList);

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
