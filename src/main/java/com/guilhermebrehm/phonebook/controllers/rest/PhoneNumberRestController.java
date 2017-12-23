package com.guilhermebrehm.phonebook.controllers.rest;

import com.guilhermebrehm.phonebook.models.PhoneNumber;
import com.guilhermebrehm.phonebook.services.phone_number.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PhoneNumberRestController {

    @Autowired
    PhoneNumberService phoneNumberService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<PhoneNumber>> findAll() {

        return new ResponseEntity<>(phoneNumberService.findAll(), HttpStatus.OK);
    }

}
