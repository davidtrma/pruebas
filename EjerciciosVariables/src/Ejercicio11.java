import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int peseta;
        System.out.println("Dime una cantidad de pesetas");
        peseta= teclado.nextInt();
        System.out.println(peseta +" pesetas es "+(peseta*0.006)+"€");

    }
}
