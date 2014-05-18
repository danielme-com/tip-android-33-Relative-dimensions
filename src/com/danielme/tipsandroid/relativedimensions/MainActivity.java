package com.danielme.tipsandroid.relativedimensions;

import com.danieme.tipsandroid.relativedimensiones.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * 
 * @author danielme.com
 * 
 */
public class MainActivity extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DisplayMetrics metrics = getResources().getDisplayMetrics();

		TextView textView = (TextView) findViewById(R.id.textView4);
		textView.setText(metrics.densityDpi + "dpi - " + metrics.heightPixels + " x " + metrics.widthPixels);
	}
}