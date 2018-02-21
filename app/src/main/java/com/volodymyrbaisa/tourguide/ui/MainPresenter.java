package com.volodymyrbaisa.tourguide.ui;

import android.util.Log;

import com.google.gson.Gson;
import com.volodymyrbaisa.tourguide.BuildConfig;
import com.volodymyrbaisa.tourguide.data.Dining;
import com.volodymyrbaisa.tourguide.data.Event;
import com.volodymyrbaisa.tourguide.data.Items;
import com.volodymyrbaisa.tourguide.data.PlacesToStay;
import com.volodymyrbaisa.tourguide.data.ThingsToDo;
import com.volodymyrbaisa.tourguide.di.ActivityScoped;
import com.volodymyrbaisa.tourguide.util.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Bios on 2/17/2018.
 */

@ActivityScoped
public class MainPresenter implements MainContract.Presenter {
    private MainContract.View mView;

    @Inject
    public MainPresenter() {
    }

    @Override
    public void takeView(MainContract.View view) {
        mView = view;
    }

    @Override
    public void dropView() {
        mView = null;
    }

    @Override
    public List<Dining> getItemsDining() {
        try {
            return fetchingData(mView.getAssetsFile()).getDinings();
        } catch (Exception e) {
            mView.errorMessage("Unable to load " + BuildConfig.DATA_FILE);
        }
        return new ArrayList<>();
    }

    @Override
    public List<Event> getItemsEvents() {
        try {
            return fetchingData(mView.getAssetsFile()).getEvents();
        } catch (Exception e) {
            mView.errorMessage("Unable to load " + BuildConfig.DATA_FILE);
        }
        return new ArrayList<>();
    }

    @Override
    public List<PlacesToStay> getItemsPlacesToStay() {
        try {
            return fetchingData(mView.getAssetsFile()).getPlacesToStays();
        } catch (Exception e) {
            mView.errorMessage("Unable to load " + BuildConfig.DATA_FILE);
        }
        return new ArrayList<>();
    }

    @Override
    public List<ThingsToDo> getItemsThingsToDo() {
        try {
            return fetchingData(mView.getAssetsFile()).getThingsToDos();
        } catch (Exception e) {
            Log.e(MainPresenter.class.getName(), e.getMessage());
            mView.errorMessage("Unable to load " + BuildConfig.DATA_FILE);
        }
        return new ArrayList<>();
    }

    private Items fetchingData(InputStream is) throws IOException {
        return new Gson().fromJson(IOUtils.toString(is), Items.class);
    }
}
