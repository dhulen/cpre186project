package scavengerHunt;

import android.app.Activity;
import android.os.Bundle;

import com.example.testapp.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Hunt4 extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hunt4);

		// Get a handle to the Map Fragment
		GoogleMap map = ((MapFragment) getFragmentManager().findFragmentById(
				R.id.map)).getMap();

		setUpMapIfNeeded(map);

		// AIzaSyDJyYfOHNtiY_EhrOXGCBByfQ08TWo-ToU

		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);

		LatLng Catt = new LatLng(42.027884, -93.645679);

		map.setMyLocationEnabled(true);
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(Catt, 17));

		map.addMarker(new MarkerOptions().title("Catt Hall")
				.snippet("Iowa State University Catt Hall").position(Catt));
	}

	private void setUpMapIfNeeded(GoogleMap map) {
		// Do a null check to confirm that we have not already instantiated the
		// map.
		if (map == null) {
			map = ((MapFragment) getFragmentManager()
					.findFragmentById(R.id.map)).getMap();
			// Check if we were successful in obtaining the map.
			if (map != null) {
				// The Map is verified. It is now safe to manipulate the map.

			}
		}
	}

}
