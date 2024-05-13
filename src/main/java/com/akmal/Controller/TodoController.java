package com.akmal.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akmal.Entity.Todo;

@RestController
public class TodoController {

    @GetMapping("/todos")
    public ArrayList<Todo> index() {
        ArrayList<Todo> todos = new ArrayList<Todo>();

        todos.add(new Todo("2021-10-10", "Complete Java Project"));
        todos.add(new Todo("2021-10-11", "Complete Spring Boot Project"));
        todos.add(new Todo("2021-10-12", "Complete React Project"));

        return todos;
    }
}
