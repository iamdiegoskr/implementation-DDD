package com.training.sofka.veterinaryAppointments.medicalService;

import co.com.sofka.domain.generic.AggregateEvent;
import com.training.sofka.veterinaryAppointments.customer.value.CustomerID;
import com.training.sofka.veterinaryAppointments.medicalService.entity.MedicalHistory;
import com.training.sofka.veterinaryAppointments.medicalService.entity.Vet;
import com.training.sofka.veterinaryAppointments.medicalService.event.DiagnosisGenerated;
import com.training.sofka.veterinaryAppointments.medicalService.event.MedicalServiceCreated;
import com.training.sofka.veterinaryAppointments.medicalService.event.ReportAdded;
import com.training.sofka.veterinaryAppointments.medicalService.event.UpdatedVetOffice;
import com.training.sofka.veterinaryAppointments.medicalService.value.*;

import java.util.Objects;

public class MedicalService extends AggregateEvent<MedicalServiceIdentity> {

    protected CustomerID customerID;
    protected Vet vet;
    protected MedicalHistory medicalHistory;
    protected TypeService typeService;

    public MedicalService(MedicalServiceIdentity entityId, CustomerID customerID, Vet vet,
                          MedicalHistory medicalHistory, TypeService typeService) {
        super(entityId);
        appendChange(new MedicalServiceCreated(customerID,vet,medicalHistory,typeService)).apply();
    }


    public void addNewReport(MedicalHistoryIdentity entityId, MedicReport report){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(report);
        appendChange(new ReportAdded(entityId,report)).apply();
    }

    public void generateDiagnostic(Diagnosis diagnosis){
        Objects.requireNonNull(diagnosis);
        appendChange(new DiagnosisGenerated(diagnosis)).apply();
    }

    public void updateConsultingRoomVet(ConsultingRoom consultingRoom){
        Objects.requireNonNull(consultingRoom);
        appendChange(new UpdatedVetOffice(consultingRoom)).apply();
    }

    public CustomerID customerID() {
        return customerID;
    }

    public Vet vet() {
        return vet;
    }

    public MedicalHistory medicalHistory() {
        return medicalHistory;
    }

    public TypeService typeService() {
        return typeService;
    }
}
