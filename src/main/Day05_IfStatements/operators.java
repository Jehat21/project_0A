package Day05_IfStatements;

public class operators {
    public static void main(String[] args){
        int x=2;
        int y=3;
        int z=5;
        x=x+y+z;// x=x(x+y+z)
        System.out.println(--x);//when we put two minus ot will make it minus 1
        x+=x+y+z;// x=x+(x+y+z)
        System.out.println(x);// we increase 1 , it will show up on next line
        x*=x+y+z;//x=x*(x+y+z)
        System.out.println(x);


        int number1=6;
        int number2=0;
        int a = 0;
        a-=a+number2+number1;
        a/=3;
        System.out.println(a);
    }
}
