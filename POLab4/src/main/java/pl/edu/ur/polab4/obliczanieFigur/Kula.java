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
public class Kula {
    
    Scanner input = new Scanner(System.in);
    
    double pi = 3.14;
    public String name = "Kula";
    public double promien;
    public double pole;
    public double objetosc;

    public Kula(double promien,double pole,double objetosc) {
        this.promien = promien;
        this.pole = pole;
        this.objetosc = objetosc;
    }
    
    public void wprDane(){
        System.out.println("Wybrales kule.");
        System.out.println("Podaj promien: ");
        promien=input.nextDouble();
    }
    
    public void obliczenia(){
        pole=4*pi*promien*promien;
        objetosc=4/3*pi*promien*promien*promien;
    }
    
    public void pokaWyn(){
        System.out.println("Dane wyjsciowe:");
        System.out.println("Nazwa: "+name);
        System.out.println("Promien: "+promien);
        System.out.println("Pole wynosi: "+pole);
        System.out.println("Objetosc wynosi: "+objetosc);
    }
}
