package com.training.sofka.veterinaryAppointments.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class State implements ValueObject<String> {

    private final String value;

    public State(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El estado de la mascota no puede estar vacia");
        }

        if(this.value.length()>100){
            throw new IllegalArgumentException("El estado no puede superar los 100 caracteres");
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
        State state = (State) o;
        return Objects.equals(value, state.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
