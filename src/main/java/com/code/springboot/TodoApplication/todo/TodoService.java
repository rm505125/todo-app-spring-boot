package com.code.springboot.TodoApplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;

	static {
		todos.add(new Todo(++todosCount, "coder", "Learn AWS architechture", LocalDate.now().plusMonths(1), false));

		todos.add(new Todo(++todosCount, "coder", "Learn React Js", LocalDate.now().plusMonths(4), false));
		todos.add(new Todo(++todosCount, "coder", "Learn FullStack", LocalDate.now().plusMonths(6), false));
		todos.add(new Todo(++todosCount, "coder", "Learn DevOps", LocalDate.now().plusMonths(8), false));
	}


	public List<Todo> findByUsername(String username){
		Predicate<? super Todo> predicate = 
				todo -> todo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	} 
	
	public void addTodo(String name, String description, LocalDate date, boolean done) {
		
		Todo todo = new Todo(++todosCount,name,description,date,done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		Predicate<Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		// TODO Auto-generated method stub
		Predicate<Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteById(todo.getId());
		todos.add(todo);
	}

	
	
}
