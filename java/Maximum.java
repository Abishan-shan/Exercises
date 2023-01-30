/*
Problem:
You are given N integers length array by the user. Find the maximum number

*/


public class Maximum
{
  public static void main(String args[])
  {
    int num []={8,120,30,60,0,40};

    int max=num[0];

    for(int i=0;i<num.length;i++)
    {
        for(int j=i+1;j<num.length-1;j++)
        {
            if(num[i]>num[j])
            {
                max=num[i];

                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;

                //System.out.println(temp);
            }

        }
    }

    System.out.println(max);
  }
} 
