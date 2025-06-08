import java.util.ArrayList;
import java.util.List;


public class Statek {

    private List<Kontenery> przeworzoneKontenery;
    private int prendkosc;
    private int maxKontenerow;
    private int maxWagaPrzewozu;


    public Statek(int prendkoscint, int maxKontenerow, int maxWagaPrzewozu) {

        this.przeworzoneKontenery = new ArrayList<>();
        this.prendkosc = prendkoscint;
        this.maxKontenerow = maxKontenerow;
        this.maxWagaPrzewozu = maxWagaPrzewozu;

    }


    public void zaladujKontener(Kontenery kontener) {
        if (przeworzoneKontenery.size() < maxKontenerow) {
            double przeworzoneKontenerySuma = 0;
            for (Kontenery k : przeworzoneKontenery) {
                przeworzoneKontenerySuma = przeworzoneKontenerySuma + Kontenery.masaCalkowita();
            }
            double suma = Kontenery.masaCalkowita() + przeworzoneKontenerySuma;
            if (maxWagaPrzewozu < suma + przeworzoneKontenerySuma) {
                przeworzoneKontenery.add(kontener);
            } else {
                System.out.println("Błąd: Nie udało się załadować kontenera na statek bo została by przekroczoa mksymalna waga przewozu danego statku");
            }
        } else {
            System.out.println("Błąd: Nie udało się załadować kontenera na statek bo została by przekroczoa mksymalna lczba kontenerów na statku");
        }
    }


    public void usunKontener(Kontenery kontener) {
        przeworzoneKontenery.remove(kontener);
    }

    public void zastompKontener(Kontenery kontenerStary, Kontenery kontenerNowy) {
        usunKontener(kontenerStary);
        zaladujKontener(kontenerNowy);
    }

    public void zamianaKontenerow(Statek statek1, Statek statek2, Kontenery kontener1, Kontenery kontener2) {


        //????????????????????


    }

    public void wyswietlInfo() {
        System.out.println("Max prędkość statku " + prendkosc + " węzłów");
        System.out.println("Max kontenerów " + maxKontenerow);
        System.out.println("Mzx Waga przewozu " + maxWagaPrzewozu + " ton");
        System.out.println("Kontenerowiec przewozi:");
        for (Kontenery k : przeworzoneKontenery) {
            System.out.println(k);
        }
    }
}


