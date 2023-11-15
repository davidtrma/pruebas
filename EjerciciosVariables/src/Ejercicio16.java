import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el radio de cono");
        int r = teclado.nextInt();
        System.out.println("Dime la altura del cono");
        int h = teclado.nextInt();
        double v = (Math.PI*(r*r)*h)/3;
        System.out.println("El volumen del cono es de "+v+" metros cubicos");
    }
}
