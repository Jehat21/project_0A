package Day05_IfStatements;

import java.util.Scanner;

public class ptactice02 {
    public static void main(String[] args){
        //   Here are the steps to complete this task:
        //
        //Create a new Java class and define the main method.
        //Inside the main method, create a Scanner object to read the input from the user.
        //Print a message asking the user to enter a positive integer.
        //Use the Scanner object to read the integer input from the user.
        //Write a method or a loop to calculate the factorial of the entered number.
        //Print the result.
        //n! = n * (n-1) * (n-2) * (n-3) ... * 3 * 2 * 1
        Scanner input=new Scanner(System.in);
        System.out.println("enter int number");
        int a=input.nextInt();
        char count= (char) a;
        for (int i =a; i >=1 ; i--) {
           count*=(count-1)*(count+i);
           ///3=3*(2)*(1)

            System.out.println(a+"  "+ i +" "+count);
        }

    }
}
