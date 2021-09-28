package com.training.sofka.veterinaryAppointments.customer;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.training.sofka.veterinaryAppointments.customer.entity.Pet;
import com.training.sofka.veterinaryAppointments.customer.event.*;
import com.training.sofka.veterinaryAppointments.customer.value.*;
import com.training.sofka.veterinaryAppointments.shared.value.Address;
import com.training.sofka.veterinaryAppointments.shared.value.Email;
import com.training.sofka.veterinaryAppointments.shared.value.Name;
import com.training.sofka.veterinaryAppointments.shared.value.Telephone;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Customer extends AggregateEvent<CustomerID> {

    protected Name name;
    protected Email email;
    protected Telephone telephone;
    protected Address address;
    protected Set<Pet> pets;

    public Customer(CustomerID customerID, Name name, Email email, Telephone telephone, Address address) {
        super(customerID);
        appendChange(new AddedCustomer(name,email,telephone, address)).apply();
    }

    private Customer(CustomerID customerID){
        super(customerID);
        subscribe(new CustomerChange(this));
    }

    public static Customer from(CustomerID customerID, List<DomainEvent> events){
        var customer = new Customer(customerID);
        events.forEach(customer::applyEvent);
        return customer;
    }

    public void updateName(Name name){
        Objects.requireNonNull(name);
        appendChange(new NameChanged(name)).apply();
    }

    public void updateEmail(Email email){
        Objects.requireNonNull(email);
        appendChange(new UpdatedEmail(email)).apply();
    }

    public void addNewPet(PetID petID, AnimalType animalType, Age age, State state){
        Objects.requireNonNull(petID);
        Objects.requireNonNull(animalType);
        Objects.requireNonNull(age);
        Objects.requireNonNull(state);
        appendChange(new AddedPet(petID,animalType,age,state)).apply();
    }

    public void updateStatusPet(PetID petID, State state){
        Objects.requireNonNull(petID);
        Objects.requireNonNull(state);
        appendChange(new UpdatedPetStatus(petID,state)).apply();
    }

    public void updateAgePet(PetID petID, Age age){
        Objects.requireNonNull(petID);
        Objects.requireNonNull(age);
        appendChange(new UpdatedPetAge(petID,age));
        appendChange(new UpdatedPetAge(petID,age));
    }

    public Optional<Pet> getPetById(PetID petID){
        return pets()
                .stream()
                .filter(pet -> pet.identity().equals(petID))
                .findFirst();
    }

    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }

    public Telephone telephone() {
        return telephone;
    }

    public Set<Pet> pets() {
        return pets;
    }
}
