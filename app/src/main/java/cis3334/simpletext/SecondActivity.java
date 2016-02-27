package cis3334.simpletext;

import java.util.Calendar;
import java.util.GregorianCalendar;

import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.provider.CalendarContract.Events;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {
	
	String eventNum;		// number of the event from mainActivity
	TextView tvTitle, tvSum, tvLoc, tvDate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_second);
		
		tvTitle = (TextView) findViewById(R.id.txtTitle);
		tvSum = (TextView) findViewById(R.id.txtSummary);
		tvLoc = (TextView) findViewById(R.id.txtLocation);
		tvDate = (TextView) findViewById(R.id.txtDate);

        // get the data passed from the main activity using extras
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
            // grab the event number as a string from the main activity using extras
		    eventNum = extras.getString("eventNum");
		}
		//depending on the event number, display different information on this form
		if (eventNum.equals("1")) {
			tvTitle.setText(R.string.thistlesAndShamrocks);
			tvSum.setText(R.string.thistlesAndShamrocksDescription);
			tvLoc.setText(R.string.mitchellAuditorium);
			tvDate.setText(R.string.march4_2016);
		}
		if (eventNum.equals("2")) {
			tvTitle.setText(R.string.alworthPeaceJustice);
			tvSum.setText(R.string.altworthPeaceJusticeDescription);
			tvLoc.setText(R.string.mitchellAuditorium);
			tvDate.setText(R.string.march10_2016);
		}
		if (eventNum.equals("3")) {
			tvTitle.setText(R.string.cambiata);
			tvSum.setText(R.string.cambiataDescription);
			tvLoc.setText(R.string.mitchellAuditorium);
			tvDate.setText(R.string.march12_2016);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout_second, menu);
		return true;
	}
	
	public void onClickSendText (View v) {
		
		if (eventNum.equals("1")) {
		
			Intent calIntent = new Intent(Intent.ACTION_INSERT);
			calIntent.setType("vnd.android.cursor.item/event");
			calIntent.putExtra(Events.TITLE, getString(R.string.thistlesAndShamrocks));
			calIntent.putExtra(Events.EVENT_LOCATION, getString(R.string.mitchellAuditorium));
			GregorianCalendar begDate = new GregorianCalendar(2016, 3, 4, 7, 00);
			GregorianCalendar endDate = new GregorianCalendar(2015, 3, 4, 10, 30);
			calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
					begDate.getTimeInMillis());
			calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
					endDate.getTimeInMillis());
			startActivity(calIntent);
		}
		if (eventNum.equals("2")) {
			Intent calIntent = new Intent(Intent.ACTION_INSERT);
			calIntent.setType("vnd.android.cursor.item/event");
			calIntent.putExtra(Events.TITLE, getString(R.string.alworthPeaceJustice));
			calIntent.putExtra(Events.EVENT_LOCATION, getString(R.string.mitchellAuditorium));
            GregorianCalendar begDate = new GregorianCalendar(2016, 3, 10, 7, 30);
            GregorianCalendar endDate = new GregorianCalendar(2016, 3, 10, 9, 30);
            calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                    begDate.getTimeInMillis());
            calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                    endDate.getTimeInMillis());
			startActivity(calIntent);
		}
		if (eventNum.equals("3")) {
			Intent calIntent = new Intent(Intent.ACTION_INSERT);
			calIntent.setType("vnd.android.cursor.item/event");
			calIntent.putExtra(Events.TITLE, getString(R.string.cambiata));
			calIntent.putExtra(Events.EVENT_LOCATION, getString(R.string.mitchellAuditorium));
            GregorianCalendar begDate = new GregorianCalendar(2016, 3, 12, 7, 30);
            GregorianCalendar endDate = new GregorianCalendar(2016, 3, 12, 9, 30);
            calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                    begDate.getTimeInMillis());
            calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                    endDate.getTimeInMillis());
			startActivity(calIntent);

		}
		

	}
	

}
