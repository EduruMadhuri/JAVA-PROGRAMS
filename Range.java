import java.util.Scanner;
class Range
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,c=0,r;
      System.out.println("enter the range:");
      r=sc.nextInt();
      for(n=1;n<=r;n++)
        {
          c=0;
          for(i=1;i<=r;i++)
            {
              if(n%i==0)
                c++;
              }
          if(c==2)
            System.out.println("\t"+n);
          }
      }
  }