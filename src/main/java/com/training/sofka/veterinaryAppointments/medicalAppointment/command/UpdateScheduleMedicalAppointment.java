package com.training.sofka.veterinaryAppointments.medicalAppointment.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.Schedule;

public class UpdateScheduleMedicalAppointment implements Command {

    private final Schedule schedule;

    public UpdateScheduleMedicalAppointment(Schedule schedule) {
        this.schedule = schedule;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}
