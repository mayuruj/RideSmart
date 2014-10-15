package com.ridesmart.version1;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

import android.view.Menu;

public class RideSmartActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_ride_smart);
		loadUrl("file:///android_asset/www/ridesmart_index.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_ride_smart, menu);
		return true;
	}

}
