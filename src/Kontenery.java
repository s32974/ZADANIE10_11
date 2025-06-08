import java.util.ArrayList;
import java.util.List;

public class Kontenery {

    private static int licznik = 0;
    public static List<Kontenery> wszystkieKontenery = new ArrayList<>();

    // co potrzea w kontenerach

    private double masaLadunku;
    private double wysokosc;
    private double wagaWlasna;
    private double glembokosc;
    protected double maksymalnaLadownosc;
    protected String numerSeryjny;


    public Kontenery(double masaLadunku, double wysokosc, double wagaWlasna, double glembokosc, double maksymalnaLadownosc, String typKontenera) {
        this.masaLadunku = masaLadunku;
        this.wysokosc = wysokosc;
        this.wagaWlasna = wagaWlasna;
        this.glembokosc = glembokosc;
        this.maksymalnaLadownosc = maksymalnaLadownosc;
        this.numerSeryjny = generujNumerSeryjny(typKontenera);
        System.out.println(numerSeryjny + " Został utworzony");
        wszystkieKontenery.add(this);
    }

    public String getNumerSeryjny() {
        return numerSeryjny;
    }

    public double masaCalkowita() {
        return (this.masaLadunku + this.wagaWlasna);
    }


    // generowanie kodu kontenera
    public String generujNumerSeryjny(String typKontenera) {
        licznik++;
        return "KON-" + typKontenera + "-" + licznik;
    }


    public void opruznienieLadunku() {
        System.out.println("Oprużniono kontener z " + this.masaLadunku + "kg ładumku");
        this.masaLadunku = 0.0;

    }


    public void zaladunekKontenera(double materialLadowany) {

        if (this.masaLadunku + materialLadowany <= this.maksymalnaLadownosc) {
            this.masaLadunku = this.masaLadunku + materialLadowany;
            System.out.println("Do kontenera dodano " + materialLadowany + " kg");
            System.out.println("Łącznie " + this.masaLadunku + "kg na " + this.maksymalnaLadownosc);
        } else {
            System.out.println(this.masaLadunku + materialLadowany + " > " + this.maksymalnaLadownosc);
            throw new OverfillException();
        }


    }


    public double getMasaLadunku() {
        return this.masaLadunku;
    }

    public void setMasaLadunku(double masaLadunku) {
        this.masaLadunku = masaLadunku;
    }


    public void wyswietlInfo() {
        System.out.println("INFO-kontener-----------------");
        System.out.println("Masa: " + this.masaLadunku);
        System.out.println("Wysokosc: " + this.wysokosc);
        System.out.println("Waga: " + this.wagaWlasna);
        System.out.println("Glembokosc: " + this.glembokosc);
        System.out.println("NumerSeryjny: " + this.numerSeryjny);
    }


    public static void wyswietlWszystkieKontenery() {
        for (Kontenery k : wszystkieKontenery) {
            System.out.println(k.numerSeryjny);
        }
    }
}