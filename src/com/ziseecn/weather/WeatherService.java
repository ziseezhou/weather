package com.ziseecn.weather;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class WeatherService extends Service {

    public WeatherService(){}
    
    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }
    
}