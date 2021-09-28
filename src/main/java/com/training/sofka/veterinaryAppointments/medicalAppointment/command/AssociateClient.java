package com.training.sofka.veterinaryAppointments.medicalAppointment.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;

public class AssociateClient implements Command {

    private final CustomerID customerID;

    public AssociateClient(CustomerID customerID) {
        this.customerID = customerID;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }
}
