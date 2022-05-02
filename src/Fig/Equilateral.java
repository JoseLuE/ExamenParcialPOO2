package Fig;

public class Equilateral extends Triangle {
    public Equilateral(){

    }
    public Equilateral(double base, double lado1, double lado2,double altura) {
        super(base, lado1, lado2,altura);
    }


    @Override
    public void draw(){
        System.out.println("Soy un triangulo Fig.Equilateral");
    }
}

