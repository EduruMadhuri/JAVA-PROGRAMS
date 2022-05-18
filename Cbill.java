import java.util.Scanner;
class Cbill
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int cno,pmr,lmr,tu;
      String cname;
      float cbill;
      System.out.println("enter customer number:");
      cno=sc.nextInt();
      System.out.println("enter customer name:");
      cname=sc.next();
      System.out.println("enter present month reading:");
      pmr=sc.nextInt();
      System.out.println("enter last mounth reading:");
      lmr=sc.nextInt();
      cbill=sc.nextFloat();
      tu=pmr-lmr;
      if (tu<=50)
      System.out.println("current bill");
      System.out.println("the customer number:"+cno);
      System.out.println("the customer name:"+cname);
      System.out.println("the customer present month reading:"+pmr);
       System.out.println("the customer last month reading:"+lmr);
      System.out.println("the total units:"+tu);
      System.out.println("the current bill:"+cbill);
      }
  }
      
  