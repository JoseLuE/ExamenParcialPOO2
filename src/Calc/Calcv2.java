package Calc;

public class Calcv2 extends Calculadora{
    public Calcv2(float n1, float n2) {
        super(n1, n2);
    }
    public float RestDiv(){
        float rest=0;
        if (this.n2==0){
            System.out.println("Error Matematico");
        }else{
            rest=this.n1%this.n2;
        }
        return rest;
    }
}
