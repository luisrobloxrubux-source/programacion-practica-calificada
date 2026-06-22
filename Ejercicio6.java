import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        int invertido = 0;

        for (; numero != 0; numero /= 10) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
        }

        System.out.println("Número invertido: " + invertido);
    }
}