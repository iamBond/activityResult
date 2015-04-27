package com.example.activiyresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Second extends Activity {
	
	private EditText mEditTextName = null;
	private EditText mEditTextPrice = null;
	private Button mButton = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		mEditTextName = (EditText)findViewById(R.id.editTextId_name);
		mEditTextPrice = (EditText)findViewById(R.id.editTextId_price);
		
		mButton = (Button)findViewById(R.id.b_commit);
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str_BookName = mEditTextName.getText().toString();
				String str_BookPrice = mEditTextPrice.getText().toString();
				Intent data = new Intent(Second.this,MainActivity.class);
				data.putExtra("bookname", str_BookName);
				data.putExtra("bookprice", str_BookPrice);
				setResult(10, data);
				finish();
			}
		});
	}

}
