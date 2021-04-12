package com.example.todoservice1.repo;

import com.example.todoservice1.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;

@Resource
public interface TodoRepository extends JpaRepository<Todo,Integer> {
}
