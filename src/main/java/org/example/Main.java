package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");

 // main metodu içerisinde çağırımlar yapabilmelisin.

 Person person1 = new Person("Turgay","DEMİREL", 32);

 System.out.println("FirstName: " + person1.getFirstName());

 System.out.println("lastName: " + person1.getLastName());

 System.out.println("Age: " + person1.getAge());

 System.out.println("IsTeen: " + person1.isTeen());

 System.out.println("***************************************");

 Wall wall = new Wall(5,4);
 System.out.println("area= " + wall.getArea());
 wall.setHeight(-1.5);
 System.out.println("width= " + wall.getWidth());
 System.out.println("height= " + wall.getHeight());
 System.out.println("area= " + wall.getArea());
    }
}
