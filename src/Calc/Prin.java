package Calc;

public class Prin {
    public static void main(String args[]) {
        Calcv2 calculadora = new Calcv2(8, 4);
        System.out.println("Suma: "+ calculadora.sumNumbers());
        System.out.println("Resta: "+ calculadora.restNumbers());
        System.out.println("Multiplicacion: "+ calculadora.multNumbers());
        System.out.println("Division: "+ calculadora.divNumbers());
        System.out.println("Resto de la division: "+ calculadora.RestDiv());

    }
}
