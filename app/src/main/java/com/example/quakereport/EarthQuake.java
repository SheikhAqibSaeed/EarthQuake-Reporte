package com.example.quakereport;

public class EarthQuake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    // Create Constractors
    public EarthQuake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    // Create Methods of EarthQuake
    public String getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public String getDate(){
        return mDate;
    }
}
