import java.util.*;
class N
{

public static void main(String args[])
{

char a,b,c,d;
String str ;

Scanner obj=new Scanner(System.in);
System.out.print("choose any integer no. between 1 to 15 in your mind\n");
System.out.print("Is your no. is present in this list [1,3,5,7,9,11,13,15] ?\n");
System.out.print("your answer is Y/N : ");
char s=obj.next().charAt(0);
if(s=='Y')
{
	a='1';
}
else
{
	a='0';
}
System.out.print("\nIs your no. is present in this list:[2,3,6,7,10,11,14,15]?\n");
System.out.print("your answer is Y/N : ");
s=obj.next().charAt(0);

if(s=='Y')
{
b='1';
}
else
{
b='0';
}
System.out.print("\nIs your no. is present in this list [4,5,6,7,12,13,14,15] ?\n");
System.out.print("your answer is Y/N : ");
s=obj.next().charAt(0);

if(s=='Y')
{
c='1';
}
else
{
c='0';
}

System.out.print("\nIs your no. is present in this list [8,9,10,11,12,13,14,15] ?\n");
System.out.print("your answer is Y/N : ");
s=obj.next().charAt(0);

if(s=='Y')
{
d='1';
}
else
{
d='0';
}
StringBuilder sb = new StringBuilder();
sb.append(d);
sb.append(c);
sb.append(b);
sb.append(a);
str = sb.toString();
int decimal=Integer.parseInt(str,2);
System.out.print("\nyou have choosen no. =");
System.out.println(decimal); 
System.out.print("So Want to learn this trick study binary no. "); 
}
}  
