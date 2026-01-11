package com.northtech.common.events;

import com.northtech.common.dto.ParcelDto;

public class ParcelCreatedEvent {
    private ParcelDto parcel;

    public ParcelCreatedEvent() {}

    public ParcelCreatedEvent(ParcelDto parcel) {
        this.parcel = parcel;
    }

    public ParcelDto getParcel() { return parcel; }
    public void setParcel(ParcelDto parcel) { this.parcel = parcel; }
}
