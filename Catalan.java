import java.util.*;
import java.io.*;

class Catalan 
{
static int compute(int n )
{
	int c=0;
if(n<=1)
{
return 1;
}
else
{
for(int i=0;i<n;i++)
{
 c+= compute(i)*compute(n-i-1);
}
return c;
}
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int n = sc.nextInt();
int result = compute(n);
System.out.println("RESULT  : " + result);
}
}
