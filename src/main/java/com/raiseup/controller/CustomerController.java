package com.raiseup.controller;

import com.raiseup.model.Customer;
import com.raiseup.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController()
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllCustomers(@RequestParam(defaultValue = "0",name = "page") int page,
                                                               @RequestParam(defaultValue = "15", name = "size") int size) {
        try{
            List<Customer>customerList= new ArrayList<>();
            Pageable pageable= PageRequest.of(page,size);
            Page<Customer> customerPage;
            customerPage= customerService.findAll(pageable);
            customerList=customerPage.getContent();
            Map<String,Object>response=new HashMap<>();
            response.put("totalPages",customerPage.getTotalPages());
            response.put("totalObjects",customerPage.getTotalElements());
            response.put("currentPage",customerPage.getNumber());
            response.put("customers",customerList);
            return new ResponseEntity<>(response, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
