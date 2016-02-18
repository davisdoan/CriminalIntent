package com.bignerdranch.android.criminalintent;


import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

public class CrimeListActivity extends SingleFragmentActivity {

    private RecyclerView mCrimeRecycleView;

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
