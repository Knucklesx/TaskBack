package org.gustavofacchinetti.brickback.service;

import org.gustavofacchinetti.brickback.entity.TaskEntity;
import org.gustavofacchinetti.brickback.model.TaskPostRequest;
import org.gustavofacchinetti.brickback.model.TasksDetails;
import org.gustavofacchinetti.brickback.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {


    @Autowired
    private TaskRepository taskRepository;
    public int addAll(List<TaskPostRequest> taskPostRequest) {
        List<TaskEntity> tasks = taskPostRequest.stream().map(taskRequest -> {
            TaskEntity te = new TaskEntity();
            te.setDescription(taskRequest.getDescription());
            te.setTitle(taskRequest.getTitle());
            return te;
        }).collect(Collectors.toList());

        return taskRepository.saveAll(tasks).size();

    }

    public List<TasksDetails> fetchAll() {
        List<TaskEntity> allTasks = taskRepository.findAll();

        return allTasks.stream().map(entity -> new TasksDetails(entity.getTitle(), entity.getDescription()))
                .collect(Collectors.toList());
    }
}
