import java.util.Scanner;
class Bill
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int pno;
    float pcost,pquality,bill;
    String pname;
    System.out.println("enter the product name:");
    pname=sc.next();
    System.out.println("enter the product number:");
    pno=sc.nextInt();
    System.out.println("enter the product cost:");
    pcost=sc.nextFloat();
    System.out.println("enter the product quality:");
    pquality=sc.nextFloat();
    bill=pcost*pquality;
    System.out.println(" product name :"+pname);
    System.out.println(" product number :"+pno);
    System.out.println(" product cost :"+pcost);
    System.out.println(" product quality is:"+pquality);
    System.out.println("bill:"+bill);
    }
  }


