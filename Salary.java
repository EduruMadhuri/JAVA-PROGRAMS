import java.util.Scanner;
class Salary
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int pno,Basicsalary;
      float DA,HRA,TA,PF,IT,net_salary,gross_salary;
      String pname;
      Scanner Sc =new Scanner(System.in);
      System.out.println("enter employe number:");
      pno=sc.nextInt();
      System.out.println("enter the employee name:");
      pname=sc.next();
      System.out.println("enter the employee salary:");
      Basicsalary=sc.nextInt();
       DA=20/100*Basicsalary;
       HRA=10/100*Basicsalary;
       TA=12/100*Basicsalary;
      PF=8/100*Basicsalary;
      IT=5/100*Basicsalary;
      gross_salary=Basicsalary+DA+HRA+TA;
      net_salary=gross_salary-(PF-IT);
      }
  }
      