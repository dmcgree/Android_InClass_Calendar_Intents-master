//CIS 3334 Sec 700 Mobile Device Programming - Spring 2016
//In class assignment: Calendar Intents
//Date: 02/26/2016
//Submitted by: Dana McGree

package cis3334.simpletext;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout_main, menu);
		return true;
	}
	
    public void onClickB1(View view) {
        // create an intent for the second activity
    	Intent i = new Intent(getApplicationContext(), SecondActivity.class);
    	i.putExtra("eventNum","1");         // pass the event number 1 to the second activity
    	startActivity(i);                   // start up the second activity
    }
    
    public void onClickB2(View view) {
        // create an intent for the second activity
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
    	i.putExtra("eventNum","2");         // pass the event number 2 to the second activity
    	startActivity(i);                   // start up the second activity
    }
    
    public void onClickB3(View view) {
        // create an intent for the second activity
    	Intent i = new Intent(getApplicationContext(), SecondActivity.class);
    	i.putExtra("eventNum","3");         // pass the event number 3 to the second activity
    	startActivity(i);                   // start up the second activity
    }

}
