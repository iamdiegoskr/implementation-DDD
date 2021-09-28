package com.training.sofka.veterinaryAppointments.medicalService.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Specialization implements ValueObject<String> {

    private final String value;

    public Specialization(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("La especializacio no puede estar vacia");
        }

        if(this.value.length()>100){
            throw new IllegalArgumentException("La especializacion no puede contener mas de 100 caracteres");
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
        Specialization that = (Specialization) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
