import java.util.Scanner;
class AsciiValues
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int j=(int)ch;
            System.out.println(j);
        }
        
    }
}