package com.decathlon.poc.api;

import com.decathlon.poc.model.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PetApiImpl implements PetApiDelegate{

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
log.info("azdazdadazdazdazdazdaz");
        Pet pet = new Pet();
        pet.id(1L).name("rex");
        return new ResponseEntity<>(pet, HttpStatus.OK);
    }

}
