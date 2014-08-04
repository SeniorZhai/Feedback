package com.zoe.empty;

import android.app.Activity;
import android.os.Bundle;

import com.umeng.fb.FeedbackAgent;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView();
		FeedbackAgent agent = new FeedbackAgent(this);
		agent.startFeedbackActivity();
	}
}
