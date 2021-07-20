package ec.epn.edu.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args){
        System.out.println("== Calculator Execute ==");
        Calculator c = new Calculator();
        int addition = c.adition(4,7);
        System.out.println("c.adition(4,7) = " + addition);
        int substraction = c.substraction(7,1);
        System.out.println("c.substraction(7,1) = " + substraction);

        System.out.println(" ==Addding a line by Group 5 ==");
    }
}
