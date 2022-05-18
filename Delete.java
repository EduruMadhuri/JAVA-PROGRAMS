import java.util.Scanner;
class Delete
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        int i,n,pos;
    System.out.println("enter the number of elements:");
    n=sc.nextInt();
    int[] a=new int[n];
    System.out.println("enter the elements");
    for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      System.out.println("enter the position of the number which isto be deleted");
    pos=sc.nextInt();
    for(i=pos;i<n-1;i++)
      {
    a[i]=a[i+1];
   }
    n=n-1;
    System.out.println("\non deleting  new array we get is\n");
    for(i=0;i<n;i++)
      {
        System.out.println("a"+i+"="+a[i]);
      }
    }
}