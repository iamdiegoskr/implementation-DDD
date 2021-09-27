package com.training.sofka.veterinaryAppointments.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.customer.value.PetID;
import com.training.sofka.veterinaryAppointments.customer.value.State;

public class UpdatedPetStatus extends DomainEvent {

    private final PetID petID;
    private final State state;

    public UpdatedPetStatus(PetID petID, State state) {
        super("training.sofka.entity.pet.updatedpetstatus");
        this.petID = petID;
        this.state = state;
    }

    public PetID petID() {
        return petID;
    }

    public State state() {
        return state;
    }
}
