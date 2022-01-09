package com.nuhuntailor.polaku;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import java.util.*;
import android.view.View.*;
import android.graphics.drawable.*;
import android.transition.*;
import android.view.animation.*;



public class MainActivity extends Activity 
{
	
	int d;
	String sat;
	String pjg2;
	EditText pjgg;
	int col = Color.parseColor("#ABD3FE");
	

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		
        setContentView(R.layout.main);
		tes2();
		tes();
    }
	

	
	public void baju(View view){
		kalku();
	}
	
	public void kalku(){
		setContentView(R.layout.kalku);
		Spinner spinner = findViewById(R.id.jenis);
		Spinner spinner2 = findViewById(R.id.jenis_tangan);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.jenis_baju, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.jenis_tangan, android.R.layout.simple_spinner_item);
		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(adapter2);
		d = 1;
		tes3();
		TextView judu = findViewById(R.id.judul2);
		Typeface ff = Typeface.createFromAsset(getAssets(), "fonts/ro.ttf");
		judu.setTypeface(ff);
	}
	
	public void hasil(View view){
		pjgg = findViewById(R.id.pjg);
		pjg2 = pjgg.getText().toString();
		setContentView(R.layout.hasilbaju);
		TextView text = findViewById(R.id.pjghasil);
		text.setText(pjg2);
		d = 2;
	}
	
	public void tes(){
		Button button = findViewById(R.id.celana);
		button.setOnTouchListener(new OnTouchListener() {

				@Override
				public boolean onTouch(View v, MotionEvent event) {

					Button b = findViewById(R.id.celana);

					if (event.getAction() == MotionEvent.ACTION_DOWN) {
						b.setBackgroundColor(col);
					}
					else if (event.getAction() == MotionEvent.ACTION_UP) {
						b.setBackgroundColor(Color.parseColor("#D5D5D5"));
					}
					return true;
				}
			});
		
	}
	
	public void tes2(){
		setContentView(R.layout.daftar);
		TextView judu = findViewById(R.id.judul);
		Typeface ff = Typeface.createFromAsset(getAssets(), "fonts/ro.ttf");
		judu.setTypeface(ff);
		Button button = findViewById(R.id.baju);
		button.setOnTouchListener(new OnTouchListener() {

				@Override
				public boolean onTouch(View v, MotionEvent event) {

					Button b = findViewById(R.id.baju);

					if (event.getAction() == MotionEvent.ACTION_DOWN) {
						b.setBackgroundColor(col);
					}
					else if (event.getAction() == MotionEvent.ACTION_UP) {
						b.setBackgroundColor(Color.parseColor("#D5D5D5"));
						b.performClick();
					}
					return true;
				}
			});
		d = 0;
		
	}
	
	
	@Override
	public void onBackPressed()
	{
		if(d == 0)
		{
			super.onBackPressed();
		}
		if(d == 1){
			tes2();
			tes();
		}
		if(d == 2){
			kalku();
		}
		
		
	}
	
	
	public void tes3(){
		Button button = findViewById(R.id.hasil);
		button.setOnTouchListener(new OnTouchListener() {

				@Override
				public boolean onTouch(View v, MotionEvent event) {

					Button b = findViewById(R.id.hasil);

					if (event.getAction() == MotionEvent.ACTION_DOWN) {
						b.setBackgroundColor(col);
					}
					else if (event.getAction() == MotionEvent.ACTION_UP) {
						b.setBackgroundColor(Color.parseColor("#D5D5D5"));
						b.performClick();
					}
					return true;
				}
			});
	}
	
}
