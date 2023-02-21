package org.example.Seminar_3.cw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    String fio;
    Integer group;
    Integer money;
    List<Integer> count;
}
