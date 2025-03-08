package com.example.springaddressbook.AddressBook.repository;


import com.example.springaddressbook.AddressBook.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
