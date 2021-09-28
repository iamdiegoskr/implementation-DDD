package com.training.sofka.veterinaryAppointments.medicalService.value;

import co.com.sofka.domain.generic.Identity;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;

public class MedicalServiceIdentity extends Identity {

    public MedicalServiceIdentity(){
    }

    public MedicalServiceIdentity(String id){
        super(id);
    }

    public static MedicalServiceIdentity of(String id){
        return new MedicalServiceIdentity(id);
    }

}
