package com.decathlon.poc.api;


import com.decathlon.poc.stoplight.api.PetsApiDelegate;
import com.decathlon.poc.stoplight.model.PetV1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PetApiImpl implements PetsApiDelegate {

    @Override
    public ResponseEntity<PetV1> showPetById(String petId) {
        PetV1 pet = new PetV1();
        pet.id(1L).name("rex");

        return new ResponseEntity<>(pet, HttpStatus.OK);
    }

}
