import java.util.Scanner;
class Calculator
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c,choice;
    System.out.println("CALCULATOR");
    System.out.println("[1].ADDITION");
    System.out.println("[2].SUBSTRACTION");
    System.out.println("[3].MULTIPLICATION");
    System.out.println("[4].DIVISION");
    System.out.println("[5].MODULUS");
    System.out.println("Enter the values");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("enter the choice");
    choice=sc.nextInt();
    switch(choice)
      {
        case 1:c=a+b;
               System.out.println("the addition is:"+c);
               break;
        case 2:c=a-b;
           System.out.println("the substraction is:"+c);
             break;
        case 3:c=a*b;
           System.out.println("the multiplication is:"+c);
          break;
        case 4:c=a/b;
           System.out.println("the division is:"+c);
          break;
        case 5:c=a%b;
           System.out.println("the module is:"+c);   
      }
    }
}

    