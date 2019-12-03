package com.test.springBoot.springBoot.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springBoot.springBoot.Repository.TaskRepository;
import com.test.springBoot.springBoot.entity.Tasks;

@RestController
@RequestMapping("/api")
public class TaskController {	

	    @Autowired
	    private TaskRepository taskRepository;
	    
	    @GetMapping("/tasks")
	    public List<Tasks> getAllTasks() {
	        return taskRepository.findAll();
	    }
	    
	    @PostMapping("/addTasks")
	    public Tasks createTasks(@Valid @RequestBody Tasks tasks) {
	        return taskRepository.save(tasks);
	    }

}
