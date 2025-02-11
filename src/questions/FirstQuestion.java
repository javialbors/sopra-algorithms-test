package questions;

import java.util.Scanner;

public class FirstQuestion {

    public static void run() {
        try {
            int numero = leerNumero();
            boolean isEven = (numero % 2) == 0;

            for (int i = numero; i >= (isEven ? 0 : 1); i -= 2)
                System.out.println(i);
        } catch(NumberFormatException e) {
            System.err.println("El valor introducido no es un número entero");
        }
    }

    private static int leerNumero() throws NumberFormatException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");

        return Integer.parseInt(scan.nextLine());
    }
}
