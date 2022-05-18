import java.util.Scanner;
class Area
{
   public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    int r;
    float pi=3.14f,area;
    System.out.println("enter radius of circle");
    r=sc.nextInt();
    area=pi*r*r;
    System.out.println("the area of the circle is:"+area);
  }
}