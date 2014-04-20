package com.example.testapp;

import scavengerHunt.Hunt1;
import scavengerHunt.Hunt2;
import scavengerHunt.Hunt3;
import scavengerHunt.Hunt4;
import scavengerHunt.Hunt5;
import scavengerHunt.Hunt6;
import scavengerHunt.Hunt7;
import scavengerHunt.Hunt8;
import scavengerHunt.Hunt9;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScavengerHunt extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.scavenger_hunt);
	}
	
	public void hunt1(View view){
		Intent intent = new Intent(this, Hunt1.class);
		startActivity(intent);
	}
	
	public void hunt2(View view){
		Intent intent = new Intent(this, Hunt2.class);
		startActivity(intent);
	}
	
	public void hunt3(View view){
		Intent intent = new Intent(this, Hunt3.class);
		startActivity(intent);
	}
	
	public void hunt4(View view){
		Intent intent = new Intent(this, Hunt4.class);
		startActivity(intent);
	}
	
	public void hunt5(View view){
		Intent intent = new Intent(this, Hunt5.class);
		startActivity(intent);
	}
	
	public void hunt6(View view){
		Intent intent = new Intent(this, Hunt6.class);
		startActivity(intent);
	}
	
	public void hunt7(View view){
		Intent intent = new Intent(this, Hunt7.class);
		startActivity(intent);
	}
	
	public void hunt8(View view){
		Intent intent = new Intent(this, Hunt8.class);
		startActivity(intent);
	}
	
	public void hunt9(View view){
		Intent intent = new Intent(this, Hunt9.class);
		startActivity(intent);
	}

}
