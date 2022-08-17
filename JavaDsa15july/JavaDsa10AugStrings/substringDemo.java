package JavaDsa10AugStrings;

import java.util.*;
public class substringDemo{
  public static String printSubString(String s1,String s2){
    System.out.println(s2);
    return s2;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String s1=input.next();
    String s2=s1.substring(0,3);
    printSubString(s1,s2);
  }
}
