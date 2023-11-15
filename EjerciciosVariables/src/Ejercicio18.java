import java.util.Scanner;

public class Ejercicio18 {
    public class Ejercicio17 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Dime una cantidad de kilobytes");
            int kb = teclado.nextInt();
            System.out.println("Son "+kb/1000+" milibytes");
        }
}
