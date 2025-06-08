import java.util.ArrayList;
import java.util.List;


public class Statek {
    public static List<Statek> wszystkieStatki = new ArrayList<>();

    private List<Kontenery> przeworzoneKontenery;
    private int prendkosc;
    private int maxKontenerow;
    private int maxWagaPrzewozu;

    public Statek(int prendkoscint, int maxKontenerow, int maxWagaPrzewozu) {

        this.przeworzoneKontenery = new ArrayList<>();
        this.prendkosc = prendkoscint;
        this.maxKontenerow = maxKontenerow;
        this.maxWagaPrzewozu = maxWagaPrzewozu;
        wszystkieStatki.add(this);

    }


    public int getMaxKontenerow() {
        return maxKontenerow;
    }

    public int getMaxWagaPrzewozu() {
        return maxWagaPrzewozu;
    }

    public int getPrendkosc() {
        return prendkosc;
    }

    public void zaladujKontener(Kontenery kontener) {
        if (przeworzoneKontenery.size() < this.maxKontenerow) {
            double przeworzoneKontenerySuma = 0;
            for (Kontenery k : przeworzoneKontenery) {
                przeworzoneKontenerySuma = przeworzoneKontenerySuma + kontener.masaCalkowita();
            }
            double suma = kontener.masaCalkowita() + przeworzoneKontenerySuma;
            if (this.maxWagaPrzewozu > suma + przeworzoneKontenerySuma) {
                przeworzoneKontenery.add(kontener);
                System.out.println("Pomyślnie załadokwano kontener: " + kontener.numerSeryjny + " na statek.");
            } else {
                System.out.println("Błąd: Nie udało się załadować kontenera: " + kontener.numerSeryjny + " na statek bo została by przekroczoa mksymalna waga przewozu danego statku.");
                System.out.println(this.maxWagaPrzewozu + " < " + (przeworzoneKontenerySuma + suma));
            }
        } else {
            System.out.println("Błąd: Nie udało się załadować kontenera: " + kontener.numerSeryjny + " na statek bo została by przekroczoa mksymalna lczba kontenerów na statku.");
            System.out.println(przeworzoneKontenery.size() + " < " + this.maxKontenerow);
        }
    }


    public void usunKontener(Kontenery kontener) {
        przeworzoneKontenery.remove(kontener);
        System.out.println("Usunięto kontener: " + kontener.numerSeryjny);
    }

    public void zastompKontener(Kontenery kontenerStary, Kontenery kontenerNowy) {
        usunKontener(kontenerStary);
        zaladujKontener(kontenerNowy);
    }

    //----------------------------------------
    public void zamianaKontenerow(Kontenery kontenerStary, Kontenery kontenerNowy) {
        usunKontener2(kontenerStary);
        zaladujKontener2(kontenerNowy);
    }

    public void usunKontener2(Kontenery kontener) {
        przeworzoneKontenery.remove(kontener);
    }

    public void zaladujKontener2(Kontenery kontener) {

        double przeworzoneKontenerySuma = 0;
        for (Kontenery k : przeworzoneKontenery) {
            przeworzoneKontenerySuma = przeworzoneKontenerySuma + kontener.masaCalkowita();
        }
        double suma = kontener.masaCalkowita() + przeworzoneKontenerySuma;
        if (maxWagaPrzewozu < suma + przeworzoneKontenerySuma) {
            przeworzoneKontenery.add(kontener);
        } else {
            System.out.println("Błąd: Nie udało się załadować kontenera: " + kontener.numerSeryjny + " na statek bo została by przekroczoa mksymalna waga przewozu danego statku");
        }
    }
    //------------------------------------


    public void wyswietlInfo() {
        System.out.println("INFO-statek------------------------------------");
        System.out.println("Max prędkość statku " + this.prendkosc + " węzłów");
        System.out.println("Max kontenerów " + this.maxKontenerow);
        System.out.println("Max Waga przewozu " + this.maxWagaPrzewozu + " ton");
        System.out.println("Kontenerowiec przewozi:");
        for (Kontenery k : przeworzoneKontenery) {
            System.out.println(k.numerSeryjny);
        }
        System.out.println("-----------------------------------------------");
    }

    public static void wyswietlWszystkieStatki() {
        int i = 1;
        for (Statek s : wszystkieStatki) {
            System.out.println("Statek " + i++ );
        }
    }
}



