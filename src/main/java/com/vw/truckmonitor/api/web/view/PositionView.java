package com.vw.truckmonitor.api.web.view;

import java.util.Date;

public class PositionView {

    private double latitude;

    private double longitude;

    private Date created;

    public PositionView(double latitude, double longitude, Date created) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.created = created;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}
