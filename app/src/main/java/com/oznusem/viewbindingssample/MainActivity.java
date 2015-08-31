package com.oznusem.viewbindingssample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.simpleModelBinding).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
			case R.id.simpleModelBinding:
				startActivity(new Intent(this,SimpleModelBindingActivity.class));
				break;
		}
	}
}
