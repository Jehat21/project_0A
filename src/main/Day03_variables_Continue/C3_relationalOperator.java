package Day03_variables_Continue;

public class C3_relationalOperator {
    public static void main (String[] args){

      byte a=3;
      byte b=6;
      byte c=9;
      boolean b1=b>a;// true
      boolean b2=c<b;//false
      System.out.println(b1);//true
      System.out.println(b1|b2);
                      //(true and false)
        System.out.println(b2&b2|b1);
                    //(false and false or false)
        System.out.println("*****AND*****");

        System.out.println(true);//T
        System.out.println(false);//F
        System.out.println(false);//F
        System.out.println(false);//F
        System.out.println("+++OR+++++");
        System.out.println(true);//T
        System.out.println(true);//T
        System.out.println(true);//T
        System.out.println(false);//F




    }
}
