package com.volodymyrbaisa.tourguide.ui;

import com.volodymyrbaisa.tourguide.base.BasePresenter;
import com.volodymyrbaisa.tourguide.base.BaseView;
import com.volodymyrbaisa.tourguide.data.Dining;
import com.volodymyrbaisa.tourguide.data.Event;
import com.volodymyrbaisa.tourguide.data.PlacesToStay;
import com.volodymyrbaisa.tourguide.data.ThingsToDo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Bios on 2/17/2018.
 */

public class MainContract {
    public interface View extends BaseView<Presenter> {
        InputStream getAssetsFile() throws IOException;
    }

   public interface Presenter extends BasePresenter<View> {
        List<Dining> getItemsDining();

        List<Event> getItemsEvents();

        List<PlacesToStay> getItemsPlacesToStay();

        List<ThingsToDo> getItemsThingsToDo();
    }
}
