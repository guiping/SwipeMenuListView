package com.baoyz.swipemenulistviewsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *
 * @author 韩加虎
 * @date 2015-1-20
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
	
	public void onClick(View v){
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(this, SimpleActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, DifferentMenuActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this, SimplePullToRefreshActivity.class));
                break;
        }
    }
}
