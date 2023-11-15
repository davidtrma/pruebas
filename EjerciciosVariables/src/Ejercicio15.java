import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuantas horas y minutos has trabajado");
        int h = teclado.nextInt();
        int m = teclado.nextInt();
        double s = (h*60 + m)*0.2;

        System.out.println("Debes de cobrar "+s+"€");
    }
}
