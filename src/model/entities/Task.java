package model.entities;

import model.entities.enums.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    private String id = UUID.randomUUID().toString();
    private String description;
    private TaskStatus status = TaskStatus.TODO;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
