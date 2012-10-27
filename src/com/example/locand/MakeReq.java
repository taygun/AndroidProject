package com.example.locand;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.locand.Place;

public class MakeReq extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_req);
        
        Place place;
        ApiRequests req = new ApiRequests();
        place = req.getPlace();
        TextView placeProfile = (TextView) findViewById(R.id.placeLoc2);
        placeProfile.setText(place.getLocation());
        
       
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				goToMain();
				
			}
		});
    }
    
    public void goToMain() {
    	final Intent main = new Intent(this, MainActivity.class);
		startActivity(main);
		finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_make_req, menu);
        return true;
    }
}
