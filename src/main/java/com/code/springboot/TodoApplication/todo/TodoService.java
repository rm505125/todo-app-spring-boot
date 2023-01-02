package com.code.springboot.TodoApplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

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

	public List<Todo> findByUsername(String name) {
		return todos;
	}
	
	public void addTodo(String name, String description, LocalDate date, boolean done) {
		
		Todo todo = new Todo(++todosCount,name,description,date,done);
		todos.add(todo);
		
		
	}
}
