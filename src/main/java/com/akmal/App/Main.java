package com.akmal.App;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akmal.Controller.TodoController;
import com.akmal.Entity.Todo;

@RestController
public class Main {

    @GetMapping("/")
    public ArrayList<String> welcome() {
        ArrayList<String> welcome = new ArrayList<String>();
        welcome.add("Welcome to Spring Boot App");
        welcome.add("This is a simple REST API");
        return welcome;
    }

    @GetMapping("/todos")
    public ArrayList<Todo> todos() {
        TodoController todoController = new TodoController();
        return todoController.index();
    }
}