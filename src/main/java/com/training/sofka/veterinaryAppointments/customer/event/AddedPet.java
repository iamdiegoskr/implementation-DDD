package com.training.sofka.veterinaryAppointments.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.customer.value.Age;
import com.training.sofka.veterinaryAppointments.customer.value.AnimalType;
import com.training.sofka.veterinaryAppointments.customer.value.PetID;
import com.training.sofka.veterinaryAppointments.customer.value.State;


public class AddedPet extends DomainEvent {

    private final PetID petID;
    private final AnimalType animalType;
    private final Age age;
    private final State state;

    public AddedPet(PetID petID, AnimalType animalType, Age age, State state) {
        super("training.sofka.entity.pet.addedpet");
        this.petID = petID;
        this.animalType = animalType;
        this.age = age;
        this.state = state;
    }

    public PetID petID() {
        return petID;
    }

    public AnimalType animalType() {
        return animalType;
    }

    public Age age() {
        return age;
    }

    public State state() {
        return state;
    }
}
