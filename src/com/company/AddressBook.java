package com.company;

import java.util.Scanner;

public class AddressBook {
    static Scanner myScanner = new Scanner (System.in);

    public static void main(String[] args) {

        AddressBookOptions myOptions = new AddressBookOptions();

        boolean running = true;
        int userInput = 0;

        do {
            System.out.println("Welcome to your Address Book, please choose one of the following options:");
            System.out.println("1. View your current entries");
            System.out.println("2. Add a Person");
            System.out.println("3. Search Person by Name");
            System.out.println("4. Search Person by Number");
            System.out.println("5. Delete a Person");
            System.out.println("6. Exit!");

            userInput = myScanner.nextInt();
            myScanner.nextLine();

            switch (userInput) {

                case 1: //View All Entries

                    for (AddressBook i: myOptions) {


                    }

                case 2: //Add Person
                    PersonInformation myPersonsInfo = new PersonInformation(getStringAnswer("What is the person's name you'd like to add?"),
                            getIntAnswer("Enter their phone number:  "),
                                    getStringAnswer("Enter their address: "),
                                            getIntAnswer("Enter their birthday: "));

                    myOptions.addPerson(myPersonsInfo);


                case 3: //Search Person by Name

                case 4: //search by #

                case 5: //delete

                case 6: //Exit
                    System.out.println("Thanks for using your Address Book!");
                    running = false;
                    break;


            }

        } while (running);
    }

    public static String getStringAnswer (String question) {
        System.out.println(question);
        return myScanner.nextLine();
    }


    public static int getIntAnswer (String question) {
        int input;
        System.out.println(question);
        input = myScanner.nextInt();
        myScanner.nextLine();
        return input;

    }

}
