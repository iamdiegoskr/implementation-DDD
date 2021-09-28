package com.training.sofka.veterinaryAppointments.shared.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Address implements ValueObject<Address.Props> {

    private final String street;
    private final String city;

    public Address(String street, String city){
        this.street = Objects.requireNonNull(street);
        this.city = Objects.requireNonNull(city);

        if(this.street.isEmpty()){
            throw new IllegalArgumentException("La direccion no puede estar vacia");
        }

        if(this.city.isEmpty()){
            throw new IllegalArgumentException("La ciudad no puede estar vacia");
        }
    }


    @Override
    public Props value() {
        return new Props() {
            @Override
            public String street() {
                return street;
            }

            @Override
            public String city() {
                return city;
            }
        };
    }

    public interface Props{
        String street();
        String city();
    }

}
