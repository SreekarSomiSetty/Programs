import java.util.Scanner;
import java.io.*;
import java.util.*;

class RemoveDuplicates
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        StringBuffer br = new StringBuffer();
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            if(!set.contains(ch))
            {
                set.add(ch);
                br.append(ch);
            }
        }
        System.out.println(br.toString());
    }
}