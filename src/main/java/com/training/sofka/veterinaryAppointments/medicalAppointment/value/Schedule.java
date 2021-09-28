package com.training.sofka.veterinaryAppointments.medicalAppointment.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Schedule implements ValueObject<Date> {

    private final Date date;

    public Schedule(Date date) {
        this.date = Objects.requireNonNull(date);
    }

    @Override
    public Date value() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(date, schedule.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}
