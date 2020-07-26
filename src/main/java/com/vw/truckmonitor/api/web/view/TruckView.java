package com.vw.truckmonitor.api.web.view;

public class TruckView {

    private long id;
    private String licensePlate;

    public TruckView(long id, String licensePlate) {
        this.id = id;
        this.licensePlate = licensePlate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
