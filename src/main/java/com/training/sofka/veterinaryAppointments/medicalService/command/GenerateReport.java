package com.training.sofka.veterinaryAppointments.medicalService.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.medicalService.value.MedicReport;
import com.training.sofka.veterinaryAppointments.medicalService.value.MedicalHistoryIdentity;

public class GenerateReport implements Command {

    private final MedicalHistoryIdentity entityId;
    private final MedicReport report;

    public GenerateReport(MedicalHistoryIdentity entityId, MedicReport report) {
        this.entityId = entityId;
        this.report = report;
    }

    public MedicalHistoryIdentity getEntityId() {
        return entityId;
    }

    public MedicReport getReport() {
        return report;
    }
}
