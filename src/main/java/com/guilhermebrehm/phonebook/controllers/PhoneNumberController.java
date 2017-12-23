package com.guilhermebrehm.phonebook.controllers;

import com.guilhermebrehm.phonebook.services.phone_number.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by codecadet on 11/12/2017.
 */
@Controller
@RequestMapping(value = "/")
public class PhoneNumberController {

    @Autowired
    private PhoneNumberService phoneNumberService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPhoneNumbers(Model model) {

        model.addAttribute("phone_numbers", phoneNumberService.findAll());

        return "phonenumbers";
    }

}
