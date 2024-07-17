package com.bank.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.management.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
