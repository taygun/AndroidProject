package com.example.locand;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	Place place;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*
        ApiRequests req = new ApiRequests();
        place = req.getPlace();
        TextView placeProfile = (TextView) findViewById(R.id.placeLoc);
        placeProfile.setText(place.getLocation());
        TextView placeComm = (TextView) findViewById(R.id.placeComm);
        placeComm.setText(place.getComm());
        */
        
        Button makereq = (Button) findViewById(R.id.makereq);
        makereq.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				goToReq();
				
			}
		});
    }
    
    public void goToReq() {
    	final Intent makeReq = new Intent(this, MakeReq.class);
		startActivity(makeReq);
		finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
