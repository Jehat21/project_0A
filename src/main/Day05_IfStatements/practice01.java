package Day05_IfStatements;

import java.util.Scanner;

public class practice01 {


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <=10; i++) {
             System.out.println("Enter a number");
             int input=scanner.nextInt();
             if (input<0 && input>-10){
                System.out.println("number is between -10 ,0 ");
               if (input %2 == 0){
                   System.out.println("this is negative even number");
                  } else if (input%3==0) {
                     System.out.println("this is negative odd number");
               }
               }else if (input==0){
            System.out.println("this is orgin ");
            } else if (input<=10 && input>0) {
            System.out.println("number is between 0, 10");
            if (input%2==0){
                System.out.println("this is pozitive even number");
            } else if(input%3==0){
                System.out.println("this is pozitive odd number");

            }

        } else {
            System.out.println("input is not valid");
        }

    }

    }
    }

