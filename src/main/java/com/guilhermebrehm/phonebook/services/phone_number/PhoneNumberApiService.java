package com.guilhermebrehm.phonebook.services.phone_number;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.guilhermebrehm.phonebook.models.PhoneNumber;
import com.guilhermebrehm.phonebook.models.PhoneBook;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class PhoneNumberApiService implements PhoneNumberService {

    @Override
    public List<PhoneNumber> findAll() {

        ObjectMapper mapper = new ObjectMapper();

        PhoneBook phoneBook = null;

        try {
            phoneBook = mapper.readValue(new URL("http://www.mocky.io/v2/581335f71000004204abaf83"), PhoneBook.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return phoneBook.getContacts();
    }

    @Override
    public List<PhoneNumber> searchByName(String name) {

        List<PhoneNumber> phoneNumbersWithName = new LinkedList<>();

        for (PhoneNumber phoneNumber : findAll()) {

            if (phoneNumber.getName().toLowerCase().contains(name.toLowerCase())) {

                phoneNumbersWithName.add(phoneNumber);
            }

        }

        return phoneNumbersWithName;
    }

    @Override
    public List<PhoneNumber> searchByPhoneNumber(String number) {

        List<PhoneNumber> phoneNumbersWithNumber = new LinkedList<>();

        for (PhoneNumber phoneNumber : findAll()) {

            if (phoneNumber.getPhone_number().equalsIgnoreCase(number)) {

                phoneNumbersWithNumber.add(phoneNumber);
            }
        }

        return phoneNumbersWithNumber;
    }

    @Override
    public List<PhoneNumber> searchByAddress(String address) {

        List<PhoneNumber> phoneNumbersWithAddress = new LinkedList<>();

        for (PhoneNumber phoneNumber : findAll()) {

            if (phoneNumber.getAddress().toLowerCase().contains(address.toLowerCase())) {

                phoneNumbersWithAddress.add(phoneNumber);
            }

        }

        return phoneNumbersWithAddress;
    }

}
