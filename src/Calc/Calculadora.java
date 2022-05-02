package Calc;

public class Calculadora implements Calculable {
    protected float n1;
    protected float n2;

    public Calculadora(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public void chargeNumbers(float n1, float n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public float sumNumbers(){
        return (this.n1+this.n2);
    }
    public float restNumbers(){
        return (this.n1-this.n2);

    }
    public float multNumbers(){
        return (this.n1*this.n2);

    }
    public float divNumbers(){
        float result=0;
        if (this.n2==0){
            System.out.println("Error Matematico");
        }else{
            result=this.n1/this.n2;
        }
        return result;
    }
}

