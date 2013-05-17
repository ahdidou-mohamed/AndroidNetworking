package com.ahdidou.fragments;

import com.ahdidou.tabproject.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends FragmentM {

	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragmenta, container, false);
		
		return view;
	}
	

	@Override
	public void init() {

		super.init();
	}
	
	@Override
	public void updateView() {

		super.updateView();
	}
	
	@Override
	public void displayErrorView() {

		super.displayErrorView();
	}
	
	
	@Override
	public void displayLoadingView() {
		
		super.displayLoadingView();
	}
	

}
