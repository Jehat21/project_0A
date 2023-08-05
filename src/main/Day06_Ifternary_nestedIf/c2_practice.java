package Day06_Ifternary_nestedIf;

import java.util.Scanner;

public class c2_practice {
    public static void main(String[] args){
        //create a program that takes student point and give it grade
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your point");
        int point=scanner.nextInt();
        //char grade='a';

      char result1=(point>=0 && point<=40)? 'F':(point>40 && point<=55)? 'E':
              (point>55 && point<64)?'D':(point>=65 && point<=74)?'C':
                      (point>=75 && point<=85)?'B':
                              (point>85 && point<=100)? 'A':0;
      String result="Student grade is: "+ result1;


        System.out.println(result);


    }
}
