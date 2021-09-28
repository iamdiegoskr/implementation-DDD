package com.training.sofka.veterinaryAppointments.medicalService.entity;

import co.com.sofka.domain.generic.Entity;
import com.training.sofka.veterinaryAppointments.medicalService.value.ConsultingRoom;
import com.training.sofka.veterinaryAppointments.medicalService.value.Diagnosis;
import com.training.sofka.veterinaryAppointments.medicalService.value.Specialization;
import com.training.sofka.veterinaryAppointments.medicalService.value.VetIdentity;
import com.training.sofka.veterinaryAppointments.shared.value.Email;
import com.training.sofka.veterinaryAppointments.shared.value.Name;

import java.util.Objects;

public class Vet extends Entity<VetIdentity> {

    private Name name;
    private Email email;
    private Specialization specialization;
    private ConsultingRoom consultingRoom;
    private Diagnosis diagnosis;

    public Vet(VetIdentity entityId, Name name, Email email, Specialization specialization,
               ConsultingRoom consultingRoom, Diagnosis diagnosis) {
        super(entityId);
        this.name = name;
        this.email = email;
        this.specialization = specialization;
        this.consultingRoom = consultingRoom;
        this.diagnosis = diagnosis;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public void updateSpecialization(Specialization specialization){
        this.specialization = Objects.requireNonNull(specialization);
    }

    public void updateConsultingRoom(ConsultingRoom consultingRoom){
        this.consultingRoom = Objects.requireNonNull(consultingRoom);
    }

    public void generateDiagnosis(Diagnosis diagnosis){
        this.diagnosis = Objects.requireNonNull(diagnosis);
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public ConsultingRoom getConsultingRoom() {
        return consultingRoom;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }
}
