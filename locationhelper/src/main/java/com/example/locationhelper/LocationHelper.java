package com.example.locationhelper;

import android.location.Location;

public class LocationHelper {

    public static float getLocationInKm(double startLongitude,double endLongitude,double startLatitued,double endLatitude) {
        float [] results = new float[0];
        Location.distanceBetween(startLatitued,startLongitude,endLatitude,endLongitude,results);
        return results[0]/1000;
    }

}
