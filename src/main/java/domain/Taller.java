package domain;

import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;

import java.text.SimpleDateFormat;
import java.util.*;

import static domain.Utils.*;
import static domain.Utils.showMessage;

public class Taller {

    public static void run(){
        showMessage("\n\n\n\n\n\n\n\n\n\n");
        runFunctions();
    }

    public static void ejercicio1(){
        info("1 - Comparar 2 numeros cualquiera");
        Random rdn = new Random();
        double x = rdn.nextInt(1000);
        double y = rdn.nextInt(1000);
        showMessage("Primer Numero: " + x +"\nSegundo Numero: " + y);
        compararNumeros(x,y);
    }

    public static void ejercicio2(){
        info("2 - Comparar 2 numeros");
        showMessage("Ingrese dos numeros para comparar");
        showMessage("Numero 1: " );
        double x = getInputNumber();
        showMessage("Numero 2: " );
        double y = getInputNumber();
        compararNumeros(x, y);
    }

    public static void ejercicio3(){
        info("3 - Calcular Area de un Circulo");
        showMessage("Ingrese el radio: ");
        double radio = getInputNumber();
        if(radio>0) {
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El area del circulo = " + area);
        }else {
            showMessage("El area debe ser mayor que 0");
            ejercicio3();
        }
    }

    public static void ejercicio4(){
        info("4 - Aplicar IVA sobre el precio de un producto");
        showMessage("Ingrese el precio del producto:");
        double precio = getInputNumber();
        showMessage("Precio normal: " + precio);
        showMessage("IVA aplicada: 21%");
        showMessage("Precio final: " + (precio + (precio * 0.21)));
    }

    public static void ejercicio5() {
        info("5 - Numeros pares y impares con Bucle WHILE");
        int numero = 1;
        while(numero <= 100){
            if(numero%2==0) showMessage(numero + " Es par...");
            else showMessage(numero + " Es impar...");
            numero++;
        }
    }

    public static void ejercicio6() {
        info("6 - Numeros pares y impares con Bucle FOR");
        for (int numero = 1; numero <= 100 ; numero++) {
            if(numero%2==0) showMessage(numero + " Es par...");
            else showMessage(numero + " Es impar...");
        }
    }

    public static void ejercicio7(){
        double numero = -1;
        info("7 - Mayor o igual a 0");
        do {
            showMessage("Ingrese un numero: ");
            numero = getInputNumber();
            if (esMayorIgualCero(numero)) showMessage("_________" + numero + "_________");
            else numero=-1;
        }while (numero==-1);
    }

    public static void ejercicio8(){
        info("8 - Verificar si es un d??a laboral o no");
        List<String> dias = List.of("domingo", "lunes", "martes", "miercoles",
                "jueves", "viernes", "sabado", "s??bado");
        showMessage("Ingrese un d??a: ");
        String dia = getInputString().trim().toLowerCase();
        int index = dias.indexOf(dia);
        switch (index){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                showMessage(dia.toUpperCase() + " es un d??a laboral");
                break;
            default:
                showMessage(dia.toUpperCase() + " no es un d??a laboral");
                break;
        }
    }

    public static void ejercicio9(){
        info("9 - Reemplaza todas las a del String anterior por una e");
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        showMessage("Texto original: ".toUpperCase() + texto);
        texto = texto.replaceAll("a", "e");
        showMessage("Texto Tranformado y contatenado: ".toUpperCase()
                + texto + "; Sonre??r nos hace sentir mejor.");
    }

    public static void ejercicio10(){
        info("10 - Elimine los espacios en una frase");
        showMessage("Ingrese una frase: ");
        String frase = getInputString().trim();
        frase = frase.replaceAll(" ", "");
        showMessage("Frase sin espacio: " + frase);
    }

    public static void ejercicio11(){
        info("11 - Longitud de esta frase y vocales contiene [ a,e,i,o,u ]");
        showMessage("Ingrese una frase: ");
        String frase = getInputString();
        List<String> vocales = List.of("a","e","i","o","u");
        String[] letras = frase.split("");
        int count = 0;
        for (int i = 0; i < letras.length; i++){
            String letra = letras[i].trim().toLowerCase();
            if(vocales.contains(letra)) count++;
        }
        showMessage("La longitud de la frase: " + frase.length());
        showMessage("Tiene " + count + " vocales");
    }

    public static void ejercicio12(){
        info("12 - Comparar 2 palabaras");
        showMessage("Primera frase: ");
        String frase1 = getInputString().trim();
        showMessage("Segunda frase: ");
        String frase2 = getInputString().trim();
        compararFrases(frase1, frase2);
    }

    public static void ejercicio13(){
        info("13 - Consulta la fecha y hora actual");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss", Locale.ENGLISH);
        Date date = new Date();
        showMessage("\nFECHA y HORA: " + dateFormat.format(date));
    }

    public static void ejercicio14(){
        info("14 - En desarrollo!!!");
    }

    public  static void ejercicio15(){
        showMessage("****** GESTION CINEMATOGRAFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");

        showMessage("Selecciona una opcion: ");
        double option = getInputNumber();
        if(option>=1 && option<8) ejercicio15();
        if(option<1 || option>8) {
            showMessage("OPCION INCORRECTO");
            ejercicio15();
        }
    }

    public static void ejercicio16(){
        info("16 - En desarrollo!!!");
    }

    public static void ejercicio17(){
        info("17 - En desarrollo!!!");
    }

    public static void ejercicio18(){
        info("18 - En desarrollo!!!");
    }

}
