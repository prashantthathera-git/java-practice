// Version 1.1: Basic menu-driven calculator using OOP and switch-case
import java.util.Scanner;  

class CalculatorService{

    public double add(double Result,double a){
        
        return Result + a;

    }
    public double subtract(double Result,double a){
        if(Result == 0)
            Result = a;
        else
            Result = Result - a;
        
        return Result;
    }
    public double multiply(double Result,double a){
         
        Result = Result * a;
            return Result;
    }
    public double divide(double Result,double a){
        if(a == 0){
            System.out.println("Error: Division by zero");
            return 0;
        }
        Result = Result / a;
        return Result;
    }
    public double modulus(double Result,double a){

        if(a==0)
            {
                System.out.println("Error: Modulus by zero");
                return 0;
            }
        Result = Result % a;
        return Result;
    }
} 

public class CalculatorApp01 {
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
        double  result_dm = 0;
       if(op == '/' || op == '%')
       {
            System.out.println("Enter the first number");
            result_dm = sc.nextDouble(); 
        } // for division and modulus
           System.out.println("Enter numbers or enter -1 to stop:");
            double num = 0;
            double result = 0;
            double result_mul = 1; // for multiplication
        while(num != -1){ 
           num = sc.nextDouble();
           CalculatorService obj = new CalculatorService();
    
        switch(op){
            
            case '+' ->{
                result = obj.add(result,num);
                System.out.println("Sum: "+result);
            }
            case '-' ->{
                result = obj.subtract(result,num);
                System.out.println("Difference: "+result);
            }
            case '*' ->{
                result_mul = obj.multiply(result_mul,num);
                System.out.println("Product: "+result_mul);
            }
            case '/' ->{
                result_dm = obj.divide(result_dm,num);
                System.out.println("Quotient: "+result_dm);
               
            }
            case '%' ->{
                result_dm = obj.modulus(result_dm,num);
               System.out.println("Modulus: "+result_dm);
            }
    }
}
       }
    }
}
    }

