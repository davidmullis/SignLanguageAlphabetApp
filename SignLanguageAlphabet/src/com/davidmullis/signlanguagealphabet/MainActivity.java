package com.davidmullis.signlanguagealphabet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "message";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	public void displayAButtonImage(View view)
	{
		String strImage = "drawable/alphabet_0";
		startImageActivity(strImage);
	}
	
	public void displayBButtonImage(View view)
	{
		String strImage = "drawable/alphabet_1";
		startImageActivity(strImage);
	}
	
	public void displayCButtonImage(View view)
	{
		String strImage = "drawable/alphabet_2";
		startImageActivity(strImage);
	}
	
	public void displayDButtonImage(View view)
	{
		String strImage = "drawable/alphabet_3";
		startImageActivity(strImage);
	}
	
	public void displayEButtonImage(View view)
	{
		String strImage = "drawable/alphabet_4";
		startImageActivity(strImage);
	}
	
	public void displayFButtonImage(View view)
	{
		String strImage = "drawable/alphabet_5";
		startImageActivity(strImage);
	}
	
	public void displayGButtonImage(View view)
	{
		String strImage = "drawable/alphabet_6";
		startImageActivity(strImage);
	}
	
	public void displayHButtonImage(View view)
	{
		String strImage = "drawable/alphabet_7";
		startImageActivity(strImage);
	}
	
	public void displayIButtonImage(View view)
	{
		String strImage = "drawable/alphabet_8";
		startImageActivity(strImage);
	}
	
	public void displayJButtonImage(View view)
	{
		String strImage = "drawable/alphabet_9";
		startImageActivity(strImage);
	}
	
	public void displayKButtonImage(View view)
	{
		String strImage = "drawable/alphabet_10";
		startImageActivity(strImage);
	}
	
	public void displayLButtonImage(View view)
	{
		String strImage = "drawable/alphabet_11";
		startImageActivity(strImage);
	}
	
	public void displayMButtonImage(View view)
	{
		String strImage = "drawable/alphabet_12";
		startImageActivity(strImage);
	}
	
	public void displayNButtonImage(View view)
	{
		String strImage = "drawable/alphabet_13";
		startImageActivity(strImage);
	}
	
	public void displayOButtonImage(View view)
	{
		String strImage = "drawable/alphabet_14";
		startImageActivity(strImage);
	}
	
	public void displayPButtonImage(View view)
	{
		String strImage = "drawable/alphabet_15";
		startImageActivity(strImage);
	}
	
	public void displayQButtonImage(View view)
	{
		String strImage = "drawable/alphabet_16";
		startImageActivity(strImage);
	}
	
	public void displayRButtonImage(View view)
	{
		String strImage = "drawable/alphabet_17";
		startImageActivity(strImage);
	}
	
	public void displaySButtonImage(View view)
	{
		String strImage = "drawable/alphabet_18";
		startImageActivity(strImage);
	}
	
	public void displayTButtonImage(View view)
	{
		String strImage = "drawable/alphabet_19";
		startImageActivity(strImage);
	}
	
	public void displayUButtonImage(View view)
	{
		String strImage = "drawable/alphabet_20";
		startImageActivity(strImage);
	}
	
	public void displayVButtonImage(View view)
	{
		String strImage = "drawable/alphabet_21";
		startImageActivity(strImage);
	}
	
	public void displayWButtonImage(View view)
	{
		String strImage = "drawable/alphabet_22";
		startImageActivity(strImage);
	}
	
	public void displayXButtonImage(View view)
	{
		String strImage = "drawable/alphabet_23";
		startImageActivity(strImage);
	}
	
	public void displayYButtonImage(View view)
	{
		String strImage = "drawable/alphabet_24";
		startImageActivity(strImage);
	}
	
	public void displayZButtonImage(View view)
	{
		String strImage = "drawable/alphabet_25";
		startImageActivity(strImage);
	}
	
	public void startImageActivity(String strImage)
	{
		Intent intent = new Intent(this, DisplayImageActivity.class);
		intent.putExtra(EXTRA_MESSAGE, strImage);
		startActivity(intent);
	}
	
	public void startSpellAWordActivity(View view)
	{
		Intent intent = new Intent(this, SpellAWordActivity.class);
		startActivity(intent);
	}
}
