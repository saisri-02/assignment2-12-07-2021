import java.util.*;
class Sortasc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s;
System.out.print("Enter String : ");
s=sc.next();
System.out.println("String before sorting : "+s);
char ch[]=s.toCharArray();
char temp;
for(int i=1;i<ch.length;i++)
{
for(int j=0;j<ch.length-1;j++)
{
if(ch[j]>ch[j+1])
{
temp=ch[j];
ch[j]=ch[j+1];
ch[j+1]=temp;
}
}
}
System.out.print("String after sorting in ascending order : ");
System.out.println(ch);
}
}

/*
import java.util.*;
class Sortasc
{
public static void main(String args[])
{
String s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String : ");
s=sc.next();
System.out.println("String before sorting : "+s);
char ch[]=s.toCharArray();
Arrays.sort(ch);
System.out.print("String after sorting in ascending order : ");
System.out.println(ch);
}
}*/


output:

Enter String : geeks
String before sorting : geeks
String after sorting in ascending order : eegks
