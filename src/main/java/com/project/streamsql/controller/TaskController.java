package com.project.streamsql.controller;


import com.project.streamsql.entity.Task;
import com.project.streamsql.repository.TaskRepository;
import com.project.streamsql.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
@RestController
@RequestMapping("tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping("all")
    public List<Task> loadCustomers() {
        return taskRepository.findAll();
    }

    @RequestMapping("get/{id}")
    public Task getTask(@PathVariable("id") Long id) {
        return taskRepository.findById(id).get();
    }

    /**
     * @param task
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @Transactional
    public Task addTask(@RequestBody Task task) {


        taskService.addTask(task);

        Long id = task.getId();

        return taskService.getTaskById(id);

    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
//    @Transactional
    public Task updateTask(@RequestBody Task task) {

        taskService.updateTaskById(task);

        Long id = task.getId();

        return taskService.getTaskById(id);

    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
//    @Transactional
    public Task deleteTask(@RequestBody Task task) {

        Long id = task.getId();
        task = getTask(id);
        taskService.deleteTaskById(id);
        return task;

    }

}
