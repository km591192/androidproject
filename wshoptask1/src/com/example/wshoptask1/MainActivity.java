package com.example.wshoptask1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	private Button hellobutton;
	private Button aboutbutton;
	private Button startbutton;
	private TextView tvhello;
	private RelativeLayout inner;
	private RelativeLayout next;
	private EditText etlogin;
	private EditText etpassword;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		hellobutton = (Button) findViewById(R.id.bnt1);
		aboutbutton = (Button) findViewById(R.id.bnt2);
		startbutton = (Button) findViewById(R.id.bnt3);
		tvhello = (TextView) findViewById(R.id.tv1);
		
		inner = (RelativeLayout) findViewById(R.id.inner);
		next = (RelativeLayout) findViewById(R.id.next);
		
		etlogin = (EditText) findViewById(R.id.etlogin);
		etpassword = (EditText) findViewById(R.id.etpassword);
		
		hellobutton.setOnClickListener(this);
		aboutbutton.setOnClickListener(this);
		startbutton.setOnClickListener(this);
		
		inner.setVisibility(View.VISIBLE);
		next.setVisibility(View.INVISIBLE);
		
		String login = etlogin.getText().toString();
		String password = etpassword.getText().toString();
	}

	@Override
	public void onClick(View v)
	{
		
		switch (v.getId()){
		case R.id.bnt1:
			tvhello.setText("Hello user");
			break;
		case R.id.bnt2:
			Intent intent = new Intent (this,About_Activity.class);
			startActivity(intent);
			break;
		case R.id.bnt3:
			inner.setVisibility(View.GONE);
			next.setVisibility(View.VISIBLE);
			break;
		}
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
