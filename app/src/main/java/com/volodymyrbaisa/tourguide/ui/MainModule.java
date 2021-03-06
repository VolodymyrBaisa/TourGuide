package com.volodymyrbaisa.tourguide.ui;

import com.volodymyrbaisa.tourguide.di.ActivityScoped;
import com.volodymyrbaisa.tourguide.di.FragmentScoped;
import com.volodymyrbaisa.tourguide.ui.fragments.DiningFragment;
import com.volodymyrbaisa.tourguide.ui.fragments.EventsFragment;
import com.volodymyrbaisa.tourguide.ui.fragments.PlacesToStayFragment;
import com.volodymyrbaisa.tourguide.ui.fragments.ThingsToDoFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Bios on 2/17/2018.
 */

@Module
public abstract class MainModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract ThingsToDoFragment thingsToDoFragment();

    @FragmentScoped
    @ContributesAndroidInjector
    abstract PlacesToStayFragment placesToStayFragment();

    @FragmentScoped
    @ContributesAndroidInjector
    abstract DiningFragment diningFragment();

    @FragmentScoped
    @ContributesAndroidInjector
    abstract EventsFragment eventsFragment();

    @ActivityScoped
    @Binds
    abstract MainContract.Presenter fragmentPresenter(MainPresenter presenter);
}
