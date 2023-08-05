package day07;

public class c2Nestedifpractice {
    public static void main(String[] args) {
        String personName ="she";
        int age=32;
        double weight=75.4;
        String result="";

        if (age>18 ){
            if (weight>50.0){
                result +=personName +" is eligible to give blood";
            }else {
                result+= personName +" is not eligible to give blood";
            }
        }else if(age>0 && age<=18) {
            result+=personName+ " needs to be older than 18";

        }else {
            result+= "invalid age "+ age;

        }

        System.out.println(result);










    }
}
