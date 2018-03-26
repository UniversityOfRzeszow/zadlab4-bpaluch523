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
public class Szescian {
    
    Scanner input = new Scanner(System.in);
    
    public String name = "Szescian";
    public double bok;
    public double pole;
    public double objetosc;

    public Szescian(double bok,double pole,double objetosc) {
        this.bok = bok;
        this.pole = pole;
        this.objetosc = objetosc;
    }
    
    public void wprDane(){
        System.out.println("Wybrales szescian.");
        System.out.println("Podaj dlugosc boku: ");
        bok=input.nextDouble();
    }
    
    public void obliczenia(){
        pole=6*bok*bok;
        objetosc=bok*bok*bok;
    }
    
    public void pokaWyn(){
        System.out.println("Dane wyjsciowe:");
        System.out.println("Nazwa: "+name);
        System.out.println("Dlugosc boku: "+bok);
        System.out.println("Pole wynosi: "+pole);
        System.out.println("Objetosc wynosi: "+objetosc);
    }
}
