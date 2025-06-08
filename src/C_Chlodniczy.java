import java.util.HashMap;
import java.util.Map;

public class C_Chlodniczy extends Kontenery {
    private String rodzajProduktu;
    private double temperatura;

    public C_Chlodniczy(double masaLadunku, double wysokosc, double wagaWlasna, double glembokosc, double maksymalnaLadownosc, String rodzajProduktu, double temperatura) {
        super(masaLadunku, wysokosc, wagaWlasna, glembokosc, maksymalnaLadownosc, "C");
        this.rodzajProduktu = rodzajProduktu;
        this.temperatura = temperatura;
    }


    public void zaladunekKontenera(double materialLadowany, String rodzajLadowanego) {

        if (rodzajProduktu.equals(rodzajLadowanego)) {
            super.zaladunekKontenera(materialLadowany);
        } else if (rodzajProduktu.equals(null)) {
            super.zaladunekKontenera(materialLadowany);
            this.rodzajProduktu = rodzajLadowanego;
        } else {
            System.out.println("Błąd: Kontener nie morze przehowywać dwóch różnych produktów");
        }

    }


    Map<String,Double> temperaturyProduktow = new HashMap<>();;


    {
        temperaturyProduktow.put("Banany", 13.3);
        temperaturyProduktow.put("Czekolada", 18.0);
        temperaturyProduktow.put("Ryba", 2.0);
        temperaturyProduktow.put("Mięso", -15.0);
        temperaturyProduktow.put("Lody", -18.0);
        temperaturyProduktow.put("Mrorzona pizza", -30.0);
        temperaturyProduktow.put("Ser", 7.3);
        temperaturyProduktow.put("Kiełbasa", 5.0);
        temperaturyProduktow.put("Masło", 20.5);
        temperaturyProduktow.put("Jaja", 19.0);
    }

    // morzliwość wzbogacenia listy poza domyślne wartości
    public void nowyProdukt(String rodzaj, double temperatura) {
        temperaturyProduktow.put(rodzaj, temperatura);
    }

    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Rodzaj produktu: " + this.rodzajProduktu);
        System.out.println("Temperatura produktu: " + this.temperatura);
        System.out.println("------------------------------");
    }
}

