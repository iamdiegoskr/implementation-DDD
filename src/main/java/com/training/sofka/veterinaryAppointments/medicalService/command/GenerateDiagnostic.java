package com.training.sofka.veterinaryAppointments.medicalService.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.medicalService.value.Diagnosis;

public class GenerateDiagnostic implements Command {

    private final Diagnosis diagnosis;


    public GenerateDiagnostic(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }
}
