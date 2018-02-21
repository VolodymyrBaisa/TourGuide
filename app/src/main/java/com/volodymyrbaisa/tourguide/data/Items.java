package com.volodymyrbaisa.tourguide.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Bios on 2/19/2018.
 */

public class Items {
    @SerializedName("Things to do")
    private List<ThingsToDo> thingsToDos;
    @SerializedName("Dining")
    private List<Dining> dinings;
    @SerializedName("Places to stay")
    private List<PlacesToStay> placesToStays;
    @SerializedName("Events")
    private List<Event> events;

    public Items(List<ThingsToDo> thingsToDo, List<Dining> dining, List<PlacesToStay> placesToStay, List<Event> events) {
        this.thingsToDos = thingsToDo;
        this.dinings = dining;
        this.placesToStays = placesToStay;
        this.events = events;
    }

    public List<ThingsToDo> getThingsToDos() {
        return thingsToDos;
    }

    public List<Dining> getDinings() {
        return dinings;
    }

    public List<PlacesToStay> getPlacesToStays() {
        return placesToStays;
    }

    public List<Event> getEvents() {
        return events;
    }
}
