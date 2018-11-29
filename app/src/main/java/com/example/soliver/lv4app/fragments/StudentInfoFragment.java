package com.example.soliver.lv4app.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class StudentInfoFragment extends Fragment {
    public static StudentInfoFragment newInstance() {

        Bundle args = new Bundle();

        StudentInfoFragment fragment = new StudentInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
