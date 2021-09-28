package com.training.sofka.veterinaryAppointments.medicalService.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Diagnosis implements ValueObject<String> {

    private final String value;

    public Diagnosis(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El diagnostico no puede estar vacio");
        }

        if(this.value.length()<10){
            throw new IllegalArgumentException("Se debe generar un diagnostico mayor a 10 caracteres");
        }

        if(this.value.length()>1000){
            throw new IllegalArgumentException("Diagnostico supera caracteres permitidos");
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
        Diagnosis diagnosis = (Diagnosis) o;
        return Objects.equals(value, diagnosis.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
