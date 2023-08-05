package Day06_Ifternary_nestedIf;

import java.util.Scanner;

public class practice {



public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String month;
        String result;

        System.out.println("Enter the number");
        while (true) {
        if (scanner.hasNextInt()) {
        number = scanner.nextInt();
           if (number >= 1 && number <= 12) {
                 break;
                 }
           else {
                  System.out.println("Invalid input. Please enter a number between 1 and 12.");
                 }
           }
           else {
                   System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // discard the invalid input
                 }
          }

        switch (number) {
        case 1: month = "jan";
        break;
        case 2: month = "february";
        break;
        case 3: month = "march";
        break;
        case 4: month = "april";
        break;
        case 5: month = "may";
        break;
        case 6: month = "june";
        break;
        case 7: month = "july";
        break;
        case 8: month = "august";
        break;
        case 9: month = "september";
        break;
        case 10: month = "october";
        break;
        case 11: month = "November";
        break;
        case 12: month = "December";
        break;
default: month = "invalid";
        }

        result = "Today is 1.of the " + month + ". This month's order in months is number " + number;
        System.out.println(result);
        }
}