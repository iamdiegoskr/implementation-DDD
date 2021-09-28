package com.training.sofka.veterinaryAppointments.medicalService.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.medicalService.entity.MedicalHistory;
import com.training.sofka.veterinaryAppointments.medicalService.value.MedicReport;
import com.training.sofka.veterinaryAppointments.medicalService.value.MedicalHistoryIdentity;

public class ReportAdded extends DomainEvent {


    private final  MedicalHistoryIdentity medicalHistoryIdentity;
    private final MedicReport report;

    public ReportAdded(MedicalHistoryIdentity medicalHistoryIdentity, MedicReport report) {
        super("training.sofka.medicalservice.reportadded");
        this.medicalHistoryIdentity = medicalHistoryIdentity;
        this.report = report;
    }

    public MedicalHistoryIdentity medicalHistory() {
        return medicalHistoryIdentity;
    }

    public MedicReport report() {
        return report;
    }
}
