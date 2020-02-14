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
        builder.addPhoneNumbers("123456");
        builder.addPhoneNumbers("98523567");
        builder.addPhoneNumbers("92525464");
    }
}
