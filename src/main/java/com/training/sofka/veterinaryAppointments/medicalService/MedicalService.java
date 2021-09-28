package com.training.sofka.veterinaryAppointments.medicalService;

import co.com.sofka.domain.generic.AggregateEvent;
import com.training.sofka.veterinaryAppointments.medicalService.value.MedicalServiceIdentity;

public class MedicalService extends AggregateEvent<MedicalServiceIdentity> {


    public MedicalService(MedicalServiceIdentity medicalServiceIdentity) {
        super(medicalServiceIdentity);
    }
}
