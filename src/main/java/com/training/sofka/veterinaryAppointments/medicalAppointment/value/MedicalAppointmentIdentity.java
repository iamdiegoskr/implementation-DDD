package com.training.sofka.veterinaryAppointments.medicalAppointment.value;

import co.com.sofka.domain.generic.Identity;

public class MedicalAppointmentIdentity extends Identity {

    public MedicalAppointmentIdentity(){
    }

    public MedicalAppointmentIdentity(String id){
        super(id);
    }

    public static MedicalAppointmentIdentity of(String id){
        return new MedicalAppointmentIdentity(id);
    }

}
