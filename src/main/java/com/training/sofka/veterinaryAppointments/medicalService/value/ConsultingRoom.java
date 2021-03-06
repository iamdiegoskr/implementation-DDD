package com.training.sofka.veterinaryAppointments.medicalService.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ConsultingRoom implements ValueObject<String> {

    private final String value;

    public ConsultingRoom(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El consultorio no puede estar vacio");
        }

    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultingRoom that = (ConsultingRoom) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
