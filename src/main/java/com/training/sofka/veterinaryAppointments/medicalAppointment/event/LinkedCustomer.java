package com.training.sofka.veterinaryAppointments.medicalAppointment.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;

public class LinkedCustomer extends DomainEvent {

    private final CustomerID customerID;


    public LinkedCustomer(CustomerID customerID) {
        super("training.sofka.medicalappointment.linkedcustomer");
        this.customerID = customerID;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }
}
