package com.volodymyrbaisa.tourguide.ui;

import com.volodymyrbaisa.tourguide.base.BasePresenter;
import com.volodymyrbaisa.tourguide.base.BaseView;

/**
 * Created by Bios on 2/17/2018.
 */

public class MainContract {
    interface MenuToDoView extends BaseView<Presenter> {

    }

    interface ThingsToDoView extends BaseView<Presenter> {

    }

    interface DiningView extends BaseView<Presenter> {

    }

    interface PlacesToStayView extends BaseView<Presenter> {

    }

    interface EventsView extends BaseView<Presenter> {

    }

    interface View extends MenuToDoView, ThingsToDoView, DiningView, PlacesToStayView, EventsView{}

    interface Presenter extends BasePresenter<View> {}
}
