package com.springboot.exam.service;

import com.springboot.exam.model.Availability;
import com.springboot.exam.model.Capacity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {

    private static List<Availability> availabilities= new ArrayList<>();
    private static List<Capacity> capacities = new ArrayList<>();

    public void setAvailability() {
        availabilities.add(new Availability("Store001", "Prod1", "2021-02-19", 1.0));
        availabilities.add(new Availability("Store001", "Prod2", "2021-02-20", 3.0));
        availabilities.add(new Availability("Store001", "Prod2", "2021-02-21", 0));
    }

    public void setCapacity() {
        capacities.add(new Capacity(" Store001", "Prod1", "2021-02-19", 0));
        capacities.add(new Capacity(" Store001", "Prod1", "2021-02-20", 2.0));
        capacities.add(new Capacity(" Store001", "Prod1", "2021-02-21", 2.0));
        capacities.add(new Capacity(" Store001", "Prod1", "2021-02-22", 0));
    }

    public String getStatus(String reqDate) {
        double avail = 0;
        avail = availabilities.stream().filter(i->i.getDate().equals(reqDate))
                .mapToDouble(i->i.getAvialQty()).sum();

        double capacity = 0;
        capacity = capacities.stream().filter(i->i.getDate().equals(reqDate))
                .mapToDouble(i->i.getNoOfOrdersAccepted()).sum();

        if(avail == 0 && capacity ==0){
            return "No Content";
        }
        else if(capacity ==0){
            return "No Capacity";
        }
        else if(avail ==0){
            return "No Availability";
        }
        else{
            return "Available";
        }
    }
}
