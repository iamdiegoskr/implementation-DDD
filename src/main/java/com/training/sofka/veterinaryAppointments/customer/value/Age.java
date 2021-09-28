package com.training.sofka.veterinaryAppointments.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Age implements ValueObject<Integer> {

    private final Integer value;

    public Age(Integer age) {
        this.value = Objects.requireNonNull(age);

        if (this.value.toString().isBlank()){
            throw new IllegalArgumentException("Debe ingresar un edad");
        }

        if(this.value <0 || this.value >200){
            throw new IllegalArgumentException("Debe ingresar una edad validad");
        }

    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Age age = (Age) o;
        return Objects.equals(value, age.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
