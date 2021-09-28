package com.training.sofka.veterinaryAppointments.customer.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.shared.value.Email;

public class UpdateEmail implements Command {

    private final CustomerID customerID;
    private final Email email;

    public UpdateEmail(CustomerID customerID, Email email) {
        this.customerID = customerID;
        this.email = email;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public Email getEmail() {
        return email;
    }
}
