package com.niculescu.todoMicroservice.todo.controller;

import com.niculescu.todoMicroservice.todo.entity.Todo;
import com.niculescu.todoMicroservice.todo.repository.TodoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoJpaRepository todoJpaRepository;

    @GetMapping("/service/todos")
    public List<Todo> getAllTodos() {
        return todoJpaRepository.findAll();
    }

    @GetMapping("/service/todos/user/{userName}")
    public List<Todo> getAllTodosForUser(@PathVariable String userName) {
        return todoJpaRepository.findByUserName(userName);
    }

    @GetMapping("/service/todos/{id}")
    public Todo getTodoById(@PathVariable long id) {
        return todoJpaRepository.findById(id).get();
    }
}
