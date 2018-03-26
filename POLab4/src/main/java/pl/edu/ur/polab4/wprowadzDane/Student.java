/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;
import java.util.Scanner;
/**
 *
 * @author Bartek
 */
public class Student {
    
    Scanner input = new Scanner(System.in);
    
    public String imie;
    public String nazwisko;
    public String spec;
    public int nr_indeksu;
    public int rok;

    public Student(String imie, String nazwisko, String spec, int nr_indeksu, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.spec = spec;
        this.nr_indeksu = nr_indeksu;
        this.rok = rok;
    }
    
    public void wpisz_nadpisz(){
        System.out.println("Nowe imie: ");
        this.imie=input.next();
        System.out.println("Nowe nazwisko: ");
        this.nazwisko=input.next();
        System.out.println("Nowa nazwa specjalnosci: ");
        this.spec=input.next();
        System.out.println("Nowy numer indeksu: ");
        this.nr_indeksu=input.nextInt();
        System.out.println("Rok studiow: ");
        this.rok=input.nextInt();
    }
    
    public void usun_dane(){
        this.imie = "";
        this.nazwisko = "";
        this.spec = "";
        this.nr_indeksu = 0;
        this.rok = 0;
    }
    
    public void wyswietl(){
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Specjalnosc: "+spec);
        System.out.println("Nr indeksu: "+nr_indeksu);
        System.out.println("Rok studiow: "+rok);
        System.out.println("-----------");
    }
    
}
