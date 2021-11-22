import java.util.*;
import java.io.*;

class RemoveVowel
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);

String str=sc.nextLine();
String str2=str.replaceAll("[aeiouAEIOU]","");
System.out.println(str2);
}
}
