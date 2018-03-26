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
public class Kolo {
    
    Scanner input = new Scanner(System.in);
    
    double pi = 3.14;
    public String name = "Kolo";
    public double promien;
    public double pole;
    public double obwod;

    public Kolo(double promien,double pole,double obwod) {
        this.promien = promien;
        this.pole = pole;
        this.obwod = obwod;
    }
    
    public void wprDane(){
        System.out.println("Wybrales kolo.");
        System.out.println("Podaj promien: ");
        promien=input.nextDouble();
    }
    
    public void obliczenia(){
        pole=pi*promien*promien;
        obwod=2*pi*promien;
    }
    
    public void pokaWyn(){
        System.out.println("Dane wyjsciowe:");
        System.out.println("Nazwa: "+name);
        System.out.println("Promien: "+promien);
        System.out.println("Pole wynosi: "+pole);
        System.out.println("Obwod wynosi: "+obwod);
    }
    
    
}
