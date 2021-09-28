package com.training.sofka.veterinaryAppointments.medicalService.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.medicalService.value.TypeService;

public class UpdatedTypeService extends DomainEvent {

    private final TypeService typeService;

    public UpdatedTypeService(TypeService typeService){
        super("training.sofka.medicalservice.updatedtypeservice");
        this.typeService = typeService;
    }

    public TypeService typeService() {
        return typeService;
    }
}
