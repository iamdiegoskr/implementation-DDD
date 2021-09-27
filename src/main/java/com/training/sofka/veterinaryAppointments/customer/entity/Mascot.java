package com.training.sofka.veterinaryAppointments.customer.entity;

import co.com.sofka.domain.generic.Entity;
import com.training.sofka.veterinaryAppointments.customer.value.MascotID;

public class Mascot extends Entity<MascotID> {

    public Mascot(MascotID mascotID) {
        super(mascotID);
    }
}
