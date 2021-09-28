package com.training.sofka.veterinaryAppointments.customer.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.shared.value.Address;
import com.training.sofka.veterinaryAppointments.shared.value.Email;
import com.training.sofka.veterinaryAppointments.shared.value.Name;
import com.training.sofka.veterinaryAppointments.shared.value.Telephone;

public class CreateCustomer implements Command {

    private final CustomerID customerID;
    private final Name name;
    private final Email email;
    private final Telephone telephone;
    private final Address address;


    public CreateCustomer(CustomerID customerID, Name name, Email email, Telephone telephone, Address address) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }


    public CustomerID getCustomerID() {
        return customerID;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Address getAddress() {
        return address;
    }
}
