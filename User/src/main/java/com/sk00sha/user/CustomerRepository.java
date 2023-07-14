package com.sk00sha.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<User,Integer> {
}
