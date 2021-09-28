package com.training.sofka.veterinaryAppointments.customer.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.customer.value.*;

public class AddNewPet implements Command {

    private final CustomerID customerID;
    private final PetID petID;
    private final PetType petType;
    private final Age age;
    private final State state;

    public AddNewPet(CustomerID customerID, PetID petID, PetType petType, Age age, State state) {
        this.customerID = customerID;
        this.petID = petID;
        this.petType = petType;
        this.age = age;
        this.state = state;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public PetID getPetID() {
        return petID;
    }

    public PetType getAnimalType() {
        return petType;
    }

    public Age getAge() {
        return age;
    }

    public State getState() {
        return state;
    }
}
