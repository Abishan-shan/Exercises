/*
Problem:
John has to travel to another place. For this, he can book any one of two cab services.

The first cab service charges X rupees.
The second cab service charges Y rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

*/
import java.util.Scanner;
class minimum{

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.print("service charges of X: ");
        int X=input.nextInt();
    
        System.out.println();

         System.out.print("service charges of Y: ");
        int Y=input.nextInt();


        if(X>Y)
            System.out.println("Chef choosing Y");
        else
            System.out.println("Chef choosing X");
    }
}