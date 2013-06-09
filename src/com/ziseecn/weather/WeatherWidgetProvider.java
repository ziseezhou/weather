package com.ziseecn.weather;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

public class WeatherWidgetProvider extends AppWidgetProvider {
    private static final String TAG = "weather";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v(TAG, ">>> onReceive()");
        super.onReceive(context, intent);
    }
    
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager,
            int[] appWidgetIds) {
        Log.v(TAG, ">>> onUpdate()");
        
        final int N = appWidgetIds.length;

        // Perform this loop procedure for each App Widget that belongs to this provider
        for (int i=0; i<N; i++) {
            int appWidgetId = appWidgetIds[i];

            // Create an Intent to launch ExampleActivity
            Intent intent = new Intent(context, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

            // Get the layout for the App Widget and attach an on-click listener
            // to the button
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.weather_appwidget);
            views.setOnClickPendingIntent(R.id.weather_img, pendingIntent);

            // Tell the AppWidgetManager to perform an update on the current app widget
            appWidgetManager.updateAppWidget(appWidgetId, views);
        }

    }
    
    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        Log.v(TAG, ">>> onDeleted()");
        super.onDeleted(context, appWidgetIds);
    }
    
    @Override
    public void onEnabled(Context context) {
        Log.v(TAG, ">>> onEnabled()");
        super.onEnabled(context);
    }
    
    @Override
    public void onDisabled(Context context) {
        Log.v(TAG, ">>> onDisabled()");
        super.onDisabled(context);
    }
    
    private void updateTime() {
        ;
    }
}