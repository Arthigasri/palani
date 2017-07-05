# palani
import java.io.*;
import java.util.*;
public class Main3
{
  public static void main(String args[])
  {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an character");
    ch=sc.next().charAt(0);
    if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
    {
      System.out.println("The character is an vowel");
    }
    else
    {
      System.out.println("The character is an consonant");
    }
  }
}


    
    
