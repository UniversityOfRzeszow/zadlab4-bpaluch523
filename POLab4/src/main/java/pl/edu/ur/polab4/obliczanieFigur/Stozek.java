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
public class Stozek {
    
    Scanner input = new Scanner(System.in);
    
    double pi = 3.14;
    public String name = "Stozek";
    public double promien;
    public double tworzaca;
    public double h;
    public double pole;
    public double objetosc;

    public Stozek(double promien,double tworzaca,double h,double pole,double objetosc) {
        this.promien = promien;
        this.tworzaca = tworzaca;
        this.h = h;
        this.pole = pole;
        this.objetosc = objetosc;
    }
    
    public void wprDane(){
        System.out.println("Wybrales stozek.");
        System.out.println("Podaj promien: ");
        promien=input.nextDouble();
        System.out.println("Podaj dlugosc tworzacej: ");
        tworzaca=input.nextDouble();
        System.out.println("Podaj dlugosc wysokosci: ");
        h=input.nextDouble();
    }
    
    public void obliczenia(){
        pole=(pi*promien*promien)+(pi*promien*tworzaca);
        objetosc=(pi*promien*promien*h)/3;
    }
    
    public void pokaWyn(){
        System.out.println("Dane wyjsciowe:");
        System.out.println("Nazwa: "+name);
        System.out.println("Dlugosc promienia: "+promien);
        System.out.println("Dlugosc tworzacej: "+tworzaca);
        System.out.println("Dlugosc wysokosci: "+h);
        System.out.println("Pole wynosi: "+pole);
        System.out.println("Objetosc wynosi: "+objetosc);
    }
}
