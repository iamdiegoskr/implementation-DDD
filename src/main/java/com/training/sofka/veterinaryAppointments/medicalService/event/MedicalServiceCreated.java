package com.training.sofka.veterinaryAppointments.medicalService.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.medicalService.entity.MedicalHistory;
import com.training.sofka.veterinaryAppointments.medicalService.entity.Vet;
import com.training.sofka.veterinaryAppointments.medicalService.value.TypeService;


public class MedicalServiceCreated extends DomainEvent {

    private final CustomerID customerID;
    private final Vet vet;
    private final MedicalHistory medicalHistory;
    private final TypeService typeService;

    public MedicalServiceCreated(CustomerID customerID, Vet vet, MedicalHistory medicalHistory,
                                 TypeService typeService) {
        super("training.sofka.medicalservice.servicecreated");
        this.customerID = customerID;
        this.vet = vet;
        this.medicalHistory = medicalHistory;
        this.typeService = typeService;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public Vet getVet() {
        return vet;
    }

    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }

    public TypeService getTypeService() {
        return typeService;
    }
}
