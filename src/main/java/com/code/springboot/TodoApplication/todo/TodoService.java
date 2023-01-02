package com.code.springboot.TodoApplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();

	static {
		todos.add(new Todo(1, "coder", "Learn AWS architechture", LocalDate.now().plusMonths(1), false));

		todos.add(new Todo(2, "coder", "Learn React Js", LocalDate.now().plusMonths(4), false));
		todos.add(new Todo(3, "coder", "Learn FullStack", LocalDate.now().plusMonths(6), false));
		todos.add(new Todo(4, "coder", "Learn DevOps", LocalDate.now().plusMonths(8), false));
	}

	public List<Todo> findByUsername(String name) {
		return todos;
	}
}
