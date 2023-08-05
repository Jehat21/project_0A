package day07;

import java.util.Scanner;

public class c1_Switch {
    public static void main(String[] args){

        // we will create a program that when you put number you expect output as a word

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int number=scanner.nextInt();

        String month ="June";
        String result="?";
        if (number>=1 && number<=12){
            switch (number){
                case 1: month="jan";
                    break;
                case 2: month="february";
                    break;
                case 3:month="march";
                    break;
                case 4: month="april";
                    break;
                case 5: month="may";
                    break;
                case 6: month="june";
                    break;
                case 7: month="july";
                    break;
                case 8: month="august";
                    break;
                case 9: month="september";
                    break;
                case 10: month="october";
                    break;
                case 11: month="November";
                    break;
                case 12: month="December";
                    break;

            }
        }else {
           month="invalid";
        }

        result="Today is 1.of the "+month+". This month's order in months is number "+number;
        System.out.println(result);







    }

}
