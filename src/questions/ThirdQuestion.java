package questions;

import java.util.Scanner;

public class ThirdQuestion {

    public static void run() {
        int horasTrabajadas = leerHorasTrabajadas();
        float tarifa = leerTarifa();
        int horasExtra = horasTrabajadas - 40;

        float sueldo = horasExtra > 0 ?
            (40 * tarifa) + (horasExtra * tarifa * 1.5f) :
            (horasTrabajadas * tarifa);

        System.out.println("El sueldo resultante es: " + sueldo);
    }

    private static int leerHorasTrabajadas() throws NumberFormatException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el número de horas trabajadas: ");

        return Integer.parseInt(scan.nextLine());
    }

    private static float leerTarifa() throws NumberFormatException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el valor de la tarifa: ");

        return Float.parseFloat(scan.nextLine().replace(",", "."));
    }
}
