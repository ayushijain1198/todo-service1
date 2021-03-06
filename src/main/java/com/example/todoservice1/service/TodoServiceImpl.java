package com.example.todoservice1.service;


import com.example.todoservice1.model.Todo;
import com.example.todoservice1.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoServiceImpl implements TodoService{
    private TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }
    @Override
    public Todo createTodo(Todo todo) {
        // TODO Auto-generated method stub
        return todoRepository.save(todo);
    }
}
