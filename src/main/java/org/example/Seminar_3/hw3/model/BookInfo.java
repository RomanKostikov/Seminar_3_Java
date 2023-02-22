package org.example.Seminar_3.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BookInfo {
    private String nameBook;
    private String author;
    private Integer price;
    private Integer year;
    private Integer pages;
}
