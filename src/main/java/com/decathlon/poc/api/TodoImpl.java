package com.decathlon.poc.api;

import com.decathlon.poc.petstore.ApiException;
import com.decathlon.poc.petstore.api.PetApi;
import com.decathlon.poc.petstore.model.Pet;
import com.decathlon.poc.todo.api.TodosApiDelegate;
import com.decathlon.poc.todo.model.Todo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class TodoImpl implements TodosApiDelegate {

    @Override
    public ResponseEntity<Void> createTodo(Todo todo, Boolean completed) {
        return new ResponseEntity<>(HttpStatus.valueOf(201));
    }

    @Override
    public ResponseEntity<Void> deleteTodo(String todoId) {
        return new ResponseEntity<>(HttpStatus.valueOf(204));
    }

    @Override
    public ResponseEntity<Todo> getTodo(String todoId) {
        PetApi petApi = new PetApi();
        try {
            Pet pet = petApi.getPetById(1L);
            Todo todo = new Todo()
                    .name(pet.getName())
                    .completed(true)
                    .description("pet found!")
                    .date(OffsetDateTime.now());
            return ResponseEntity.ok(todo);
        } catch (ApiException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<List<Todo>> getTodos(Boolean completed) {
        Todo todo = new Todo()
                .name("todo")
                .completed(true)
                .description("todo description")
                .date(OffsetDateTime.now());
        return ResponseEntity.ok(List.of(todo));
    }

    @Override
    public ResponseEntity<Void> updateTodo(String todoId, Todo todo) {
        return new ResponseEntity<>(HttpStatus.valueOf(202));
    }
}
