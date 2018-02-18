package com.volodymyrbaisa.tourguide.di;

import com.volodymyrbaisa.tourguide.TourGuideApplication;
import com.volodymyrbaisa.tourguide.ui.MainActivity;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;

/**
 * Created by Bios on 2/17/2018.
 */

@Singleton
@Component(modules = {MainActivity.class})
public interface AppComponent extends AndroidInjector<TourGuideApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(TourGuideApplication tourGuideApplication);

        AppComponent build();
    }
}
