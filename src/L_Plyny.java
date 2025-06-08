public class L_Plyny extends Kontenery implements IHazardNotifier {
    private boolean czyNiebezpieczny;

    public L_Plyny(double masaLadunku, double wysokosc, double wagaWlasna, double glembokosc, double maksymalnaLadownosc, boolean czyNiebezpieczny) {
        super(masaLadunku, wysokosc, wagaWlasna, glembokosc, maksymalnaLadownosc, "L");
        this.czyNiebezpieczny = czyNiebezpieczny;
    }

    @Override
    public void zaladunekKontenera(double materialLadowany) {
        if (czyNiebezpieczny = false) {
            //90%
            if (this.getMasaLadunku() + materialLadowany <= this.maksymalnaLadownosc*0.9) {
                this.setMasaLadunku(this.getMasaLadunku() + materialLadowany);
                System.out.print("Do kontenera dodano " + materialLadowany + "kg");
                System.out.print("Łącznie " + this.getMasaLadunku() + "kg / " + this.maksymalnaLadownosc);
            } else {
                wykrytoHazard(numerSeryjny);
            }
        } else {
            //50%
            if (this.getMasaLadunku() + materialLadowany <= this.maksymalnaLadownosc*0.5) {
                this.setMasaLadunku(this.getMasaLadunku() + materialLadowany);
                System.out.print("Do kontenera dodano " + materialLadowany + "kg");
                System.out.print("Łącznie " + this.getMasaLadunku() + "kg / " + this.maksymalnaLadownosc);
            } else {
                wykrytoHazard(numerSeryjny);
            }
        }
    }

    @Override
    public void wykrytoHazard(String numerSeryjny) {
        System.out.println("Błąd: Pruba przepełnienia kontenera: "+numerSeryjny+" powyrzej bezpiecznego limitu.");
    }
}



