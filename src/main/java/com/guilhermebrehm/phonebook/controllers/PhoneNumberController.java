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

    @RequestMapping(method = RequestMethod.GET, value = "by_name/{name}")
    public String getPhoneNumbersByName(Model model, @PathVariable("name") String name) {

        model.addAttribute("phone_numbers", phoneNumberService.searchByName(name));

        return "phonenumbers";
    }

    @RequestMapping(method = RequestMethod.GET, value = "by_number/{number}")
    public String getPhoneNumbersByNumber(Model model, @PathVariable("number") String number) {

        model.addAttribute("phone_numbers", phoneNumberService.searchByPhoneNumber(number));

        return "phonenumbers";
    }

    @RequestMapping(method = RequestMethod.GET, value = "by_address/{address}")
    public String getPhoneNumbersByAddress(Model model, @PathVariable("address") String address) {

        model.addAttribute("phone_numbers", phoneNumberService.searchByAddress(address));

        return "phonenumbers";
    }

}
