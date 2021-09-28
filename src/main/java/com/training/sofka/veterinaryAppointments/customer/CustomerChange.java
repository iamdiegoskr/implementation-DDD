package com.training.sofka.veterinaryAppointments.customer;

import co.com.sofka.domain.generic.EventChange;
import com.training.sofka.veterinaryAppointments.customer.entity.Pet;
import com.training.sofka.veterinaryAppointments.customer.event.*;

import java.util.HashSet;

public class CustomerChange extends EventChange {

    public CustomerChange(Customer customer){

        apply((AddedCustomer event)->{
            customer.name = event.getName();
            customer.email = event.getEmail();
            customer.telephone = event.getTelephone();
            customer.address = event.getAddress();
            customer.pets = new HashSet<>();
        });

        apply((NameChanged event)->{
            customer.name = event.name();
        });

        apply((UpdatedEmail event)->{
            customer.email = event.email();
        });

        apply((AddedPet event)->{
            customer.pets.add(new Pet(event.petID(),event.animalType(),event.age(), event.state()));
        });

        apply((UpdatedPetStatus event)->{
            var pet = customer
                    .getPetById(event.petID())
                    .orElseThrow(()-> new IllegalArgumentException("Id de mascota no encontrado"));
            pet.updateStatus(event.state());
        });

        apply((UpdatedPetAge event)->{
            var pet = customer
                    .getPetById(event.petID())
                    .orElseThrow(()-> new IllegalArgumentException("Id de mascota no encontrada"));
            pet.updateAge(event.age());
        });


    }

}
