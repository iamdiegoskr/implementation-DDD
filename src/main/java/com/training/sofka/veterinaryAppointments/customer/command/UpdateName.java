package com.training.sofka.veterinaryAppointments.customer.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.shared.value.Name;

public class UpdateName implements Command {

    private final CustomerID customerID;
    private final Name name;


    public UpdateName(CustomerID customerID, Name name) {
        this.customerID = customerID;
        this.name = name;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public Name getName() {
        return name;
    }
}
