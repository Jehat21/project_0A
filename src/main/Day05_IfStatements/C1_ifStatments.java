package Day05_IfStatements;

public class C1_ifStatments {
    public static void main(String[] args) {

        //to be able to apply my logic
        //1.i will create 3 numbers
        //2.create 3 boolean condtion to check which boolean is true
        //3. create 3 if condition to check boolens and print minumum number
        int num1=341;
        int num2=655;
        int num3=79;
        boolean b1=num1<=num2 && num1<=num3;
        boolean b2=num2<=num1 && num2<=num3;
        boolean b3 =num3<=num1 && num3<=num2;
        if(b1){
            System.out.println("Minimum number is: "+ num1);
        }
        if(b2){
            System.out.println("Minimum number is: " + num2);

        }
        if(b3){
            System.out.println("Minimum number is: "+ num3);
        }
    }
}
/*

Sure, here are 10 questions you can use for practice:

Introduction: Write a Java program that prints "Hello, World!" to the console.

Variables: Declare three variables: an integer, a double, and a string.
 Initialize them with the values 10, 20.5,
 and "Hello Java", respectively, and print them out.

Operators: Write a Java program that takes two integers as input,
calculates their sum, difference,
product, quotient and modulus,
and prints the results.

If Statements: Write a Java program that takes an integer as
input and prints whether it is even or odd.

Minimum Number: Write a Java program that takes three integers
as input and prints the smallest one.

Logical Operators: Write a Java program that takes two
boolean values as input, and prints the result of applying the AND,
 OR and NOT operators to them.

Post/Preconditions: Write a Java program that demonstrates the
difference between pre-increment and post-increment operators.

Unary Operators: Write a Java program that uses unary plus and minus
operators to negate an integer and a floating-point number.

Primitive Casting: Write a Java program that casts a float to an int,
and a double to a float, and prints the results.

Relation Operators: Write a Java program that takes two integers
as input and uses relation operators to compare them.
It should print whether the first number is greater than,
less than, or equal to the second number.
 */