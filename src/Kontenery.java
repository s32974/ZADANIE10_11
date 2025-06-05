import java.util.ArrayList;

public class Kontenery {
    // co potrzea w kontenerach
    private double masaLadunku;
    private double wysokosc;
    private double wagaWlasna;
    private double glembokosc;
    private double maksymalnaLadownosc;
    private int numerSeryjny;
    private String literka;
    private String info;


    public Kontenery(double masaLadunku,double wysokosc,double wagaWlasna,double glembokosc,double maksymalnaLadownosc, String literka, String info) {
        this.masaLadunku = masaLadunku;
        this.wysokosc = wysokosc;
        this.wagaWlasna = wagaWlasna;
        this.glembokosc = glembokosc;
        this.maksymalnaLadownosc = maksymalnaLadownosc;
        this.literka = literka;
        this.info = info;

    }




    public void assignNumerSeryjny(int i){
        this.numerSeryjny = i+1;}

    // pozuskiwanie kodu kontenera

    public String getKodKontrnera() {
        return ("KON-"+this.literka+"-"+this.numerSeryjny);
    }




    public void opruznienieLadunku() {
        System.out.print("Oprużniono kontener z "+this.masaLadunku+"kg");
        this.masaLadunku=0.0;

    }


    public void zaladunekKontenera(double materialLadowany) {

        if (this.masaLadunku + materialLadowany <= this.maksymalnaLadownosc) {
            this.masaLadunku = this.masaLadunku + materialLadowany;
        } else {
            throw new OverfillException();
        }


    }



}
