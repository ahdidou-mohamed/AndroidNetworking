package com.ahdidou.fragments;

import android.support.v4.app.Fragment;

import com.ahdidou.callbacks.NetworkCallBack;
import com.ahdidou.ws.WSTask;

public class BaseFragment extends Fragment implements NetworkCallBack{


	 
	/**
	 * Init UI Elements
	 */
	public void init() {

	}

	/**s
	 * init network Request
	 * @param url
	 */
	public void getRemoteContent(String url) {
		
		WSTask wSTask = new WSTask(this, url);
		wSTask.start();
        
	}

	/**
	 * Update view after network stuff
	 */
	public void updateView() {

	}
	
	/**
	 * Display Loading view while network stuff
	 */
	public void displayLoadingView() {

		
	}
	/**
	 * Display Error view after network Error
	 */
	public void displayErrorView() {

	}
	
	
	//Network Callbacks
	
	@Override
	public void networkStarted() {

		this.displayLoadingView();
	}

	

	@Override
	public void networkSuccess() {

		this.updateView();
	}

	@Override
	public void networkError() {

		this.displayErrorView();
	}
}
