import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una cantidad de milibytes");
        int mb = teclado.nextInt();
        System.out.println("Son "+mb*1000+" kilobytes");
    }
}
