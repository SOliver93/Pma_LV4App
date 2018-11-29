package com.example.soliver.lv4app.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PersonalInfoFragment extends Fragment {
    public static PersonalInfoFragment newInstance() {

        Bundle args = new Bundle();
        PersonalInfoFragment fragment = new PersonalInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreate(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstance);



}
