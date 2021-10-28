package com.decathlon.poc.api;

import com.decathlon.poc.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PetApiImpl implements PetApiDelegate{

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        Pet pet = new Pet();
        pet.id(1L).name("rex");
        return new ResponseEntity<>(pet, HttpStatus.NOT_IMPLEMENTED);
    }

}
