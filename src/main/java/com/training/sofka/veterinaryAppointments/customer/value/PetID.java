package com.training.sofka.veterinaryAppointments.customer.value;

import co.com.sofka.domain.generic.Identity;

public class PetID extends Identity {

    public PetID(){
    }

    public PetID(String id){
        super(id);
    }

    public static PetID of(String id){
        return new PetID(id);
    }

}
