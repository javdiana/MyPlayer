package com.di.jav.myplayer;

import android.support.v4.app.Fragment;

public class SongActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return SongFragment.newInstance(); // TODO: 6/25/2019  
    }
}
