package kz.bitlab.project2.db;

import jakarta.annotation.PostConstruct;
import kz.bitlab.project2.entity.Task;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DBManager {

    @Getter
    private final List<Task> tasks = new ArrayList<>();

    @PostConstruct
    public void init() {
        tasks.add(new Task(1L, "Task 1", "2024-12-5", false));
        tasks.add(new Task(2L, "Task 1", "2024-12-5", false));
        tasks.add(new Task(3L, "Task 1", "2024-12-5", false));
        tasks.add(new Task(4L, "Task 1", "2024-12-5", false));
        tasks.add(new Task(5L, "Task 1", "2024-12-5", false));
    }

}
