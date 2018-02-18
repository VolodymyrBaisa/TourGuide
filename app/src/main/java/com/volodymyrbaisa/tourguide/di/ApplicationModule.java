package com.volodymyrbaisa.tourguide.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;

/**
 * Created by Bios on 2/17/2018.
 */

public abstract class ApplicationModule {
    @Binds
    abstract Context bindContext(Application application);
}
