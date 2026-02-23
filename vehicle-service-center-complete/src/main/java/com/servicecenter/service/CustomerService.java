package com.servicecenter.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import com.servicecenter.repository.CustomerRepository;
import com.servicecenter.entity.Customer;

@Service @RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repo;
    public Customer save(Customer c){ return repo.save(c); }
    public List<Customer> getAll(){ return repo.findAll(); }
}
