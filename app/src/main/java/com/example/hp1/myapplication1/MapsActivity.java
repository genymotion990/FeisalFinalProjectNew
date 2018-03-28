package com.example.hp1.myapplication1;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng harinaftali = new LatLng(33.239051, 35.571829);
        LatLng marom_hagolan = new LatLng(33.136622, 35.769492);
        LatLng katzrin = new LatLng(32.991109, 35.682730);
        LatLng bat_yaar = new LatLng(32.996329, 35.519112);
        LatLng alon_hagalil = new LatLng(32.763976, 35.221433);
        LatLng hasolilim = new LatLng(32.750992, 35.242269);
        LatLng shemshit = new LatLng(32.745535, 35.242823);
        LatLng gevaat_ela = new LatLng(32.723106, 35.243902);
        LatLng temrat = new LatLng(32.703497, 35.214996);
        LatLng kfar_hahoresh = new LatLng(32.696851, 35.236365);
        LatLng nahal_hashofet = new LatLng(32.636967, 35.110124);

        LatLng sovev_ofakim = new LatLng(31.338205, 34.651218);











        googleMap.addMarker(new MarkerOptions().position(harinaftali).title("סינגיל הרי נפתלי"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(harinaftali));
        googleMap.addMarker(new MarkerOptions().position(marom_hagolan).title("סינגיל מרום הגולן"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(marom_hagolan));
        googleMap.addMarker(new MarkerOptions().position(katzrin).title(" שביל אופניים קצרין"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(katzrin));
        googleMap.addMarker(new MarkerOptions().position(bat_yaar).title(" שביל אופניים בת יער"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(bat_yaar));
        googleMap.addMarker(new MarkerOptions().position(alon_hagalil).title(" סינגיל אלון הגליל"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(alon_hagalil));
        googleMap.addMarker(new MarkerOptions().position(hasolilim).title(" סינגיל סוללים"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(hasolilim));
        googleMap.addMarker(new MarkerOptions().position(shemshit).title(" סינגיל שמשית"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(shemshit));
        googleMap.addMarker(new MarkerOptions().position(gevaat_ela).title(" סינגיל גבעת אלה"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(gevaat_ela));
        googleMap.addMarker(new MarkerOptions().position(temrat).title(" סינגיל תמרת"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(temrat));
        googleMap.addMarker(new MarkerOptions().position(kfar_hahoresh).title(" סינגיל כפר החורש"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(kfar_hahoresh));
        googleMap.addMarker(new MarkerOptions().position(nahal_hashofet).title(" סינגיל נחל השופט"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(nahal_hashofet));
        googleMap.addMarker(new MarkerOptions().position(sovev_ofakim).title(" סינגיל סובב אופקים"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sovev_ofakim));










    }
    // Draw polyline on map
    public void drawPolyLineOnMap(List<LatLng> list) {
        PolylineOptions polyOptions = new PolylineOptions();
        polyOptions.color(Color.RED);
        polyOptions.width(5);
        polyOptions.addAll(list);

        mMap.clear();
        mMap.addPolyline(polyOptions);

        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (LatLng latLng : list) {
            builder.include(latLng);
        }

        final LatLngBounds bounds = builder.build();

        //BOUND_PADDING is an int to specify padding of bound.. try 100.
     //   CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
      //  googleMap.animateCamera(cu);
    }

}
