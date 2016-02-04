package com.getmac;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.widget.TextView;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiInfo;  
import android.net.wifi.WifiManager;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		showMACAddress();
		getPhoneName();
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
	
	 public void showMACAddress(){
	        WifiManager wifiMan = (WifiManager) this.getSystemService(
	            Context.WIFI_SERVICE);
	        WifiInfo wifiInf = wifiMan.getConnectionInfo();
	        String macAddr = wifiInf.getMacAddress();

	        TextView MACAddress = (TextView)findViewById(R.id.textView1);
	        String macAddy = macAddr.toString();     
//	        
	        MACAddress.setTextSize (20);
	        MACAddress.setText("MAC: " + macAddy);
	    }

	 public void getPhoneName() {  
		 
		 TextView tv1 = (TextView) findViewById(R.id.textView2);
		 String str = android.os.Build.MODEL;
		 tv1.setTextSize(20);
		 tv1.setText(str);
	 }
	 
}
