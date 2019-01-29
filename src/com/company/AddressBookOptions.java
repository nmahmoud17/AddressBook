package com.company;

public class AddressBookOptions {

    PersonInformation[] allPersons = new PersonInformation[3];

    public void addPerson (PersonInformation person) {
        for (int i = 0; i < allPersons.length; i++) {
            if (allPersons[i] == null) {
                allPersons[i] = person;
                break;
            }
        }

    }



}
