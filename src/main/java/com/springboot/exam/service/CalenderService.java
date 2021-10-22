package com.springboot.exam.service;

import com.springboot.exam.model.Calender;
import com.springboot.exam.model.CalenderInput;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalenderService {

    private static List<Calender> calenderList = new ArrayList<>();

    public void setCalender() {
        calenderList.add(new Calender("STORE001","ALL", LocalTime.of(13,30)));
        calenderList.add(new Calender("STORE002","SUNDAY", LocalTime.of(13,30)));
        calenderList.add(new Calender("STORE003","MONDAY", LocalTime.of(13,30)));
    }

    public String findStoreAvailability(CalenderInput calenderInput) {



        Calender c = calenderList.stream().filter(i->i.getStoreID().equals(calenderInput.getStoreID()))
                .filter(i->i.getDay().equals(calenderInput.getRequestDate().getDayOfWeek()))
                .filter(i->i.getCutOffTime().isAfter(calenderInput.getRequestDate().toLocalTime())).findFirst().get();
        if(c.getStoreID()!=null){
            return "Available";
        }
        else{
            return "Not Available";
        }

    }
}
