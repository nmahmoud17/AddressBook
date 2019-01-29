package com.company;

public class PersonInformation {
    private String name;
    private int phoneNumber;
    private String address;
    private int birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public PersonInformation(String name, int phoneNumber, String address, int birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.birthday = birthday;
    }

    public void printDetails() {
        System.out.println("First name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Birthday: " + birthday);
    }

}
