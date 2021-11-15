package com.decathlon.poc.api;

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
        Todo response = new Todo();
        response.setName("todo name");
        response.setCompleted(false);
        response.setDescription("todo description");
        response.setDate(OffsetDateTime.now().minusDays(1L));
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<List<Todo>> getTodos(Boolean completed) {
        Todo todo = new Todo();
        todo.setName("todo name");
        todo.setCompleted(false);
        todo.setDescription("todo description");
        todo.setDate(OffsetDateTime.now().minusDays(1L));
        return ResponseEntity.ok(List.of(todo));
    }

    @Override
    public ResponseEntity<Void> updateTodo(String todoId, Todo todo) {
        return new ResponseEntity<>(HttpStatus.valueOf(202));
    }
}
