package Day04;

public class C3_priitiveCasting {
 String name="hi";
 static int number=6;


    public static void main(String[] args){
        C3_priitiveCasting object=new C3_priitiveCasting();
        int[] N1=new int[C3_priitiveCasting.number];
        String S1=object.name;

        System.out.println(S1);

//implicity casting done by java automaticly
        //explicity casting done by manualy
        System.out.println((long) (byte) number);
        long l1=3;
        int i1= (int) l1;
        byte b1=(byte) l1;
        System.out.println(b1);
        System.out.println(i1);
        double d1=34.56;
        float f1=(float) d1;
        System.out.println(f1);
    }



}
