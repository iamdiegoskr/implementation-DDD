package com.training.sofka.veterinaryAppointments.medicalService.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.medicalService.value.Diagnosis;

public class DiagnosisGenerated extends DomainEvent {

    private final Diagnosis diagnosis;

    public DiagnosisGenerated(Diagnosis diagnosis) {
        super("training.sofka.medicalservice.diagnosisgenerated");
        this.diagnosis = diagnosis;
    }

    public Diagnosis diagnosis() {
        return diagnosis;
    }
}
