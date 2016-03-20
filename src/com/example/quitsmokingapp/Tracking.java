package com.example.quitsmokingapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Tracking extends ActionBarActivity {
	String array[] = {"1 to 5 Cigars","6 to 10 Cigars","11 to 15 Cigars","16 to 20 Cigars"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tracking);
		final Spinner s=(Spinner) findViewById(R.id.spinner1);
		final ImageView iv=(ImageView)findViewById(R.id.imageView1);
		s.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array));
		s.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
			String pos = s.getItemAtPosition(position).toString();
			if(pos.equalsIgnoreCase("1 to 5 Cigars"))
			{
				iv.setImageResource(R.drawable.imagesone);
				
			}else if((pos.equalsIgnoreCase("6 to 10 Cigars"))){
				iv.setImageResource(R.drawable.second);
			}
			else if((pos.equalsIgnoreCase("11 to 15 Cigars"))){
				iv.setImageResource(R.drawable.three);
			}else if((pos.equalsIgnoreCase("16 to 20 Cigars"))){
				iv.setImageResource(R.drawable.four);
			}
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	
}
