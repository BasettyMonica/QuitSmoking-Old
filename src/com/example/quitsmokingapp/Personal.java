package com.example.quitsmokingapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Personal extends ActionBarActivity {
String array[] = {"PERSONAL TRACKING...","Tracking Management","Start To Quit Smoke","Health Tips","Mood Management","Store info","Community"};
String aa;	
@Override
	protected void onCreate(Bundle b) {
		super.onCreate(b);
		setContentView(R.layout.activity_personal);
		b=getIntent().getExtras();
		 aa=b.getString("name");
		final ListView lv = (ListView) findViewById(R.id.listView1);
		lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
				String s = lv.getItemAtPosition(position).toString();
				if(("Tracking Management").equalsIgnoreCase(s))
				{
					Intent it = new Intent(Personal.this,Tracking.class);
					startActivity(it);
				}
				else	if(("Health Tips").equalsIgnoreCase(s))
				{
					Intent it = new Intent(Personal.this,Healthtips.class);
					startActivity(it);
				}
				else	if(("Start To Quit Smoke").equalsIgnoreCase(s))
				{
					Intent it = new Intent(Personal.this,Graphs.class);
					startActivity(it);
				}
				else	if(("Mood Management").equalsIgnoreCase(s))
				{
					Intent it = new Intent(Personal.this,Mood.class);
					startActivity(it);
				}
				else	if(("Store info").equalsIgnoreCase(s))
				{
					Intent it = new Intent(Personal.this,Info.class);
					it.putExtra("name",aa);
					startActivity(it);
				}
				else	if(("Community").equalsIgnoreCase(s))
				{
					String url = "http://www.facebook.com/pages/Quit-Smoking-Community/1447813835520717?ref=hl";
					Intent i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse(url));
					startActivity(i);
				}
			}
		});
	}

}
