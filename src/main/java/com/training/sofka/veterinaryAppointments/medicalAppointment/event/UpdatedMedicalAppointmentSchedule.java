package com.training.sofka.veterinaryAppointments.medicalAppointment.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.Schedule;

public class UpdatedMedicalAppointmentSchedule extends DomainEvent {

    private final Schedule schedule;


    public UpdatedMedicalAppointmentSchedule(Schedule schedule) {
        super("training.sofka.medicalappointment.scheduleupdated");
        this.schedule = schedule;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}
