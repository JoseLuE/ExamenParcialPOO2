package Fig;

public class Triangle extends Figure implements Operable{
    private double base;
    private double lado1;
    private double lado2;
    private double altura;
    public Triangle(){

    }
    public Triangle(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura=altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {
        double resultado =(getBase()*getAltura())/2;
        return resultado;
    }

    @Override
    public double getPerimeter() {
      double resultado;
      resultado=getBase()+getLado1()+getLado2();
      return resultado;
    }
    @Override
    public void draw(){
        System.out.println("Soy un triangulo");
    }
}
