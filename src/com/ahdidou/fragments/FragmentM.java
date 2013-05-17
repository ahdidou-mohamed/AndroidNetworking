package com.ahdidou.fragments;

import android.os.Bundle;


public class FragmentM extends BaseFragment{

	private String mUrl;

	public FragmentM() {
		// TODO Auto-generated constructor stub
		this.mUrl = "http://www.google.com";
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		this.getRemoteContent(this.mUrl);
	}

	

}
