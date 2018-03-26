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
public class Kwadrat {
    
    Scanner input = new Scanner(System.in);
    
    public String name = "Kwadrat";
    public double bok;
    public double pole;
    public double obwod;

    public Kwadrat(double bok,double pole,double obwod) {
        this.bok = bok;
        this.pole = pole;
        this.obwod = obwod;
    }
    
    public void wprDane(){
        System.out.println("Wybrales kwadrat.");
        System.out.println("Podaj dlugosc boku: ");
        bok=input.nextDouble();
    }
    
    public void obliczenia(){
        pole=bok*bok;
        obwod=4*bok;
    }
    
    public void pokaWyn(){
        System.out.println("Dane wyjsciowe:");
        System.out.println("Nazwa: "+name);
        System.out.println("Dlugosc boku: "+bok);
        System.out.println("Pole wynosi: "+pole);
        System.out.println("Obwod wynosi: "+obwod);
    }
}
