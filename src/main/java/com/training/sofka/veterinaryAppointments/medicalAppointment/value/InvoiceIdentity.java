package com.training.sofka.veterinaryAppointments.medicalAppointment.value;

import co.com.sofka.domain.generic.Identity;
import com.training.sofka.veterinaryAppointments.medicalService.value.VetIdentity;

public class InvoiceIdentity extends Identity {

    public InvoiceIdentity(){
    }

    public InvoiceIdentity(String id){
        super(id);
    }

    public static InvoiceIdentity of(String id){
        return new InvoiceIdentity(id);
    }


}
