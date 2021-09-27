package com.training.sofka.veterinaryAppointments.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.customer.value.Email;
import com.training.sofka.veterinaryAppointments.customer.value.Name;
import com.training.sofka.veterinaryAppointments.customer.value.Telephone;


public class AddedCustomer extends DomainEvent {

    private final Name name;
    private final Email email;
    private final Telephone telephone;


    public AddedCustomer(Name name, Email email, Telephone telephone) {
        super("training.sofka.customer.addedcustomer");
        this.name = name;
        this.email = email;
        this.telephone = telephone;
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
}
