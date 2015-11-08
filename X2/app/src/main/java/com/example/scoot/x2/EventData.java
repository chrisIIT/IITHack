package com.example.scoot.x2;

import android.app.Activity;
import android.os.Bundle;
import com.here.android.mpa.common.GeoCoordinate;
import com.here.android.mpa.common.OnEngineInitListener;
import com.here.android.mpa.mapping.Map;
import com.here.android.mpa.mapping.MapFragment;
import android.widget.TextView;
import java.util.List;

/**
 * Created by Scoot on 11/7/2015.
 */
public class EventData extends Activity {
    // map embedded in the map fragment
    private Map map = null;

    // map fragment embedded in this activity
    private MapFragment mapFragment = null;
    private Rendezvous r;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_data);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            List<Rendezvous> rs = extras.getParcelableArrayList("rendezvous");
            r = rs.get(0);
            System.out.println("made it to Event Data");
        }

        TextView title = (TextView) findViewById(R.id.createHeader);
        title.setText(r.getName());

        TextView desc = (TextView) findViewById(R.id.descID);
        desc.setText(r.getDescription());

        TextView date = (TextView) findViewById(R.id.dateID);
        date.setText(r.getDate());

        TextView loc = (TextView) findViewById(R.id.locID);
        loc.setText(r.getLocation());

//        // Search for the map fragment to finish setup by calling init().
//        mapFragment = (MapFragment)getFragmentManager().findFragmentById(
//                R.id.mapfragment);
//        mapFragment.init(new OnEngineInitListener() {
//            @Override
//            public void onEngineInitializationCompleted(
//                    OnEngineInitListener.Error error)
//            {
//                if (error == OnEngineInitListener.Error.NONE) {
//                    // retrieve a reference of the map from the map fragment
//                    map = mapFragment.getMap();
//                    // Set the map center to the Vancouver region (no animation)
//                    map.setCenter(new GeoCoordinate(49.196261, -123.004773, 0.0),
//                            Map.Animation.NONE);
//                    // Set the zoom level to the average between min and max
//                    map.setZoomLevel(
//                            (map.getMaxZoomLevel() + map.getMinZoomLevel()) / 2);
//                } else {
//                    System.out.println("ERROR: Cannot initialize Map Fragment");
//                    System.out.println(error);
//                }
//            }
//        });



    }
}
