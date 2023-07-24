
public class Main {
    public static void hanoi(int rozmiar, int miejscePoczatkowe, int miejsceDocelowe) {
        if (rozmiar == 1) {
            System.out.println("[element 1] z " + miejscePoczatkowe + " na " + miejsceDocelowe);
        } else {
            int miejsceTymczasowe = 6 - miejsceDocelowe - miejscePoczatkowe;
            hanoi(rozmiar -1, miejscePoczatkowe, miejsceTymczasowe);
            System.out.println("[element " + rozmiar + "] z " + miejscePoczatkowe + " na " + miejsceDocelowe);
            hanoi(rozmiar -1, miejsceTymczasowe, miejsceDocelowe);
        }
    }
    public static void main(String[] args) {
        hanoi(3,1,2);
    }
}