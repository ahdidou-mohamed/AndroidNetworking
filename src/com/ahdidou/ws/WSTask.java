package com.ahdidou.ws;

import com.ahdidou.callbacks.NetworkCallBack;
import com.ahdidou.fragments.BaseFragment;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

public class WSTask extends AsyncHttpResponseHandler{
	
	private NetworkCallBack mNetworkCallBack;
	AsyncHttpClient client = new AsyncHttpClient();
	private String mURL;
	
	public WSTask(NetworkCallBack networkCallBack, String url) {

		this.mNetworkCallBack = networkCallBack;
		this.mURL = url;
	}
	
	public void start() {
		client.get(this.mURL, this);
	}
	
	
	@Override
	public void onStart() {

		this.mNetworkCallBack.networkStarted();
		super.onStart();
	}
	
	@Override
	public void onFailure(Throwable error, String content) {

		this.mNetworkCallBack.networkError();
		super.onFailure(error, content);
	}
	
	@Override
	public void onSuccess(int statusCode, String content) {
		super.onSuccess(statusCode, content);
	}

	
	@Override
	public void onFinish() {

		this.mNetworkCallBack.networkSuccess();
		super.onFinish();
	}
}
