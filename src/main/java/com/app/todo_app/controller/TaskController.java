package com.app.todo_app.controller;

import com.app.todo_app.model.Task;
import com.app.todo_app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping
    public String tasks(Model model) {
        List<Task> tasks=taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
