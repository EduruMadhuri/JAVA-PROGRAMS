import java.util.Scanner;
class Rect
{
public static void main(String[] args)
{
Scanner r=new Scanner(System.in);
int l,b,area,perimeter;
System.out.println("length:");
l=r.nextInt();
System.out.println("breadth:");
b=r.nextInt();
area=l*b;
perimeter=2*(l+b);
System.out.println("area:"+area);
System.out.println("perimeter:"+perimeter);
}
}