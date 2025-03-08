package com.example.springaddressbook.AddressBook.service;


import com.example.springaddressbook.AddressBook.model.Contact;
import com.example.springaddressbook.AddressBook.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact updateContact(Long id, Contact newContact) {
        return contactRepository.findById(id).map(contact -> {
            contact.setName(newContact.getName());
            contact.setEmail(newContact.getEmail());
            contact.setPhone(newContact.getPhone());
            return contactRepository.save(contact);
        }).orElseThrow(() -> new RuntimeException("Contact not found"));
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
