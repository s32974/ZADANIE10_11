import java.util.ArrayList;

public class Kontenery {
    // co potrzea w kontenerach
    private double MasaLadunku;
    private double Wysokosc;
    private double WagaWlasna;
    private double Glembokosc;
    private double MaksymalnaLadownosc;
    private int numerSeryjny;
    private String literka;


    public Kontenery(double MasaLadunku,double Wysokosc,double WagaWlasna,double Glembokosc,double MaksymalnaLadownosc, String literka) {
        this.MasaLadunku = MasaLadunku;
        this.Wysokosc = Wysokosc;
        this.WagaWlasna = WagaWlasna;
        this.Glembokosc = Glembokosc;
        this.MaksymalnaLadownosc = MaksymalnaLadownosc;
        this.literka = literka;

    }

    public void assignNumerSeryjny(int i){
        this.numerSeryjny = i+1;}

    // pozuskiwanie kodu kontenera
public String getKodKontrnera() {
        return ("KON-"+this.literka+"-"+this.numerSeryjny);
}



    public class OverfillException extends RuntimeException {
        public OverfillException() {
            super ();
        }
    }



    public void opruznienieLadunku() {
        System.out.print("Oprużniono kontener "+this.MasaLadunku+"kg");
        this.MasaLadunku=0;

    }


    public void zaladunekKontenera(double nowe) {

        if (this.MasaLadunku + nowe <= this.MaksymalnaLadownosc) {
            this.MasaLadunku = this.MasaLadunku + nowe;
        } else {
            throw new OverfillException();
        }


    }
}
