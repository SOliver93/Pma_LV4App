package com.example.soliver.lv4app.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

public class SummaryFragment extends Fragment {
    public static SummaryFragment newInstance() {

        Bundle args = new Bundle();

        SummaryFragment fragment = new SummaryFragment();
        fragment.setArguments(args);
        return fragment;
    }
    TextView tvName;
    TextView tvSubject;

    @NonNull
    @Override
    public View onCreateView()
        View view=infater.inflate()
        tvName = view.findViewById(R.id.tvName)

}
