package com.example.rehab_coachv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ProfileActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_Holo);
		setContentView(R.layout.activity_profile);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.dark, menu);
			return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {

	        case R.id.home_screen:
	            openHome();
	            return true;
	        case R.id.profile_screen:
	            openProfile();
	            return true;
	        case R.id.help_screen:
	            openHelp();
	            return true;
	        case R.id.settings_screen:
	            openSettings();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	public void openHome() {
		Intent remind = new Intent (this, HomeActivity.class);
		startActivity(remind);
		
	}

	public void openProfile() {
		Intent remind = new Intent (this, ProfileActivity.class);
		startActivity(remind);
		
	}

	public void openHelp() {
		Intent remind = new Intent (this, HelpActivity.class);
		startActivity(remind);	
	}
	
	public void openSettings() {
		Intent remind = new Intent (this, SettingsActivity.class);
		startActivity(remind);	
	}
	
	public void editContact(View view)
	{
		Intent edit = new Intent(this, EditContactActivity.class);
		edit.putExtra("info_type", 0);
		startActivity(edit);
	}
	
	public void editEmergencyContact(View view)
	{
		Intent edit = new Intent(this, EditContactActivity.class);
		edit.putExtra("info_type", 1);
		startActivity(edit);
	}

}
