package com.springboot.exam.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalTime;

@Data
@AllArgsConstructor
public class Calender {
    private String storeID;
    private String day;
    private LocalTime cutOffTime;
}
