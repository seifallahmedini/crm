package com.crm.crm.controller;

import com.crm.crm.model.Contact;
import com.crm.crm.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactsController {

//    private final ContactRepository contactRepository;
//
//    @Autowired
//    public ContactsController(ContactRepository contactRepository) {
//        this.contactRepository = contactRepository;
//    }
//
//    @GetMapping("/contacts")
//    Collection<Contact> contacts() {
//        return (Collection<Contact>) contactRepository.findAll();
//    }
//
//    @PostMapping("/contacts")
//    ResponseEntity<Contact> createContact(@Valid @RequestBody Contact contact) throws URISyntaxException {
//        Contact result = contactRepository.save(contact);
//        return ResponseEntity.ok().body(result);
//    }
}
