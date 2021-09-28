package com.training.sofka.veterinaryAppointments.medicalService.entity;

import co.com.sofka.domain.generic.Entity;
import com.training.sofka.veterinaryAppointments.medicalService.value.MedicReport;
import com.training.sofka.veterinaryAppointments.medicalService.value.MedicalHistoryIdentity;

import java.util.Objects;


public class MedicalHistory extends Entity<MedicalHistoryIdentity> {

    private MedicReport report;

    public MedicalHistory(MedicalHistoryIdentity entityId, MedicReport report) {
        super(entityId);
        this.report = report;
    }

    public void updateReport(MedicReport report){
        this.report = Objects.requireNonNull(report);
    }

    public MedicReport report() {
        return report;
    }
}
