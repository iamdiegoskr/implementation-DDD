package com.training.sofka.veterinaryAppointments.medicalAppointment.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.medicalService.value.VetIdentity;

public class LinkedVet extends DomainEvent {

    private final VetIdentity vetIdentity;

    public LinkedVet(VetIdentity vetIdentity) {
        super("training.sofka.medicalappointment.linkedvet");
        this.vetIdentity = vetIdentity;
    }

    public VetIdentity getVetIdentity() {
        return vetIdentity;
    }
}
