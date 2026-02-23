package com.servicecenter.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import com.servicecenter.repository.*;
import com.servicecenter.entity.*;

@Service @RequiredArgsConstructor
public class BookingService {
    private final BookingRepository repo;
    private final CustomerRepository customerRepo;

    public ServiceBooking create(Long customerId, ServiceBooking booking){
        Customer c = customerRepo.findById(customerId).orElseThrow();
        booking.setCustomer(c);
        booking.setStatus("CREATED");
        return repo.save(booking);
    }
    public List<ServiceBooking> getAll(){ return repo.findAll(); }
}
