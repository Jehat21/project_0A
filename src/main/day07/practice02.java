package day07;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your first name");
        String name=input.next();
        System.out.println(name);
        System.out.println("enter your last name");
        String lastname=input.next();
        System.out.println("last name "+lastname);
        System.out.println(name+" "+lastname);
        input.close();

    }
}
