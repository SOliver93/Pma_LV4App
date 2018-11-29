package com.example.soliver.lv4app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.soliver.lv4app.adapter.RecordFragmentAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CreateNewRecordActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_record);
        viewPager = findViewById(R.id.viewPager);

        List<Integer> fragmentDataList = new ArrayList<>();
        fragmentDataList.add(1);
        fragmentDataList.add(2);
        fragmentDataList.add(3);
        Collections.sort(fragmentDataList);
        RecordFragmentAdapter adapter = new RecordFragmentAdapter();
        viewPager.setAdapter(adapter);
    }
}
