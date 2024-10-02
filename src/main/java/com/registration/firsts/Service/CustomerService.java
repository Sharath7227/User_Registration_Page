package com.registration.firsts.Service;
import com.registration.firsts.Repository.UserRepository;
import com.registration.firsts.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final UserRepository customerRepository;

    @Autowired
    public CustomerService(UserRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Method to generate a unique userId based on the existing customers
    public String generateUserId() {
        // Get the count of existing customers
        long customerCount = customerRepository.count();

        // Generate userId based on count and prefix "Mag"
        return String.format("Mag%03d", customerCount + 1);
    }

    public void saveCustomer(User user) {
        // Set the custom userId before saving
        user.setUserId(generateUserId());
        customerRepository.save(user);
    }

    // Other service methods...
}
