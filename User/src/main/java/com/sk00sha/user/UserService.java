package com.sk00sha.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public record UserService(CustomerRepository customerRepository) {
    public void registerUser(UserRequest userRegRequest){
        User user = User.builder().
                firstName(userRegRequest.firstName())
                .lastName(userRegRequest.lastName())
                .email(userRegRequest.email()).build();

        customerRepository.save(user);

    }

}
