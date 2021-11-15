package com.decathlon.poc.api;

import com.decathlon.poc.pets.api.PetsApiDelegate;
import com.decathlon.poc.pets.model.PetV1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PetApiImpl implements PetsApiDelegate {

    @Override
    public ResponseEntity<PetV1> showPetById(String petId) {
        PetV1 pet = new PetV1();
        pet.id(1L).name("rex");
        return new ResponseEntity<>(pet, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<PetV1>> listPets(Integer limit) {
        PetV1 rex = new PetV1();
        rex.id(1L).name("rex");
        PetV1 max = new PetV1();
        max.id(1L).name("max");
        return new ResponseEntity<>(List.of(rex, max), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createPets() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
