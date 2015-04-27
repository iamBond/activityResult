package com.example.activiyresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Administrator
 *
 */
public class MainActivity extends Activity {

	private Button mButton = null;
	private TextView mTextView = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent mInten = new Intent(MainActivity.this,Second.class);
				startActivityForResult(mInten, 100);
			}
		});
		
	}

	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		/*if (resultCode == 10) {
			System.out.println(data.getExtras().getString("bookname"));
			String bookName = data.getExtras().getString("bookname");
			String bookPrice = data.getExtras().getString("bookprice");
			mTextView.setText("书籍的名字是"+bookName+"，书籍的价格是"+bookPrice+"元");*/
		System.out.println(resultCode);
		System.out.println(requestCode);
		
		if (resultCode == 10) {
			mTextView.setText(data.getExtras().getString("bookname"));
		}
		
		
	}



	/**
	 * 
	 */
	protected void initView()
	{
		mButton = (Button)findViewById(R.id.button);
		mTextView = (TextView)findViewById(R.id.text_view);
	}
	

}
