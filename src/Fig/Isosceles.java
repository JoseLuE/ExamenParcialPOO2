package Fig;

public class Isosceles extends Triangle {
    public Isosceles(){
        super();
    }

    public Isosceles(double base, double lado1, double lado2,double altura) {
        super(base,lado1,lado2,altura);
    }


    @Override
    public void draw(){
        System.out.println("Soy un triangulo Isosceles");
    }
}
