package com.training.sofka.veterinaryAppointments.medicalAppointment.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.medicalAppointment.entity.Invoice;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.Location;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.Schedule;
import com.training.sofka.veterinaryAppointments.medicalService.value.MedicalServiceIdentity;
import com.training.sofka.veterinaryAppointments.medicalService.value.VetIdentity;

public class MedicalAppointmentCreated extends DomainEvent {

    private final CustomerID customerID;
    private final VetIdentity vetIdentity;
    private final MedicalServiceIdentity medicalServiceIdentity;
    private final Invoice invoice;
    private final Location location;
    private final Schedule schedule;

    public MedicalAppointmentCreated(CustomerID customerID,
                                     VetIdentity vetIdentity,
                                     MedicalServiceIdentity medicalServiceIdentity,
                                     Invoice invoice,
                                     Location location,
                                     Schedule schedule) {
        super("training.sofka.medicalappointment.medicalappointmentcreated");
        this.customerID = customerID;
        this.vetIdentity = vetIdentity;
        this.medicalServiceIdentity = medicalServiceIdentity;
        this.invoice = invoice;
        this.location = location;
        this.schedule = schedule;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public MedicalServiceIdentity getMedicalServiceIdentity() {
        return medicalServiceIdentity;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Location getLocation() {
        return location;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public VetIdentity getVetIdentity() {
        return vetIdentity;
    }
}
