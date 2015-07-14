package com.softices.swipetab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Third extends Fragment {
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
		    View vid = inflater.inflate(R.layout.third_frag, container, false);
	        ((TextView)vid.findViewById(R.id.textView)).setText("Third fragment");
	        return vid;
}}
