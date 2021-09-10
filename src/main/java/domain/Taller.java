package domain;

import java.util.Random;

public class Taller {

    public static void ejercicio1(){
        Utils.info("1");
        Random rdn = new Random();
        double x = rdn.nextInt(1000);
        double y = rdn.nextInt(1000);
        System.out.println("Primer Numero: " + x +"\nSegundo Numero: " + y);
        Utils.compararNumeros(x,y);
    }

    public static void ejercicio2(){
        Utils.info("2");
        System.out.println("Ingrese dos numeros para comparar");
        System.out.println("Numero 1: " );
        double x = Utils.getNumberFromConsole();
        System.out.println("Numero 2: " );
        double y = Utils.getNumberFromConsole();
        Utils.compararNumeros(x, y);
    }

    public static void ejercicio3(){
        Utils.info("3");
        System.out.println("Ingresa el radio del circulo para calcular su area");
        System.out.println("radio: ");
        double radio = Utils.getNumberFromConsole();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo = " + area);

    }

}
