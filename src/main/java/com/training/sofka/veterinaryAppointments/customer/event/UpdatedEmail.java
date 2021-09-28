package com.training.sofka.veterinaryAppointments.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.shared.value.Email;

public class UpdatedEmail extends DomainEvent {

    private final Email email;
    public UpdatedEmail(Email email){
        super("training.sofka.customer.updatedemail");
        this.email = email;
    }

    public Email email() {
        return email;
    }
}
