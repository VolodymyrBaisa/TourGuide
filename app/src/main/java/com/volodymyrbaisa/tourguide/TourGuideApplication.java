package com.volodymyrbaisa.tourguide;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by Bios on 2/17/2018.
 */

public class TourGuideApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return null;// DaggerAppComponent.builder().application(this).build();
    }
}
