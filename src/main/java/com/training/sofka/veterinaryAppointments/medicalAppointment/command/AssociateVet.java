package com.training.sofka.veterinaryAppointments.medicalAppointment.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.medicalService.value.VetIdentity;

public class AssociateVet implements Command {

    private final VetIdentity vetIdentity;

    public AssociateVet(VetIdentity vetIdentity) {
        this.vetIdentity = vetIdentity;
    }

    public VetIdentity getVetIdentity() {
        return vetIdentity;
    }
}
