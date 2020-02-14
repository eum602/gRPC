package com.eum602.protobuf;

import person.PersonOuterClass.Person;

import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello world");
        //simple fields
        Person.Builder builder = Person.newBuilder();
        builder.setAge(42)
                .setFirstName("John")
                .setLastName("Doe");

        //assigning phone numbers ==> multiple values
        builder.addPhoneNumbers("123456")
                .addPhoneNumbers("98523567")
                .addPhoneNumbers("92525464")
                .addAllPhoneNumbers(Arrays.asList("234","456789"));

        System.out.println("Setting repeated values by using indexes");
        builder.setPhoneNumbers(2,"456789");//based index zero ==> so edits the third value of phone numbers

        System.out.println("Printing all values in the builder");
        System.out.println(builder.toString());
    }
}
