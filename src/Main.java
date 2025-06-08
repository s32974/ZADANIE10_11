
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Kontenery kontener1 = new Kontenery(52, 50, 25, 40, 100, "C");

        Kontenery kontener2 = new Kontenery(123.6, 200, 100, 600, 200, "L");

        Kontenery Kontener3 = new Kontenery(123.6, 200, 100, 600, 200, "G");


        Statek statek1 = new Statek(120,50,120);

        Statek statek2 = new Statek(140,70,200);

        Statek statek3 = new Statek(150,100,15);

        Statek statek4 = new Statek(100,2,150);



        statek2.zaladujKontener(kontener2);
        statek1.zaladujKontener(kontener1);

        statek2.wyswietlInfo();
        statek1.wyswietlInfo();

        //zamiana konteneró nadwóch stakach
        statek2.zastompKontener(kontener2,kontener1);
        statek1.zastompKontener(kontener1,kontener2);

        statek2.wyswietlInfo();
        statek1.wyswietlInfo();

    }
}
