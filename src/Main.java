import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {





       ArrayList numerySeryjne = new ArrayList<Kontenery>();
       Kontenery kontener1 = new Kontenery(52, 5, 2, 4 ,1, "C","Do Ameryki");
       numerySeryjne.add(kontener1);
       kontener1.assignNumerSeryjny(numerySeryjne.indexOf(kontener1));
       Kontenery kontener2 = new Kontenery(123, 200, 200, 600 ,2, "L","Do Keni");
       numerySeryjne.add(kontener2);kontener2.assignNumerSeryjny(numerySeryjne.indexOf(kontener2));








    }
    }
