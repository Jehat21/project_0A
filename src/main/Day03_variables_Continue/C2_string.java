package Day03_variables_Continue;

public class C2_string {
    public static void main(String[] args){
        // string is non primitive
        String name="mustafa";
        String school="Schoooolll";
        String id="10";
        int idnt=10;
        System.out.println(name+" " + school);
        System.out.println("string\tid\t:\t"+id+"\tit\tid:\t"+ idnt);
        System.out.println("String\t"+id+23);
        System.out.println("gg"+ idnt+23);//
//The expression "gg" + idnt + 23 involves string concatenation.
// In Java, when the + operator is used with a string and other data types (like int),
// it converts the non-string data into a string and concatenates them.
//So if idnt is an integer and has a value,
// for example 10, then the output of System.out.println("gg" + idnt + 23);
// would be gg1023.
        int a=2;
        int b=3;
        int c=5;
        int sum=a+b+c;
        System.out.println("some of\t"+(a+b+c) );//i have to use bracket otherwise java will make these numbers into string
        System.out.println("some of\t"+a+b+c );
        System.out.println("sumof\t"+sum);

    }
}
