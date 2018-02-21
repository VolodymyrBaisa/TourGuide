package com.volodymyrbaisa.tourguide.base;

import android.support.design.widget.Snackbar;
import android.view.View;

import dagger.android.support.DaggerFragment;

/**
 * Created by Bios on 2/19/2018.
 */

public abstract class BaseFragment extends DaggerFragment {
    public void errorMessage(View view, CharSequence msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show();
    }
}
