package com.volodymyrbaisa.tourguide.base;

/**
 * Created by Bios on 2/17/2018.
 */

public interface BasePresenter<T> {
    void takeView(T view);

    void dropView();
}
