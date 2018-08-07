import java.util.*;
import java.io.*;

class Permutation_coeff {
static int permute(int n , int k)
{
int[][] p = new int[n+2][k+2];
int i ,j;
for(i=0;i<=n;i++)
{
for(j=0;j<=min(i,k) ; j++)
{
if(j == 0)
{
p[i][j] = 1;
}
else
{
p[i][j] = p[i-1][j] + (j * p[i-1][j-1] ) ;
}
p[i][j+1] = 0;
}
}
return p[n][k];
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
System.out.println("Enter the coeff n and k : ");
int n = sc.nextInt();
int k = sc.nextInt();
int res = permute(n,k);
System.out.println("RESULT : " + res);
}
}
