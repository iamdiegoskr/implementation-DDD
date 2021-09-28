package com.training.sofka.veterinaryAppointments.medicalAppointment.entity;

import co.com.sofka.domain.generic.Entity;
import com.training.sofka.veterinaryAppointments.medicalAppointment.value.InvoiceIdentity;

public class Invoice extends Entity<InvoiceIdentity> {

    public Invoice(InvoiceIdentity entityId) {
        super(entityId);
    }
}
