package com.training.sofka.veterinaryAppointments.medicalService.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.medicalService.entity.MedicalHistory;
import com.training.sofka.veterinaryAppointments.medicalService.entity.Vet;
import com.training.sofka.veterinaryAppointments.medicalService.value.MedicalServiceIdentity;
import com.training.sofka.veterinaryAppointments.medicalService.value.TypeService;

public class CreateMedicalService implements Command {

    private final MedicalServiceIdentity entityId;
    private final CustomerID customerID;
    private final Vet vet;
    private final MedicalHistory medicalHistory;
    private final TypeService typeService;

    public CreateMedicalService(MedicalServiceIdentity entityId, CustomerID customerID, Vet vet,
                                MedicalHistory medicalHistory, TypeService typeService) {
        this.entityId = entityId;
        this.customerID = customerID;
        this.vet = vet;
        this.medicalHistory = medicalHistory;
        this.typeService = typeService;
    }


    public MedicalServiceIdentity getEntityId() {
        return entityId;
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
