import domain.Persona;

import static domain.Taller.run;

public class Main {
    public static void main(String[] args){
        //run();
        Persona persona = new Persona("Joe Watson SBF", 25, 'M');
        System.out.println(persona);
    }
}
