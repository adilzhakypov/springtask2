package kz.bitlab.project2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Task {

    private Long id;
    private String name;
    private String deadlineDate;
    private boolean isCompleted;
}
