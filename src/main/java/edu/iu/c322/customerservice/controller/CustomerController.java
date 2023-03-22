package edu.iu.c322.customerservice.controller;

import edu.iu.c322.customerservice.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public List<Customer> findAll() {
        return null;
    }

    @PostMapping
    public int create(@RequestBody Customer customer) {
        return 0;
    }
}
