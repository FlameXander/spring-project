package ru.otus.java.pro.spring.project.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemDto {
    private Long id;
    private String title;
    private int cost;
}