package pl.edu.ur.polab4;

import pl.edu.ur.polab4.obliczanieFigur.Kolo;
import pl.edu.ur.polab4.obliczanieFigur.Kula;
import pl.edu.ur.polab4.obliczanieFigur.Kwadrat;
import pl.edu.ur.polab4.obliczanieFigur.Prostokat;
import pl.edu.ur.polab4.obliczanieFigur.Szescian;
import pl.edu.ur.polab4.obliczanieFigur.Prostopadloscian;
import pl.edu.ur.polab4.obliczanieFigur.Stozek;
import pl.edu.ur.polab4.wprowadzDane.Student;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        System.out.println("ZAD 4");
        System.out.println("Wybierz figure");
        System.out.println("1.Kolo");
        System.out.println("2.Kwadrat");
        System.out.println("3.Prostokat");
        System.out.println("4.Szescian");
        System.out.println("5.Prostopadloscian");
        System.out.println("6.Kula");
        System.out.println("7.Stozek");
        
        Scanner input = new Scanner(System.in);
        int wybor = input.nextInt();
        
        switch(wybor){
            case 1:
                Kolo kolo1 = new Kolo(0,0,0);
                kolo1.wprDane();
                kolo1.obliczenia();
                kolo1.pokaWyn();
                break;
            case 2:
                Kwadrat kwadrat1 = new Kwadrat(0,0,0);
                kwadrat1.wprDane();
                kwadrat1.obliczenia();
                kwadrat1.pokaWyn();
                break;
            case 3:
                Prostokat prostokat1 = new Prostokat(0,0,0,0);
                prostokat1.wprDane();
                prostokat1.obliczenia();
                prostokat1.pokaWyn();
                break;
            case 4:
                Szescian szescian1 = new Szescian(0,0,0);
                szescian1.wprDane();
                szescian1.obliczenia();
                szescian1.pokaWyn();
                break;
            case 5:
                Prostopadloscian prostop1 = new Prostopadloscian(0,0,0,0,0);
                prostop1.wprDane();
                prostop1.obliczenia();
                prostop1.pokaWyn();
                break;
            case 6:
                Kula kula1 = new Kula(0,0,0);
                kula1.wprDane();
                kula1.obliczenia();
                kula1.pokaWyn();
                break;
            case 7:
                Stozek stozek1 = new Stozek(0,0,0,0,0);
                stozek1.wprDane();
                stozek1.obliczenia();
                stozek1.pokaWyn();
                break;
            default:
                System.out.println("error(wybrano zly numer)");
        }
       //ZAD 5
       
       Student[] student = new Student[100];
       for(int i=0;i<100;i++){
           student[i]=new Student("","","",0,0);
       }
       
        System.out.println("ZAD 5");
        
        int n;
        do{
        System.out.println("Wybierz opcje:");
        System.out.println("1.Wprowadzanie danych studenta pod wybrany index tablicy");
        System.out.println("2.Nadpisanie danych studenta spod wybranego indeksu");
        System.out.println("3.Usuniecie danych studenta");
        System.out.println("4.Wyswietlenie obiektu o danym indeksie");
        System.out.println("5.Wyswietlenie wszystkich obiektow");
        System.out.println("6.Wyswietlenie zakresu obiektow");
        System.out.println("7.Exit");
        
        n = input.nextInt();
        int nr;
        switch(n){
            case 1:
                System.out.println("Podaj nr indexu do wprowadzenia danych: ");
                nr=input.nextInt();
                student[nr].wpisz_nadpisz();
                break;
            case 2:
                System.out.println("Podaj nr indexu do nadpisania danych: ");
                nr=input.nextInt();
                student[nr].wpisz_nadpisz();
                break;
            case 3:
                System.out.println("Podaj nr indexu do usuniecia danych: ");
                nr=input.nextInt();
                student[nr].usun_dane();
                break;
            case 4:
                System.out.println("Podaj nr indexu do wyswietlenia danych: ");
                nr=input.nextInt();
                student[nr].wyswietl();
                break;
            case 5:
                for(int i=0;i<100;i++){
                    student[i].wyswietl();
                }
                break;
            case 6:
                System.out.println("Podaj poczatkowy nr indexu zakresu wyswietlenia danych: ");
                int s=input.nextInt();
                System.out.println("Podaj koncowy nr indexu zakresu wyswietlenia danych: ");
                int k=input.nextInt();
                for(int i=s;i<=k;i++){
                    student[i].wyswietl();
                }
                break;
            case 7:
                break;
            default:
                System.out.println("error(wybrano zly numer");
        }
        }while(n!=7);
    }
    
}