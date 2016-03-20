package com.example.quitsmokingapp;

import android.support.v7.app.ActionBarActivity;
import android.telephony.gsm.SmsManager;
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

public class Info extends ActionBarActivity {
SQLiteDatabase db;
String aa,num;
	@Override
	protected void onCreate(Bundle b) {
		super.onCreate(b);
		setContentView(R.layout.activity_info);
		b=getIntent().getExtras();
		 aa=b.getString("name");
		final EditText et=(EditText)findViewById(R.id.editText1);
		Button bt=(Button)findViewById(R.id.button1);
		
		db=openOrCreateDatabase("Student", MODE_PRIVATE, null);
		Cursor c=db.rawQuery("select * from ee where username='"+aa+"'", null);
		int a=c.getCount();
		
		if(c!=null){
			c.moveToFirst();
			do{
				 num=c.getString(c.getColumnIndex("homeno"));
			}while(c.moveToNext());
		}
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s=et.getText().toString();
				SmsManager sms=SmsManager.getDefault();
				sms.sendTextMessage(num, null,"Your family member is smoking "+s+" cigarettes so please take care of him/her" , null,null);
			}
		});
		

}
	

}
