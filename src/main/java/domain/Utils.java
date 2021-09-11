package domain;

import javax.swing.*;
import java.lang.reflect.Method;
import java.util.*;
public class Utils {

    private static final String title = "SOFKA U - Taller Java";


    public static void compararNumeros(double numero1, double numero2){
        if(numero1==numero2) showMessage("Son iguales");
        else showMessage("El mayor: " + Math.max(numero1, numero2));
    }

    public static void showMessage(String message){
        System.out.println(message);
    }

    public static boolean esMayorIgualCero(double numero){
        return numero >= 0;
    }

    public static double getInputNumber(){
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        try {
            return Double.parseDouble(x);
        }catch (Exception ex){
            showMessage("Error!!!\nEl dato ingresado no es un numero");
            return getInputNumber();
        }
    }

    public static String getInputString(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static void info(String message){
        showMessage("\nEJERCICIO " + message +
                "\n==========================");
    }

    public static void relaunch() throws InterruptedException {
        Thread.sleep(1000);
        int option = JOptionPane.showConfirmDialog(null,
                "¿Desea continuar?", title, JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION) runFunctions();
        else showMessage("\n\nChaooooo!!!\n\n");
    }

    public static void runFunctions(){
        try{
            Method method = Taller.class.
                    getDeclaredMethod("ejercicio"+(getOption()+1),  null);
            method.setAccessible(true);
            method.invoke(Taller.class, null);
            relaunch();
        }catch (Exception ex){
            showMessage("Ejercio aún no esta implementado!!!");
        }
    }

    private static int getOption(){
        List<String> possibleValues = List.of("Punto 1",
                "Punto 2", "Punto 3", "Punto 4",
                "Punto 5", "Punto 6", "Punto 7",
                "Punto 8", "Punto 9", "Punto 10",
                "Punto 11", "Punto 12", "Punto 13",
                "Punto 14", "Punto 15", "Punto 16",
                "Punto 17", "Punto 18");

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Seleciona el ejercicio que desea ejecutar\n" +
                        "Luego ingrese los datos por la consola ",
                title, JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues.toArray(), possibleValues.get(0));

        if(selectedValue.toString() == null){
            return 100;
        }else {
            return possibleValues.indexOf(selectedValue.toString());
        }

    }

}
