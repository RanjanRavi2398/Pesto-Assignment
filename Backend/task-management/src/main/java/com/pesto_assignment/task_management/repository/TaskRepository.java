package com.pesto_assignment.task_management.repository;

import com.pesto_assignment.task_management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}