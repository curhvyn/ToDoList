package com.curhvyn.ToDoList.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curhvyn.ToDoList.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{

	List<Task> findAllByOrderByPriority();
	
}
