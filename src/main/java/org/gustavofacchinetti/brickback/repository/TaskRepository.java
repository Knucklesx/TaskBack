package org.gustavofacchinetti.brickback.repository;

import org.gustavofacchinetti.brickback.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
