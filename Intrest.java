import java.util.Scanner;
class Intrest
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int p,t,r;
  float si;
System.out.println("price:");
p=s.nextInt();
System.out.println("time:");
t=s.nextInt();
System.out.println("rate:");
r=s.nextInt();
si=p*t*r/100;
System.out.println("simple intrest:"+si);
}
}