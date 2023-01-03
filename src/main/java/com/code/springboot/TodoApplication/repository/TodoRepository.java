package com.code.springboot.TodoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.springboot.TodoApplication.todo.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{

}
