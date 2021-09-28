package com.training.sofka.veterinaryAppointments.medicalService.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.medicalService.value.ConsultingRoom;

public class UpdatedVetOffice extends DomainEvent {
    private final ConsultingRoom consultingRoom;

    public UpdatedVetOffice(ConsultingRoom consultingRoom) {
        super("training.sofka.medicalservice.updatedvetoffice");
        this.consultingRoom = consultingRoom;
    }

    public ConsultingRoom consultingRoom() {
        return consultingRoom;
    }
}
