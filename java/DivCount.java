/*
Problem:
You are given N integers between 1 and 50. Find the count of numbers divisible by K.

Input Format
The input begins with two positive integers N, K. The next N lines contains one positive integer numbers
​
Output Format
Output a single number denoting how many integers are divisible by K.

*/
import java.util.Scanner;

class DivCount 
{
    public static void main(String args[])
    {
       
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Numbers of Your given N numbers:");
        int N=input.nextInt();

        //String quit=input.nextLine();

        System.out.println("Enter dividing num K:");
        int k=input.nextInt();

        
         int count=0;
       
        System.out.println("Enter the number:");
        int i=0;
        while(i < N)
        {

            
            int num1=input.nextInt();

           
            if(num1 % k == 0)
            {
                count++;

                if(i == N-1)
                {
                    break;
                }
                
                
                //num1=input.nextInt();

            }
            else{
                //System.out.println("Enter number");
                 continue;   
                //num1=input.nextInt();
            }
            System.out.println("Enter Number");
            i++;
        }

        System.out.println("dividing count is:" + count);
        
    }
}