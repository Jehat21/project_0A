package day07;

public class c1multiifstatements {
    public static void main(String[] ars){
int x=3;
int y=2;
int max=0;
String message="";
        System.out.println(max);
        System.out.println(message);
        if (x>y){
            max=x;
            System.out.println("first "+max);
        }else {//doesnt read here because if(is true)
            max=y;
            System.out.println("second "+max);
        }
max=(x>y)? x:y;
        System.out.println(max);

    }

}
