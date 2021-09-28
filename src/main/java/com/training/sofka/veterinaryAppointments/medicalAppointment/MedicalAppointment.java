package com.training.sofka.veterinaryAppointments.medicalAppointment;

import co.com.sofka.domain.generic.AggregateEvent;
import com.training.sofka.veterinaryAppointments.customer.Customer;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.MedicalAppointmentIdentity;

public class MedicalAppointment extends AggregateEvent<MedicalAppointmentIdentity> {

    protected CustomerID customerID;


    public MedicalAppointment(MedicalAppointmentIdentity entityId) {
        super(entityId);
    }
}
