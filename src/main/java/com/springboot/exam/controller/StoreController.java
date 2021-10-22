package com.springboot.exam.controller;

import com.springboot.exam.model.StoreInput;
import com.springboot.exam.model.StoreResponse;
import com.springboot.exam.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping("/getProdAvailabilty")
    public ResponseEntity<StoreResponse> getProductAvailability(@RequestBody StoreInput storeInput){
        storeService.setAvailability();
        storeService.setCapacity();
        String status = storeService.getStatus(storeInput.getReqDate());
        if(status.equals("No Content")){
            return new ResponseEntity<StoreResponse>(HttpStatus.NO_CONTENT);
        }
        else{
            StoreResponse storeResponse = new StoreResponse(storeInput.getStoreNo(),storeInput.getProductId(),storeInput.getReqQty(),storeInput.getReqDate(),status);
            return new ResponseEntity<StoreResponse>(storeResponse,HttpStatus.OK);
        }
    }
}
