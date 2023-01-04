package com.code.springboot.TodoApplication.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.springboot.TodoApplication.todo.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{

	public List<Todo> findByUsername(String username);

}