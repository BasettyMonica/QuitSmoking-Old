package com.example.quitsmokingapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends ActionBarActivity {
	SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	 	final EditText et = (EditText) findViewById(R.id.editText1);
		Button b1 = (Button) findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String name = et.getText().toString();
				db=openOrCreateDatabase("Student", MODE_PRIVATE, null);
				Cursor c=db.rawQuery("select * from ee where username='"+name+"'", null);
				System.out.println(name);
				int a=c.getCount();
				if(a>0){
					Intent i = new Intent(Login.this,Personal.class);
					i.putExtra("name",name);
					startActivity(i);
				}else{
					Toast.makeText(getApplicationContext(), "Invalid Credentials", 100).show();
				}
				
				

							}
						});
	}		}
		
