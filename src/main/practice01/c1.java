package practice01;

import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        int a=5, b=10;
        String s="the sum is: ";


        System.out.println(s+(a+b));



        Scanner input=new Scanner(System.in);
        System.out.println("enter your first name");
        String name=input.next();
        System.out.println(name);
        System.out.println("enter your lastname");
        String lastname=input.next();
        System.out.println(lastname);
        System.out.println(name+lastname);






    }



}
