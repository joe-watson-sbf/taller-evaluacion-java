package domain;

import java.util.Scanner;

public class Utils {

    public static void compararNumeros(double numero1, double numero2){
        if(numero1==numero2) System.out.println("Son iguales");
        else System.out.println("Mayor: "+ Math.max(numero1, numero2));
    }

    public static double getNumberFromConsole(){
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        try {
            return Double.parseDouble(x);
        }catch (Exception ex){
            System.out.println("Error!!! Ingrese solo numero \n Re-ingrese el numero");
            return getNumberFromConsole();
        }
    }

    public static void info(String numeroEjercicio){
        System.out.println("\nEJERCICIO " + numeroEjercicio +
                "\n==========================");
    }
}
