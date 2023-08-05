package Day04;


class MyClass {
    int x;  // instance variable

    // constructor
    public MyClass() {
        x = 5;
    }
}

// In another class, create an object of MyClass.
class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();  // Create an object of MyClass
        System.out.println(myObject.x);  // Print the value of x
    }
}
