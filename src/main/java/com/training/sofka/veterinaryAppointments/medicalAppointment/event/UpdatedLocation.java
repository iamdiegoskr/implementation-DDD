package com.training.sofka.veterinaryAppointments.medicalAppointment.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.Location;

public class UpdatedLocation extends DomainEvent {

    private final Location location;

    public UpdatedLocation(Location location) {
        super("training.sofka.medicalappointment.updatedlocation");
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
