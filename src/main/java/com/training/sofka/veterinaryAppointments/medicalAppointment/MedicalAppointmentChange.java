package com.training.sofka.veterinaryAppointments.medicalAppointment;

import co.com.sofka.domain.generic.EventChange;
import com.training.sofka.veterinaryAppointments.medicalAppointment.event.*;

public class MedicalAppointmentChange extends EventChange {

    public MedicalAppointmentChange(MedicalAppointment medicalAppointment){

        apply((MedicalAppointmentCreated event)->{
            medicalAppointment.customerID = event.getCustomerID();
            medicalAppointment.medicalServiceIdentity = event.getMedicalServiceIdentity();
            medicalAppointment.invoice = event.getInvoice();
            medicalAppointment.location = event.getLocation();
            medicalAppointment.schedule = event.getSchedule();
        });

        apply((UpdatedMedicalAppointmentSchedule event)->{
            medicalAppointment.schedule = event.getSchedule();
        });

        apply((LinkedCustomer event)->{
            medicalAppointment.customerID = event.getCustomerID();
        });

        apply((LinkedVet event)->{
            medicalAppointment.vetIdentity = event.getVetIdentity();
        });

        apply((UpdatedLocation event)->{
            medicalAppointment.location = event.getLocation();
        });

    }

}
