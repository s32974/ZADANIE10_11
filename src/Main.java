
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        C_Chlodniczy kontener1 = new C_Chlodniczy(52, 50, 25, 40, 100, "Czekolada", 2);

        L_Plyny kontener2 = new L_Plyny(24, 200, 50, 600, 200, true);

        G_Gaz kontener3 = new G_Gaz(130, 220, 110, 60, 250, 400);


        Statek statek1 = new Statek(160, 50, 280);

        Statek statek2 = new Statek(140, 70, 200);

        Statek statek3 = new Statek(150, 100, 150);

        Statek statek4 = new Statek(100, 2, 150);


        kontener1.wyswietlInfo();
        kontener1.zaladunekKontenera(30, "Czekolada");
        kontener1.wyswietlInfo();

        statek1.wyswietlInfo();
        statek1.zaladujKontener(kontener1);
        statek1.zaladujKontener(kontener2);
        statek1.wyswietlInfo();

        kontener1.opruznienieLadunku();

        statek1.zastompKontener(kontener1, kontener3);
        //---------------------------------------
*/


        menu();

    }

    public static void menu() {

        System.out.println("Lista statków:");
        Kontenery.wyswietlWszystkieKontenery();
        System.out.println();
        System.out.println("Lista Kontenerów:");
        Statek.wyswietlWszystkieStatki();
        System.out.println();
        menuObcji();
        skaner();
    }


    private static void menuObcji() {
        System.out.println("Możliwe akcje:");
        System.out.println("1. Dodaj kontenerowiec");
        System.out.println("2. Dodaj kontener");

        if (Kontenery.wszystkieKontenery.size() > 0) {
            System.out.println("3. Usuń kontener");
        }
        if (Statek.wszystkieStatki.size() > 0) {
            System.out.println("4. Usuń statek");
        }

    }

    private static void skaner() {
        Scanner dana = new Scanner(System.in);
        if (dana.equals(1)) {
          

        } else if (dana.equals(2)) {

            
        } else if (dana.equals(3)) {

        }else if (dana.equals(4)) {
            
        } else if (dana.equals(5)) {
            
        } else if (dana.equals(6)) {
            
        }


    }

}
