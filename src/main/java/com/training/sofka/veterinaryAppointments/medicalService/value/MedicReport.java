package com.training.sofka.veterinaryAppointments.medicalService.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MedicReport implements ValueObject<String> {

    private final String value;

    public MedicReport(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El reporte no puede estar vacio");
        }

        if(this.value.length()<10){
            throw new IllegalArgumentException("El reporte no puede tener menos de 10 caracteres");
        }

        if(this.value.length()>1000){
            throw new IllegalArgumentException("El reporte es demasido extenso");
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
        MedicReport that = (MedicReport) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
