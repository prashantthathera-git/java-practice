// Version 1: Basic menu-driven calculator using OOP and switch-case
import java.util.Scanner;

class CalculatorService{

    public double add(double a, double b){
        return a + b;

    }
    public double subtract(double a, double b){
        return a - b;

    }
    public double multiply(double a, double b){
        return a * b;
    }
    public double divide(double a, double b){
        if(b == 0){
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }
    public double modulus(double a, double b){
        return a % b;
    }
}

public class CalculatorApp {
    public static void main(String[] args){
      
        try(Scanner sc = new Scanner(System.in)){
       
            while (true) { 
        System.out.println("Select operation: +, -, *, /, % or Q to quit");
        char op = sc.next().toUpperCase().charAt(0);
        sc.nextLine(); // consume newline
        
        if(op == 'Q'){
            System.out.println("Exiting the calculator. Goodbye!");
            break;
         }
          else if(op != '+' && op != '-' && op != '*' && op != '/' && op != '%'){
            System.out.println("Invalid operation. Please try again.");
            continue;
         }

         System.out.println("Enter two numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        CalculatorService obj = new CalculatorService();
        double result;
       
        switch(op){
          
            case '+' ->{
                result = obj.add(num1,  num2);
                System.out.println("Sum: "+result);
            }
            case '-' ->{
                result = obj.subtract(num1, num2);
                System.out.println("Difference: "+result);
            }
            case '*' ->{
                result = obj.multiply(num1, num2);
                System.out.println("Product: "+result);
            }
            case '/' ->{
                result = obj.divide(num1, num2);
                System.out.println("Quotient: "+result);
            }
            case '%' ->{
                result = obj.modulus(num1, num2);
               System.out.println("Modulus: "+result);
            }
    }
}
       }
    }
}
