package com.oznusem.viewbindingssample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.oznusem.viewbindingssample.Models.User;
import com.oznusem.viewbindingssample.databinding.ActivitySimpleModelBinding;

public class SimpleModelBindingActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		ActivitySimpleModelBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_model);

		User user = new User("Test", "User");
		binding.setUser(user);
	}




}
