package org.example;

public class Person { // person sınıf class demek
    // intance variable 6 tane
    String firstName;
    String lastName;
    int age;

    String dogumYeri;
    double boy;
    double kilo;

   //constructor yazmak alttaki gibi

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String dogumYeri, double boy, double kilo){
        this(firstName,lastName,age);
        this.dogumYeri = dogumYeri;
        this.kilo = kilo;
        this.boy = boy;
    }
    // metod tanımlamak
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age >= 13 && this.age <= 19;
    }
}
