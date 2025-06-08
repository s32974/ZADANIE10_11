public class G_Gaz extends Kontenery implements IHazardNotifier {
    private double cisnienie;

    public G_Gaz(double masaLadunku, double wysokosc, double wagaWlasna, double glembokosc, double maksymalnaLadownosc, boolean czyNiebezpieczny) {
        super(masaLadunku, wysokosc, wagaWlasna, glembokosc, maksymalnaLadownosc, "G");
        this.cisnienie=cisnienie;
    }

    @Override
    public void opruznienieLadunku() {
        System.out.print("Oprużniono kontener z " + this.getMasaLadunku() * 0.95 + "kg ładumku");
        this.setMasaLadunku( this.getMasaLadunku() * 0.05);
    }

    @Override
    public void wykrytoHazard(String numerSeryjny) {
        System.out.println("Błąd: Styuacja niebezpieczna w kontenerze: " + numerSeryjny);
    }

    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.print("Cisnienie: "+cisnienie);
    }
}

