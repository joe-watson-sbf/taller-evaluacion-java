package domain;

public class Persona {
    private String nombre, DNI;
    private int edad;
    private char sexo;
    private double peso , altura;

    public Persona(){
        this.nombre = " ";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.DNI=generarDNI();
    }
    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }


    public double calcularIMC(){
        return 0;
    }
    public boolean esMayorDeEdad(){
        return edad>18;
    }

    private String generarDNI(){
        return "DNI";
    }

    private char comprobarSexo(char sexo){
        if(sexo=='m' || sexo=='M') return 'M';
        if(sexo=='h' || sexo== 'H') return 'H';
        return 'H';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
