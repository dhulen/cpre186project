package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScheduleActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.schedule_activity);
	    
	}
	
	public void contentPage1(View view){
		Intent intent = new Intent(this, ContentPage1.class);
		startActivity(intent);
	}
	
	public void contentPage2(View view){
		Intent intent = new Intent(this, ContentPage2.class);
		startActivity(intent);
	}
	
	public void contentPage3(View view){
		Intent intent = new Intent(this, ContentPage3.class);
		startActivity(intent);
	}
	
	public void contentPage4(View view){
		Intent intent = new Intent(this, ContentPage4.class);
		startActivity(intent);
	}
	
	public void contentPage5(View view){
		Intent intent = new Intent(this, ContentPage5.class);
		startActivity(intent);
	}
	
	public void scavengerHunt(View view){
		Intent intent = new Intent(this, ScavengerHunt.class);
		startActivity(intent);
	}
	
	public void contentPage6(View view){
		Intent intent = new Intent(this, ContentPage6.class);
		startActivity(intent);
	}
	
	public void contentPage7(View view){
		Intent intent = new Intent(this, ContentPage7.class);
		startActivity(intent);
	}
	
	public void contentPage8(View view){
		Intent intent = new Intent(this, ContentPage8.class);
		startActivity(intent);
	}

}
