import java.util.*;
import java.io.*;

class Binomial_coeff {
static int Bino_coeff(int n,int k) {
int[][] c=new int[n+1][k+1];
int i,j;
for(i=0;i<=n;i++)
{
for(j=0;j<= min(i,k) ; j++)
{
if(j == 0 || j == i)
{
c[i][j] = 1;
}
else
{
c[i][j] = c[i-1][j-1] + c[i-1][j];
}
}
}
return c[n][k];
}

static int min ( int a, int b)
{
	if(a>b)
	{return b;}
	else
		return a;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter n and k :");
int n = sc.nextInt();
int k = sc.nextInt();
int result = Bino_coeff(n,k);
System.out.println("RESULT :" + result);
}
}
