package com.guilhermebrehm.phonebook.services.phone_number;

import com.guilhermebrehm.phonebook.models.PhoneNumber;

import java.util.List;

public interface PhoneNumberService {

    public List<PhoneNumber> findAll();

    public List<PhoneNumber> searchByName(String name);

    public List<PhoneNumber> searchByPhoneNumber(String number);

    public List<PhoneNumber> searchByAddress(String address);
}
