package com.training.sofka.veterinaryAppointments.medicalService.value;

import co.com.sofka.domain.generic.Identity;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;

public class MedicalHistoryIdentity extends Identity {

    public MedicalHistoryIdentity(){
    }

    public MedicalHistoryIdentity(String id){
        super(id);
    }

    public static MedicalHistoryIdentity of(String id){
        return new MedicalHistoryIdentity(id);
    }

}
