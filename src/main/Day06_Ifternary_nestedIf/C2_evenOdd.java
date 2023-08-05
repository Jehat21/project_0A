package Day06_Ifternary_nestedIf;

public class C2_evenOdd {
    public static void main(String[] args){
        int number;
        number=31;
        String result="";
        if(number%2==0){
            result= number+" number is even number";
            System.out.println(result);
        }else {
            result=number+" number is odd number";
            System.out.println(result);
        }

      String result2=(number%2==0)? number+" is an even number":number+" is an odd number";
        System.out.println(result2);



    }
}
