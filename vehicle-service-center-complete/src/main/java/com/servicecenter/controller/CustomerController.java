package com.servicecenter.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.servicecenter.service.CustomerService;
import com.servicecenter.entity.Customer;

@RestController @RequestMapping("/customers") @RequiredArgsConstructor
public class CustomerController {
    private final CustomerService service;
    @PostMapping public Customer save(@RequestBody Customer c){ return service.save(c); }
    @GetMapping public List<Customer> all(){ return service.getAll(); }
}
