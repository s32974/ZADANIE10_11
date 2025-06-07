import java.util.ArrayList;

public class Kontenery {

    private static int licznik = 0;

    // co potrzea w kontenerach

    private double masaLadunku;
    private double wysokosc;
    private double wagaWlasna;
    private double glembokosc;
    private double maksymalnaLadownosc;
    private String numerSeryjny;


    public Kontenery(double masaLadunku, double wysokosc, double wagaWlasna, double glembokosc, double maksymalnaLadownosc,String typKontenera) {
        this.masaLadunku = masaLadunku;
        this.wysokosc = wysokosc;
        this.wagaWlasna = wagaWlasna;
        this.glembokosc = glembokosc;
        this.maksymalnaLadownosc = maksymalnaLadownosc;
        this.numerSeryjny = generujNumerSeryjny(typKontenera);
        System.out.println(numerSeryjny + "Został utworzony");
    }

    // generowanie kodu kontenera
    public String generujNumerSeryjny(String typKontenera) {
        licznik++;
        return "KON-" + typKontenera + "-" + licznik;
    }


    public void opruznienieLadunku() {
        System.out.print("Oprużniono kontener z " + this.masaLadunku + "kg ładumku");
        this.masaLadunku = 0.0;

    }


    public void zaladunekKontenera(double materialLadowany) {

        if (this.masaLadunku + materialLadowany <= this.maksymalnaLadownosc) {
            this.masaLadunku = this.masaLadunku + materialLadowany;
            System.out.print("Do kontenera dodano "+materialLadowany+"kg");
            System.out.print("Łącznie "+this.masaLadunku+"kg / "+this.maksymalnaLadownosc);
        } else {
            throw new OverfillException();
        }


    }


}
