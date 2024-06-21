package com.example.spring_boot_todo_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_todo_application.models.TodoItem;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long>{
    
}
