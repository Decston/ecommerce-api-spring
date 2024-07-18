package com.ecommerce.dimensao.controller;

import com.ecommerce.dimensao.controller.dto.CustomerDTO;
import com.ecommerce.dimensao.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerRepository customerRepository;


    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping()
    public List<CustomerDTO> findAll() {
        var customers = customerRepository.findAll();
        return customers
                .stream()
                .map(CustomerDTO::converter)
                .collect(Collectors.toList());
    }

}
