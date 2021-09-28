package com.training.sofka.veterinaryAppointments.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.customer.value.Age;
import com.training.sofka.veterinaryAppointments.customer.value.PetID;

public class UpdatedPetAge extends DomainEvent {

    private final PetID petID;
    private final Age age;

    public UpdatedPetAge(PetID petID, Age age) {
        super("training.sofka.entity.pet.updatedpetage");
        this.petID = petID;
        this.age = age;
    }

    public PetID petID() {
        return petID;
    }

    public Age age() {
        return age;
    }
}
