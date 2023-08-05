package day07;

public class practice01 {
    public static void main(String[] args) {

        char letter='3';
        String result="Hello";
        switch (letter){
            case 'a':
                result+=" a";
                break;
            case 'b':
                result+=" b";
               // break; // b c
            case 'c':
                result+=" c";
                break;
            default:
                result+=" invalid ";

        }
        System.out.println(result);











    }
}
