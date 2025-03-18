package com.example.SpringAddressBookApp.repository;

import com.example.SpringAddressBookApp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
