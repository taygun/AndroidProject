package com.example.locand;

import org.json.JSONException;
import org.json.JSONObject;

public class Place {
	String location = new String();
	int votes;
	int rating;
	String commentary;
	
	public Place(JSONObject obj) {
		try {
			location = obj.getString("location");
			commentary = obj.getString("commentary");
			votes = obj.getInt("votes");
			rating = obj.getInt("rating");
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getComm() {
		return this.commentary;
	}


}
