package org.example;

public class Wall {
// instance variable
double width;
double height;

// constructor eklendi 2 parametre de set edildi.
public Wall(double width, double height){
    this.width = width;
    this.height = height;
}

// Wall sınıfı içerisine 5 tane metod ekleyiniz.
// * ```getWidth``` => width değerini dönmeli
// * ```getHeight``` => height değerini dönmeli.


 public double getWidth(){
    return this.width;
 }
 public  double getHeight(){
    return this.height;
 }
 // * ```setWidth``` => bir parametre almalı ve aldığı parametreyi width değerine eşitlemeli. Gelen parametre 0'dan küçükse, width değerini 0'a eşitlemeli.
// * ```setHeight``` => bir parametre almalı ve aldığı parametreyi height değerine eşitlemeli. Gelen parametre 0'dan küçükse, height değerini 0'a eşitlemeli.
// * ```getArea``` => hiçbir parametre almamalı ve ```width*height``` değerini dönmeli.

 public void setWidth(double width){
    this.width = width < 0 ? 0 : width;
 }

 public void  setHeight(double height) {
    this.height = height < 0 ? 0 : height;
 }

 public double getArea() {
  return this.height * this.width;
 }
}
