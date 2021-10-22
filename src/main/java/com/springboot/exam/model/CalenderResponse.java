package com.springboot.exam.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CalenderResponse {
    private String storeID;
    private LocalDateTime requestDate;
    private String status;
}
