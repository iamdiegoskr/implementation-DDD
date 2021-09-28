package com.training.sofka.veterinaryAppointments.medicalService.value;

import co.com.sofka.domain.generic.Identity;

public class VetIdentity extends Identity {

    public VetIdentity(){
    }

    public VetIdentity(String id){
        super(id);
    }

    public static VetIdentity of(String id){
        return new VetIdentity(id);
    }

}
