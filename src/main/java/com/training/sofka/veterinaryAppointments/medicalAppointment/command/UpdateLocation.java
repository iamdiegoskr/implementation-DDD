package com.training.sofka.veterinaryAppointments.medicalAppointment.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.Location;

public class UpdateLocation implements Command {

    private final Location location;

    public UpdateLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
