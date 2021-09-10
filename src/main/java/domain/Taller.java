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

    public static void ejercicio4(){
        Utils.info("4");
        System.out.println("Ingrese el precio del producto ");
        System.out.println("Precio: ");
        double precio = Utils.getNumberFromConsole();
        System.out.println("IVA: 21%");
        System.out.println("Precio final del producto: " + precio + (precio * 0.21));
    }

    public static void ejercicio5() {
        Utils.info("5 - Bucle WHILE");
        int numero = 1;
        while(numero<=100){
            System.out.println( (numero%2==0) ? numero + " Es par..." : numero + " Es impar...");
            numero++;
        }
    }

    public static void ejercicio6() {
        Utils.info("6 - Bucle FOR");
        for (int numero = 1; numero <= 100 ; numero++) {
            System.out.println( (numero%2==0) ? numero + " Es par..." : numero + " Es impar...");
        }
    }
}
