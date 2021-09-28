package com.training.sofka.veterinaryAppointments.medicalService.command;

import co.com.sofka.domain.generic.Command;
import com.training.sofka.veterinaryAppointments.medicalService.value.ConsultingRoom;

public class UpdateConsultingRoomVet implements Command {

    private final ConsultingRoom consultingRoom;

    public UpdateConsultingRoomVet(ConsultingRoom consultingRoom) {
        this.consultingRoom = consultingRoom;
    }

    public ConsultingRoom getConsultingRoom() {
        return consultingRoom;
    }
}
