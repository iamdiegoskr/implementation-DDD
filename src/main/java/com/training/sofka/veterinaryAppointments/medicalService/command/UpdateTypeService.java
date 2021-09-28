package com.training.sofka.veterinaryAppointments.medicalService.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.medicalService.value.TypeService;

public class UpdateTypeService implements Command {

    private final TypeService typeService;

    public UpdateTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    public TypeService getTypeService() {
        return typeService;
    }
}
