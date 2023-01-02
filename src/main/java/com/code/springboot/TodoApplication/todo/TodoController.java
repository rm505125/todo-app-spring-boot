package com.code.springboot.TodoApplication.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	
	
	private TodoService todoService;
	
	//dependecny injection
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	// list-todos
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("rahul");
		model.addAttribute("todos",todos);
		return "listTodos";
	}
}
