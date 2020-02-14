package com.eum602.protobuf;

import person.PersonOuterClass.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

        Person personInstance = builder.build();

        //Writing the protocol buffer binary to a file
        try {
            FileOutputStream outputStream = new FileOutputStream("person-message.bin"); //creating a binary file
            personInstance.writeTo(outputStream);
            outputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
