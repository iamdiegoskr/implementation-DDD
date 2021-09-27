package com.training.sofka.veterinaryAppointments.customer.entity;

import co.com.sofka.domain.generic.Entity;
import com.training.sofka.veterinaryAppointments.customer.value.Age;
import com.training.sofka.veterinaryAppointments.customer.value.AnimalType;
import com.training.sofka.veterinaryAppointments.customer.value.MascotID;
import com.training.sofka.veterinaryAppointments.customer.value.State;

import java.util.Objects;

public class Mascot extends Entity<MascotID> {

    private final AnimalType animalType;
    private  Age age;
    private  State state;

    public Mascot(MascotID mascotID, AnimalType animalType, Age age, State state) {
        super(mascotID);
        this.animalType = animalType;
        this.age = age;
        this.state = state;
    }

    public void updateStatus(State state){
        this.state = Objects.requireNonNull(state);
    }

    public void updateAge(Age age){
        this.age = Objects.requireNonNull(age);
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
