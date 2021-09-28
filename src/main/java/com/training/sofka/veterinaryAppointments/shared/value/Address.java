package com.training.sofka.veterinaryAppointments.shared.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Address implements ValueObject<Address.Props> {

    private final String street;
    private final String city;

    public Address(String street, String city){
        this.street = Objects.requireNonNull(street);
        this.city = Objects.requireNonNull(city);

        if(this.street.isBlank()){
            throw new IllegalArgumentException("La direccion no puede estar vacia");
        }

        if(this.city.isBlank()){
            throw new IllegalArgumentException("La ciudad no puede estar vacia");
        }

        if(this.street.length()>200){
            throw new IllegalArgumentException("La direccion no puede contener mas de 200 caracteres");
        }

        if(this.city.length()>100){
            throw new IllegalArgumentException("La ciudad no puede contener mas de 100 caracteres");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city);
    }
}
