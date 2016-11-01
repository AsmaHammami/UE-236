package com.deust.applicontact;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivitySecond extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main2);
	
	
	final Button monbuttonAnnuler = (Button) findViewById(R.id.button2);
	monbuttonAnnuler.setOnClickListener(new OnClickListener() {
               
    @Override
    public void onClick(View v) {
      Intent intent1 = new Intent(MainActivitySecond.this, MainActivity.class);
      startActivity(intent1);
      }
  });
    
	
	final Button monbuttonValider = (Button) findViewById(R.id.button1);
	monbuttonValider.setOnClickListener(new OnClickListener() {
               
    @Override
    public void onClick(View v) {

	     Toast.makeText(getApplicationContext(),
                      "Vers Activité MainActivity", Toast.LENGTH_LONG).show();
      Intent intent2 = new Intent(MainActivitySecond.this, MainActivity.class);
      startActivity(intent2);
      }
  });
	
	
	
	
	
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

