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
public class Prostokat {
    
    Scanner input = new Scanner(System.in);
    
    public String name = "Prostokat";
    public double boka;
    public double bokb;
    public double pole;
    public double obwod;

    public Prostokat(double boka,double bokb, double pole,double obwod) {
        this.boka = boka;
        this.bokb = bokb;
        this.pole = pole;
        this.obwod = obwod;
    }
    
    public void wprDane(){
        System.out.println("Wybrales prostokat.");
        System.out.println("Podaj dlugosc pierwszego boku: ");
        boka=input.nextDouble();
        System.out.println("Podaj dlugosc drugiego boku: ");
        bokb=input.nextDouble();
    }
    
    public void obliczenia(){
        pole=boka*bokb;
        obwod=2*boka+2*bokb;
    }
    
    public void pokaWyn(){
        System.out.println("Dane wyjsciowe:");
        System.out.println("Nazwa: "+name);
        System.out.println("Dlugosc pierwszego boku: "+boka);
        System.out.println("Dlugosc drugiego boku: "+bokb);
        System.out.println("Pole wynosi: "+pole);
        System.out.println("Obwod wynosi: "+obwod);
    }
}
