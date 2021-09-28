package com.training.sofka.veterinaryAppointments.medicalAppointment;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.medicalAppointment.entity.Invoice;
import com.training.sofka.veterinaryAppointments.medicalAppointment.event.*;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.Location;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.MedicalAppointmentIdentity;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.Schedule;
import com.training.sofka.veterinaryAppointments.medicalService.value.MedicalServiceIdentity;
import com.training.sofka.veterinaryAppointments.medicalService.value.VetIdentity;

import java.util.List;
import java.util.Objects;

public class MedicalAppointment extends AggregateEvent<MedicalAppointmentIdentity> {

    protected CustomerID customerID;
    protected VetIdentity vetIdentity;
    protected MedicalServiceIdentity medicalServiceIdentity;
    protected Invoice invoice;
    protected Location location;
    protected Schedule schedule;


    public MedicalAppointment(MedicalAppointmentIdentity entityId, CustomerID customerID,
                              VetIdentity vetIdentity,
                              MedicalServiceIdentity medicalServiceIdentity, Invoice invoice,
                              Location location, Schedule schedule) {
        super(entityId);
        appendChange(new MedicalAppointmentCreated(customerID,vetIdentity,medicalServiceIdentity,invoice,location,schedule))
                .apply();
    }

    private MedicalAppointment(MedicalAppointmentIdentity medicalAppointmentIdentity){
        super(medicalAppointmentIdentity);
        subscribe(new MedicalAppointmentChange(this));
    }

    public static MedicalAppointment from(MedicalAppointmentIdentity medicalAppointmentIdentity,
                                          List<DomainEvent> events){
        var medicalAppointment = new MedicalAppointment(medicalAppointmentIdentity);
        events.forEach(medicalAppointment::applyEvent);
        return medicalAppointment;
    }

    public void updateScheduleMedicalAppointment(Schedule schedule){
        Objects.requireNonNull(schedule);
        appendChange(new UpdatedMedicalAppointmentSchedule(schedule)).apply();
    }

    public void AssociateClient(CustomerID customerID){
        Objects.requireNonNull(customerID);
        appendChange(new LinkedCustomer(customerID)).apply();
    }

    public void AssociateVet(VetIdentity vetIdentity){
        Objects.requireNonNull(vetIdentity);
        appendChange(new LinkedVet(vetIdentity)).apply();
    }

    public void updateLocation(Location location){
        Objects.requireNonNull(location);
        appendChange(new UpdatedLocation(location));
    }


    public CustomerID customerID() {
        return customerID;
    }

    public MedicalServiceIdentity medicalServiceIdentity() {
        return medicalServiceIdentity;
    }

    public Invoice invoice() {
        return invoice;
    }

    public Location location() {
        return location;
    }

    public Schedule schedule() {
        return schedule;
    }
}
