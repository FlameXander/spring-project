package ru.otus.java.pro.spring.project.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ErrorDto {
    private String code;
    private String message;
    private LocalDateTime datetime;

    public ErrorDto(String code, String message) {
        this.code = code;
        this.message = message;
        this.datetime = LocalDateTime.now();
    }
}
