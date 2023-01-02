package com.code.springboot.TodoApplication.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
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
	
	
	// return after adding todo
			@RequestMapping(value = "add-todo", method = RequestMethod.GET)
			public String showNewTodoPage() {
				
				return "todo";
			}
	
	// return after adding todo
		@RequestMapping(value = "add-todo", method = RequestMethod.POST)
		public String addNewTodoPage(@RequestParam String description, ModelMap model) {
			//
			String username = (String) model.get("name");
			todoService.addTodo(username, description, LocalDate.now().plusYears(1), false);
			return "redirect:list-todos"; // use link for redirecting
		}
		
	
}
