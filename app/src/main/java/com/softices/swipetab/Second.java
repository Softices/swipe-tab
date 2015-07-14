package com.softices.swipetab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Second extends Fragment {
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
	        View mus = inflater.inflate(R.layout.second_frag, container, false);
	        ((TextView)mus.findViewById(R.id.textView)).setText("Second fragment");
	        return mus;
}}
