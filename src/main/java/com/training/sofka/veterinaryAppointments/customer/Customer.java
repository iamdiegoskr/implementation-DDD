package com.training.sofka.veterinaryAppointments.customer;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;
import com.training.sofka.veterinaryAppointments.customer.entity.Mascot;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.customer.value.Email;
import com.training.sofka.veterinaryAppointments.customer.value.Name;
import com.training.sofka.veterinaryAppointments.customer.value.Telephone;

import java.util.Set;

public class Customer extends AggregateEvent<CustomerID> {

    protected Name name;
    protected Email email;
    protected Telephone telephone;
    protected Set<Mascot> mascots;

    public Customer(CustomerID customerID, Name name, Email email, Mascot mascot) {
        super(customerID);
    }
}
