package com.softices.swipetab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class First extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mov = inflater.inflate(R.layout.first_frag, container, false);
        ((TextView) mov.findViewById(R.id.textView)).setText("First fragment");
        return mov;
    }
}
