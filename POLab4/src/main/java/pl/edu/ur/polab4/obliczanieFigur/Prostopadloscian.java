/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;
import java.util.Scanner;
/**
 *
 * @author Bartek
 */
public class Prostopadloscian {
    
    Scanner input = new Scanner(System.in);
    
    public String name = "Prostopadloscian";
    public double bok1;
    public double bok2;
    public double h;
    public double pole;
    public double objetosc;

    public Prostopadloscian(double bok1,double bok2,double h,double pole,double objetosc) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.h = h;
        this.pole = pole;
        this.objetosc = objetosc;
    }
    
    public void wprDane(){
        System.out.println("Wybrales prostopadloscian.");
        System.out.println("Podaj dlugosc pierwszego boku: ");
        bok1=input.nextDouble();
        System.out.println("Podaj dlugosc drugiego boku: ");
        bok2=input.nextDouble();
        System.out.println("Podaj dlugosc wysokosci: ");
        h=input.nextDouble();
    }
    
    public void obliczenia(){
        pole=2*(bok1*bok2+bok1*h+bok2*h);
        objetosc=bok1*bok2*h;
    }
    
    public void pokaWyn(){
        System.out.println("Dane wyjsciowe:");
        System.out.println("Nazwa: "+name);
        System.out.println("Dlugosc pierwszego boku: "+bok1);
        System.out.println("Dlugosc drugiego boku: "+bok2);
        System.out.println("Dlugosc wysokosci: "+h);
        System.out.println("Pole wynosi: "+pole);
        System.out.println("Objetosc wynosi: "+objetosc);
    }
}
