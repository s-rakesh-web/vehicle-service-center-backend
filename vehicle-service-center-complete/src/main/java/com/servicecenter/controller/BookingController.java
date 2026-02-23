package com.servicecenter.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.servicecenter.service.BookingService;
import com.servicecenter.entity.ServiceBooking;

@RestController @RequestMapping("/bookings") @RequiredArgsConstructor
public class BookingController {
    private final BookingService service;

    @PostMapping("/{customerId}")
    public ServiceBooking create(@PathVariable Long customerId,@RequestBody ServiceBooking b){
        return service.create(customerId,b);
    }

    @GetMapping
    public List<ServiceBooking> all(){ return service.getAll(); }
}
