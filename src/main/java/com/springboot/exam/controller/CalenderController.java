package com.springboot.exam.controller;

import com.springboot.exam.model.Calender;
import com.springboot.exam.model.CalenderInput;
import com.springboot.exam.model.CalenderResponse;
import com.springboot.exam.service.CalenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalenderController {

    @Autowired
    private CalenderService calenderService;

    @PostMapping("/findStoreAvailability")
    public CalenderResponse findStoreAvailability(@RequestBody CalenderInput calenderInput){
        calenderService.setCalender();
        String status = calenderService.findStoreAvailability(calenderInput);
        CalenderResponse calenderResponse = new CalenderResponse(calenderInput.getStoreID(),calenderInput.getRequestDate(),status);
        return calenderResponse;
    }
}
