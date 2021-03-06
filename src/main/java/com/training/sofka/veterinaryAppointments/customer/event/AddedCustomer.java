package com.training.sofka.veterinaryAppointments.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.shared.value.Address;
import com.training.sofka.veterinaryAppointments.shared.value.Email;
import com.training.sofka.veterinaryAppointments.shared.value.Name;
import com.training.sofka.veterinaryAppointments.shared.value.Telephone;


public class AddedCustomer extends DomainEvent {

    private final Name name;
    private final Email email;
    private final Telephone telephone;
    private final Address address;


    public AddedCustomer(Name name, Email email, Telephone telephone, Address address) {
        super("training.sofka.customer.addedcustomer");
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
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
