import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a;
    int wynik;
    System.out.println("Podaj liczbę");
    Scanner liczba = new Scanner(System.in);
    a=liczba.nextInt();
    wynik = a % 2;
    if(wynik > 0)
    {
      System.out.println("Nieparzysta");
    }
    else
    {
      System.out.println("Parzysta");
    }
    
    
  }
}