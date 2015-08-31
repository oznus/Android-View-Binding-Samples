package com.oznusem.viewbindingssample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.oznusem.viewbindingssample.Models.User;
import com.oznusem.viewbindingssample.databinding.ActivityEventsBinding;

import static android.widget.Toast.LENGTH_SHORT;

public class EventsBindingActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ActivityEventsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_events);

		User user = new User("Test", "User");
		binding.setUser(user);
		binding.setHandlers(new EventsBindingActivityOnClicks(this));
	}

	public static class EventsBindingActivityOnClicks {

		private Context mContext;

		public EventsBindingActivityOnClicks(Context context) {
			mContext = context;
		}

		public void onClickFriend(View view) {
			Toast.makeText(mContext, "On Friend Click", LENGTH_SHORT).show();
		}

		public void onClickEnemy(View view) {
			Toast.makeText(mContext, "On Enemy Click", LENGTH_SHORT).show();
		}
	}
}
