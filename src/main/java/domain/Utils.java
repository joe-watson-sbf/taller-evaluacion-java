package domain;

import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;

import javax.swing.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

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

    public static boolean sonIguales(String frase1, String frase2){
        frase1 = frase1.replaceAll(" ", "").toLowerCase();
        frase2 = frase2.replaceAll(" ", "").toLowerCase();

        return frase1.equals(frase2);
    }

    public static void compararFrases(String frase1, String frase2){
        if(sonIguales(frase1, frase2)){
            showMessage("Las frases son iguales...");
        }else {
            DiffMatchPatch dmp = new DiffMatchPatch();
            LinkedList<DiffMatchPatch.Diff> diff = dmp.diffMain(frase1, frase2, false);
            StringBuilder falta = new StringBuilder();
            StringBuilder igual = new StringBuilder();
            for (DiffMatchPatch.Diff value : diff) {
                if (value.operation.name().equals("DELETE")) {
                    falta.append(" [").append(value.text).append("] ");
                }
                if (value.operation.name().equals("EQUAL")) {
                    igual.append(" [").append(value.text).append("] ");
                }
            }
            showMessage("Lo que falta pa que los dos sean iguales: \n" + falta);
            showMessage("Los que son iguales: \n" + igual);

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
            showMessage("\n\nChaooooo!!!\n\n");
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
                        "Luego ingrese los datos en la consola ",
                title, JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues.toArray(), possibleValues.get(0));

        if(selectedValue.toString() == null){
            return 100;
        }else {
            return possibleValues.indexOf(selectedValue.toString());
        }

    }

}
