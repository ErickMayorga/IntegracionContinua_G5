package ec.epn.edu.git.calculator;

public class Calculator {
    public int adition(int a, int b){
        return a+b;
    }

    public int substraction(int a, int b) {
        return a-b;
    }

    public int multiplication(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a*b;
    }

    public int division(int a, int b){
        return a/b;
    }
    public int potentiation(int a, int b){
        return (int)Math.pow(a,b);
    }
}

