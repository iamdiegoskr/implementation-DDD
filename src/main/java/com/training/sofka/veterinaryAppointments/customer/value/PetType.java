package com.training.sofka.veterinaryAppointments.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PetType implements ValueObject<String> {

    private final String value;

    public PetType(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El tipo no puede estar vacio");
        }

        if(this.value.length()>100){
            throw new IllegalArgumentException("La longitud del tipo no puede superar los 100 caracteres");
        }

    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetType petType = (PetType) o;
        return Objects.equals(value, petType.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
