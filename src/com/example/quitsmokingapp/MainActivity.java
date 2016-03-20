package com.example.quitsmokingapp;

import android.support.v7.app.ActionBarActivity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button bt=(Button)findViewById(R.id.button1);
		   final EditText et=(EditText)findViewById(R.id.editText1);
	        final EditText et1=(EditText)findViewById(R.id.editText2);
	        final EditText et2=(EditText)findViewById(R.id.editText3);
	        final EditText et3=(EditText)findViewById(R.id.editText4);
	        bt.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					String s=et.getText().toString();
					String s1=et1.getText().toString();
					String s2=et2.getText().toString();
					String s3=et3.getText().toString();
				db=openOrCreateDatabase("Student", MODE_PRIVATE, null);
				db.execSQL("create table if not exists ee(username varchar,age varchar,personalno varchar,homeno varchar)");
				db.execSQL("insert into ee values('"+s+"','"+s1+"','"+s2+"','"+s3+"')");
				Toast.makeText(getApplicationContext(), "inserted", 100).show();
				
				}
			});
	}

}
