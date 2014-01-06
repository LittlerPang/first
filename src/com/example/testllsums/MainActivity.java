package com.example.testllsums;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.liulishuo.ums.UmsAgent;

public class MainActivity extends Activity {

	private static final String TAG = "TestLLSUms MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.e(TAG, "======onCreate()======");
		
		UmsAgent.init(getApplicationContext());
		
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.e(TAG, "======onResume()======");
		
		UmsAgent.onResume(getApplicationContext());
		
	}

	@Override
	protected void onPause() {
		super.onPause();
		
		Log.e(TAG, "======onPause()======");
		
	}
	
	
}
