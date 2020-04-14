package com.example.busolympic.SportEvent;

import android.os.Parcel;
import android.os.Parcelable;

public  class SportsDetail implements Parcelable {
    private int image;
    private String sportName;
    private String eventType;
    private String athleteGender;
    private String eventVenue;
    private String eventDate;
    private String eventStartTime;
    private String eventDuration;
    private String eventBusTravelTime;

    public SportsDetail(int image, String sportName, String eventType, String athleteGender, String eventVenue, String eventDate, String eventStartTime, String eventDuration, String eventBusTravelTime) {
        this.image = image;
        this.sportName = sportName;
        this.eventType = eventType;
        this.athleteGender = athleteGender;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventStartTime = eventStartTime;
        this.eventDuration = eventDuration;
        this.eventBusTravelTime = eventBusTravelTime;
    }

    public SportsDetail() {}

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getAthleteGender() {
        return athleteGender;
    }

    public void setAthleteGender(String athleteGender) {
        this.athleteGender = athleteGender;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventStartTime() { return eventStartTime; }

    public void setEventStartTime(String eventStartTime) { this.eventStartTime = eventStartTime; }

    public String getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(String eventDuration) {
        this.eventDuration = eventDuration;
    }

    public String getEventBusTravelTime() {
        return eventBusTravelTime;
    }

    public void setEventBusTravelTime(String eventBusTravelTime) {
        this.eventBusTravelTime = eventBusTravelTime;
    }

    protected SportsDetail(Parcel in) {
        image = in.readInt();
        sportName = in.readString();
        eventType = in.readString();
        athleteGender = in.readString();
        eventVenue = in.readString();
        eventDate = in.readString();
        eventStartTime = in.readString();
        eventDuration = in.readString();
        eventBusTravelTime = in.readString();
    }

    public static final Creator<SportsDetail> CREATOR = new Creator<SportsDetail>() {
        @Override
        public SportsDetail createFromParcel(Parcel in) {
            return new SportsDetail(in);
        }

        @Override
        public SportsDetail[] newArray(int size) {
            return new SportsDetail[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(sportName);
        dest.writeString(eventType);
        dest.writeString(athleteGender);
        dest.writeString(eventVenue);
        dest.writeString(eventDate);
        dest.writeString(eventStartTime);
        dest.writeString(eventDuration);
        dest.writeString(eventBusTravelTime);
    }
}
