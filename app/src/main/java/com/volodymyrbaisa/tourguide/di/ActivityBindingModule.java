package com.volodymyrbaisa.tourguide.di;

import com.volodymyrbaisa.tourguide.ui.MainActivity;
import com.volodymyrbaisa.tourguide.ui.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Bios on 2/17/2018.
 */

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();
}
