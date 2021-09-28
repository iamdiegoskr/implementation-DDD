package com.training.sofka.veterinaryAppointments.medicalService;

import co.com.sofka.domain.generic.EventChange;
import com.training.sofka.veterinaryAppointments.medicalService.event.*;

public class MedicalServiceChange extends EventChange {

    public MedicalServiceChange(MedicalService service){

        apply((MedicalServiceCreated event)->{
            service.customerID = event.getCustomerID();
            service.vet = event.getVet();
            service.medicalHistory = event.getMedicalHistory();
            service.typeService = event.getTypeService();
        });

        apply((ReportAdded event)-> service.medicalHistory.updateReport(event.report()));

        apply((DiagnosisGenerated event)->{
            service.vet.generateDiagnosis(event.diagnosis());
        });

        apply((UpdatedTypeService event)->{
            service.typeService = event.typeService();
        });

        apply((UpdatedVetOffice event)->{
            service.vet.updateConsultingRoom(event.consultingRoom());
        });

    }

}
