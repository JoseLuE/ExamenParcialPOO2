package Fig;


public class Main {
    public static void main(String args[]){
        Triangle triangle=new Isosceles(8,4,3,6);
        triangle.draw();
        System.out.println("Perimetro: "+triangle.getPerimeter());
        System.out.println("Area: "+triangle.getArea());
        Triangle triangle1=new Equilateral(8,8,8,6);
        triangle1.draw();
        System.out.println("Perimetro: "+triangle1.getPerimeter());
        System.out.println("Area: "+triangle1.getArea());
        Triangle triangle2=new Scalene(10,5,7,6);
        triangle2.draw();
        System.out.println("Perimetro: "+triangle2.getPerimeter());
        System.out.println("Area: "+triangle2.getArea());
    }
}
