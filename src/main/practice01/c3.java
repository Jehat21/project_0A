package practice01;

import java.util.Scanner;

public class c3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
       // int input=3;
        String days="monday";
        switch (input){
            case 1: days=" monday";
            break;
            case 2: days=" tuesday";
            break;
            case 3: days=" wednesday";
            break;
            case 4:days=" thursday";
            break;
            case 5:days="friday";
            break;
            case 6: days="saturday";
            break;
            case 7: days="sunday";
            break;
            default: days="invalid day";
            break;
        }
        System.out.println(input+" "+days);








    }
}
