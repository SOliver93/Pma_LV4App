package com.example.soliver.lv4app.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Person;

import com.example.soliver.lv4app.fragments.PersonalInfoFragment;
import com.example.soliver.lv4app.fragments.StudentInfoFragment;
import com.example.soliver.lv4app.fragments.SummaryFragment;

import java.util.List;

/**
 * Lista treba sadržavati brojeve od 1 do 3.
 * 1 je PersonalInfoFragment
 * 2 je StudentInfoFragment
 * 3 je SummaryFragment
 */

public class RecordFragmentAdapter extends FragmentPagerAdapter {
    List<Integer> dataList;
    public RecordFragmentAdapter(FragmentManager fm, List<Integer> dataList) {
        super(fm);
        this.dataList=dataList;
    }

    @Override
    public Fragment getItem(int position) {
        int dataType=dataList.get(position);

        if(dataType == 1){
            return PersonalInfoFragment.newInstance();
        }
        else if(dataType ==2){
            return StudentInfoFragment.newInstance();
        }
        else if(dataType ==3){
            return SummaryFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }
}
