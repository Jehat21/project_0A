package practice01;

import java.util.Scanner;

public class c2 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number");
        int number=scanner.nextInt();
        if (number<0){
            System.out.println("number is negative number");
        }else if(number==0){
            System.out.println("number is zero");
        } else {
            System.out.println("number is positive");
        }


    }
}
