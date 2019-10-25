package com.example.myfirstapp;

import com.example.myfirstapp.BuildConfig;

public class Constants {
    public static final String YELP_BASE_URL = "https://api.yelp.com/v3/";
    public static final String YELP_API_KEY = BuildConfig.YELP_API_KEY;
    public static final String PREFERENCES_LOCATION_KEY = "location";

    public static final String YELP_LOCATION_QUERY_PARAMETER = "location";
    public static final String FIREBASE_CHILD_SEARCHED_LOCATION = "searchedLocation";

    public static final String FIREBASE_CHILD_RESTAURANTS = "restaurants";

//    //Data persistence _ Shared Preferences
//    public static final String PREFERENCES_LOCATION_KEY = "location";
//    //Child node name for saving the values for searched Locations in Firebase
//    public static final String FIREBASE_CHILD_SEARCHED_LOCATION = "searchedLocation";
}
