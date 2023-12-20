package org.gustavofacchinetti.brickback.controller;
import org.gustavofacchinetti.brickback.model.TaskPostRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/task")
public class TarefasController {

    @PostMapping
    public void createTask(@RequestBody List<TaskPostRequest> taskPostRequest) {

    }

}
