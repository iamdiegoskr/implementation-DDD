package com.training.sofka.veterinaryAppointments.customer.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.customer.value.PetID;
import com.training.sofka.veterinaryAppointments.customer.value.State;

public class UpdateStatusPet implements Command {

    private final CustomerID customerID;
    private final PetID petID;
    private final State state;

    public UpdateStatusPet(CustomerID customerID, PetID petID, State state) {
        this.customerID = customerID;
        this.petID = petID;
        this.state = state;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public PetID getPetID() {
        return petID;
    }

    public State getState() {
        return state;
    }
}
