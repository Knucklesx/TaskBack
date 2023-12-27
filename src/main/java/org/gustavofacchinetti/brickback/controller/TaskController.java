package org.gustavofacchinetti.brickback.controller;

import org.gustavofacchinetti.brickback.model.TaskPostRequest;
import org.gustavofacchinetti.brickback.model.TaskPostResponse;
import org.gustavofacchinetti.brickback.model.TasksDetails;
import org.gustavofacchinetti.brickback.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/tasks")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public TaskPostResponse createTask(@RequestBody List<TaskPostRequest> taskPostRequest) {
        int insertedTasks = taskService.addAll(taskPostRequest);
        TaskPostResponse re = new TaskPostResponse();
        re.setInsertedRecords(insertedTasks);
        return re;
    }

    @GetMapping
    public List<TasksDetails> getTasks() {
        return taskService.fetchAll();
    }

}
