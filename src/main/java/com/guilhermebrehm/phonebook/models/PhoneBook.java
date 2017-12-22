package com.guilhermebrehm.phonebook.models;

import java.util.List;

public class PhoneBook {

    private List<PhoneNumber> contacts;

    public List<PhoneNumber> getContacts() {
        return contacts;
    }

    public void setContacts(List<PhoneNumber> contacts) {
        this.contacts = contacts;
    }
}
