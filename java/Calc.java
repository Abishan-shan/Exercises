/*
Problem:
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

*/
import java.util.Scanner;
public class Calc
{
  public static void main(String args[])
  {

    Scanner input=new Scanner(System.in);

    System.out.print("num1: ");
    int num1=input.nextInt();
    

    System.out.print("num2: ");
    int num2=input.nextInt();
    
    Scanner enter=new Scanner(System.in);

    System.out.print("operator: ");
    String action=enter.nextLine();
    

    switch(action)
    {
        case "+":
            System.out.println(num1+num2);
            break;
        case "-":
            System.out.println(num1-num2);
            break;
        case "*":
            System.out.println(num1*num2);
            break;
        case "/":
            if(num1 > num2)
            {
                System.out.println(num1 / num2);
                System.out.println("reminder is: " +num1 % num2);
                break;
            }

            else
            {
                System.out.println(num2 / num1 );
                System.out.println("reminder is:" +num1 % num2);
                break;
            }
            
        default:
            System.out.println("enter correct operator");        
    }
  }
} 

