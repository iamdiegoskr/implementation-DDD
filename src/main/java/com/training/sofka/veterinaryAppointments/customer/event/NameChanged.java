package com.training.sofka.veterinaryAppointments.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.shared.value.Name;

public class NameChanged extends DomainEvent {

    private final Name name;

    public NameChanged(Name name) {
        super("training.sofka.namechanged");
        this.name = name;
    }

    public Name name() {
        return name;
    }
}
