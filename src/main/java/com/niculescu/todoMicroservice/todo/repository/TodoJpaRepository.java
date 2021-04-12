package com.niculescu.todoMicroservice.todo.repository;

import com.niculescu.todoMicroservice.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoJpaRepository extends JpaRepository<Todo, Long> {

    List<Todo> findByUserName(String userName);
}
