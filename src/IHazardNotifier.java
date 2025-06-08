public interface IHazardNotifier {
    default void wykrytoHazard(String numerSeryjny)
    {
        System.out.println("Nieoczekiwany błąd z kontenrtem: "+numerSeryjny);
    };
}
