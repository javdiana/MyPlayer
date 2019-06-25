package com.di.jav.myplayer;

import android.support.v4.app.Fragment;

public class SongListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return SongListFragment.newInstance();
    }
}
