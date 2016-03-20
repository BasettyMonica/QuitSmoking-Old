package com.example.quitsmokingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableRow;

public class Mood extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mood);
		TableRow tr=(TableRow)findViewById(R.id.tableRow1);
		tr.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent it=new Intent(Mood.this,Depression.class);
				startActivity(it);
			}
		});
		TableRow tr1=(TableRow)findViewById(R.id.tableRow2);
		tr1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent it=new Intent(Mood.this,Tension.class);
				startActivity(it);
			}
		});
		TableRow tr2=(TableRow)findViewById(R.id.tableRow3);
		tr2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent it=new Intent(Mood.this,Stress.class);
				startActivity(it);
			}
		});
		TableRow tr3=(TableRow)findViewById(R.id.tableRow4);
		tr3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent it=new Intent(Mood.this,Happy.class);
				startActivity(it);
			}
		});
		TableRow tr4=(TableRow)findViewById(R.id.tableRow5);
		tr4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent it=new Intent(Mood.this,Friends.class);
				startActivity(it);
			}
		});
	}

}
