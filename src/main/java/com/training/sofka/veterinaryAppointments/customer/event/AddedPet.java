package com.training.sofka.veterinaryAppointments.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.customer.value.Age;
import com.training.sofka.veterinaryAppointments.customer.value.PetType;
import com.training.sofka.veterinaryAppointments.customer.value.PetID;
import com.training.sofka.veterinaryAppointments.customer.value.State;


public class AddedPet extends DomainEvent {

    private final PetID petID;
    private final PetType petType;
    private final Age age;
    private final State state;

    public AddedPet(PetID petID, PetType petType, Age age, State state) {
        super("training.sofka.entity.pet.addedpet");
        this.petID = petID;
        this.petType = petType;
        this.age = age;
        this.state = state;
    }

    public PetID petID() {
        return petID;
    }

    public PetType animalType() {
        return petType;
    }

    public Age age() {
        return age;
    }

    public State state() {
        return state;
    }
}
