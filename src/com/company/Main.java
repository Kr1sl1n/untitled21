package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Person johnSmith = new Person("John Smith");
       //cmd+alt+V to create a variable
       Person sarahConnor = new Person("Sarah Connor");

       johnSmith.setFirstName("patrick");
        System.out.println(johnSmith.getFirstName());


       System.out.println(sarahConnor.getFullName());



    }
}
