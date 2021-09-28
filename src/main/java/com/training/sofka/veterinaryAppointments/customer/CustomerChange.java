package com.training.sofka.veterinaryAppointments.customer;

import co.com.sofka.domain.generic.EventChange;
import com.training.sofka.veterinaryAppointments.customer.event.AddedCustomer;

public class CustomerChange extends EventChange {

    public CustomerChange(Customer customer){
        //Aqui aplicamos cada evento de dominio.

        apply((AddedCustomer event)->{
            customer.name = event.getName();
            customer.email = event.getEmail();
            customer.telephone = event.getTelephone();
            customer.address = event.getAddress();
        });

    }

}
