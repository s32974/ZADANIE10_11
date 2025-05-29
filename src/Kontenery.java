public class Kontenery {

    private double MasaLadunku;
    private double Wysokosc;
    private double WagaWlasna;
    private double Glembokosc;
    private NumerSerujny NunerSeryjny;
    private double MaksymalnaLadownosc;

    public Kontenery(double MasaLadunku,double Wysokosc,double WagaWlasna,double Glembokosc,NumerSerujny NunerSeryjny) {


        this.MasaLadunku = MasaLadunku;
        this.Wysokosc = Wysokosc;
        this.WagaWlasna = WagaWlasna;
        this.Glembokosc = Glembokosc;
        this.NunerSeryjny = NunerSeryjny;
        this.MaksymalnaLadownosc = MasaLadunku;

    }

    public class OverfillException extends RuntimeException {
        public OverfillException() {
            super ();
        }
    }

    public void opruznienieLadunku() {
        //komunikat
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
