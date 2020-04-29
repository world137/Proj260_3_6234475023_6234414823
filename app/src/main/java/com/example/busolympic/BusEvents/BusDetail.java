package com.example.busolympic.BusEvents;

import android.os.Parcel;
import android.os.Parcelable;

public class BusDetail implements Parcelable {

    private String busType;
    private String eventDestination;
    private String busDeparture;
    private String busTravelTime;
    private String seatRows;
    private String seatColumns;
    private String costPerSeat;



    public BusDetail(String busType, String eventDestination, String busDeparture, String busTravelTime, String seatRows, String seatColumns, String costPerSeat) {
        this.busType = busType;
        this.eventDestination = eventDestination;
        this.busDeparture = busDeparture;
        this.busTravelTime = busTravelTime;
        this.seatRows = seatRows;
        this.seatColumns = seatColumns;
        this.costPerSeat = costPerSeat;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getEventDestination() {
        return eventDestination;
    }

    public void setEventDestination(String eventDestination) {
        this.eventDestination = eventDestination;
    }

    public String getBusDeparture() {
        return busDeparture;
    }

    public void setBusDeparture(String busDeparture) {
        this.busDeparture = busDeparture;
    }

    public String getBusTravelTime() {
        return busTravelTime;
    }

    public void setBusTravelTime(String busTravelTime) {
        this.busTravelTime = busTravelTime;
    }

    public String getSeatRows() {
        return seatRows;
    }

    public void setSeatRows(String seatRows) {
        this.seatRows = seatRows;
    }

    public String getSeatColumns() {
        return seatColumns;
    }

    public void setSeatColumns(String seatColumns) {
        this.seatColumns = seatColumns;
    }

    public String getCostPerSeat() {
        return costPerSeat;
    }

    public void setCostPerSeat(String costPerSeat) {
        this.costPerSeat = costPerSeat;
    }

    public static Creator<BusDetail> getCREATOR() {
        return CREATOR;
    }

    protected BusDetail(Parcel in) {
        busType = in.readString();
        eventDestination = in.readString();
        busDeparture = in.readString();
        busTravelTime = in.readString();
        seatRows = in.readString();
        seatColumns = in.readString();
        costPerSeat = in.readString();
    }

    public static final Creator<BusDetail> CREATOR = new Creator<BusDetail>() {
        @Override
        public BusDetail createFromParcel(Parcel in) {
            return new BusDetail(in);
        }

        @Override
        public BusDetail[] newArray(int size) {
            return new BusDetail[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(busType);
        dest.writeString(eventDestination);
        dest.writeString(busDeparture);
        dest.writeString(busTravelTime);
        dest.writeString(seatRows);
        dest.writeString(seatColumns);
        dest.writeString(costPerSeat);
    }
}
