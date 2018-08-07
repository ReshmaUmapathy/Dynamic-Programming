import java.util.*;
import java.io.*;

class String_permutation
{
private void permute(String str , int l , int r )
{
int i;
if(l == r )
{
System.out.println(str);
}
else
{
for(i=l;i<=r;i++)
{
str = swap(str , l , i);
//System.out.println("after swap 1 : " + str);
permute(str , l+1 , r);
//System.out.println("After permute : " + str);
str = swap(str , l , i );
//System.out.println("After swap 2 : " + str);
//System.out.println();
}
}
}
static String swap(String s , int i , int j)
{
char[] charArray;
charArray = s.toCharArray();
char temp ;
temp = charArray[i];
charArray[i] = charArray[j];
charArray[j] = temp;
return String.valueOf(charArray);

}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String : ");
String str = sc.next();
int n = str.length();
String_permutation p = new String_permutation();
p.permute(str , 0 , n-1);
}
}
