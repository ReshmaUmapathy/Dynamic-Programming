import java.util.*;
import java.io.*;
class Tiles 
{
static int count(int n )
{
int c=0;
if(n==1 || n==2)
{
return n;
}
else
{
c+= count(n-1)+count(n-2);
}
return c;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int n = sc.nextInt();
int result = count(n);
System.out.println("RESULT  : " + result);
}
}
