/*
Problem:
Write a Java program to print the area and perimeter of a circle

*/

class Circle
{
  double PI=3.14;

    double CalArea(int r)
    {
       return PI*r*r; 
    }

    double Perimeter(int r)
    {
        return 2*PI*r;
    }
} 



class test{
    public static void main(String args[])
    {
        
        Circle c1=new Circle();

        System.out.println(c1.CalArea(10));
        System.out.println(c1.Perimeter(5));
        

            

        
    }
}