package com.training.sofka.veterinaryAppointments.customer.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.customer.value.Age;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.customer.value.PetID;

public class UpdateAgePet implements Command {

    private final CustomerID customerID;
    private final PetID petID;
    private final Age age;

    public UpdateAgePet(CustomerID customerID, PetID petID, Age age) {
        this.customerID = customerID;
        this.petID = petID;
        this.age = age;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public PetID getPetID() {
        return petID;
    }

    public Age getAge() {
        return age;
    }
}
